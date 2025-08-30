package Classes;

import gen.GrammarParser;
import gen.GrammarParserBaseVisitor;
import org.antlr.v4.runtime.Token;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class BaseVisitor extends GrammarParserBaseVisitor<ASTNode> {
    SymbolTable symbolTable = new SymbolTable();
    private boolean inFunction = false;
    private String currentFunctionName = null;

    // For tracking variable re-declarations in the same scope
    private Set<String> currentScopeDeclarations = new HashSet<>();

    // Known primitive types
    private static final Set<String> KNOWN_TYPES = Set.of(
        "string", "number", "boolean", "any", "object", "void", "null", "undefined"
    );

    // Getter for symbol table
    public SymbolTable getSymbolTable() {
        return symbolTable;
    }

    @Override
    public ASTNode visitProgramRule(GrammarParser.ProgramRuleContext ctx) {
        ProgramNode programNode = new ProgramNode();
        for (var statementCtx : ctx.statements) {
            ASTNode statement = visit(statementCtx);
            if (statement != null) programNode.addStatement(statement);
        }

        // CONTROL FLOW: Check for unused symbols at the end of program analysis
        checkForUnusedSymbols();

        return programNode;
    }

    // Statement visitors - updated to match grammar rules
    @Override
    public ASTNode visitStmtFunctionDecl(GrammarParser.StmtFunctionDeclContext ctx) {
        return visit(ctx.decl);
    }

    @Override
    public ASTNode visitStmtFunctionCall(GrammarParser.StmtFunctionCallContext ctx) {
        return visit(ctx.call);
    }

    @Override
    public ASTNode visitStmtVarDecl(GrammarParser.StmtVarDeclContext ctx) {
        return visit(ctx.vardecl);
    }

    @Override
    public ASTNode visitStmtVarAssign(GrammarParser.StmtVarAssignContext ctx) {
        return visit(ctx.varassign);
    }

    @Override
    public ASTNode visitStmtValue(GrammarParser.StmtValueContext ctx) {
        return visit(ctx.val);
    }

    @Override
    public ASTNode visitStmtHtml(GrammarParser.StmtHtmlContext ctx) {
        return visit(ctx.h);
    }

    @Override
    public ASTNode visitStmtReturn(GrammarParser.StmtReturnContext ctx) {
        return visit(ctx.ret);
    }

    @Override
    public ASTNode visitStmtIf(GrammarParser.StmtIfContext ctx) {
        return visit(ctx.ifstmt);
    }

    @Override
    public ASTNode visitStmtImport(GrammarParser.StmtImportContext ctx) {
        return visit(ctx.imp);
    }

    @Override
    public ASTNode visitStmtIteration(GrammarParser.StmtIterationContext ctx) {
        return visit(ctx.loop);
    }

    @Override
    public ASTNode visitStmtComponent(GrammarParser.StmtComponentContext ctx) {
        return visit(ctx.comp);
    }

    @Override
    public ASTNode visitStmtClass(GrammarParser.StmtClassContext ctx) {
        return visit(ctx.classDecl);
    }

    @Override
    public ASTNode visitStmtExport(GrammarParser.StmtExportContext ctx) {
        return visit(ctx.exp);
    }

    @Override
    public ASTNode visitStmtTypeDecl(GrammarParser.StmtTypeDeclContext ctx) {
        return visit(ctx.typeDecl);
    }

    @Override
    public ASTNode visitVarDeclarationRule(GrammarParser.VarDeclarationRuleContext ctx) {
        String kind = ctx.kind.getText();

        VariableDeclarationNode variableDeclarationNode = new VariableDeclarationNode(kind);

        VariableAssignNode assignNode = (VariableAssignNode) visit(ctx.assign);
        variableDeclarationNode.setAssignment(assignNode);
        GrammarParser.VariableAssignContext asign = ctx.assign;
        GrammarParser.VarAssignRuleContext varassign = (GrammarParser.VarAssignRuleContext) asign;
        String varName = varassign.varName.getText(); // Direct access from context
        Token token = varassign.varName;

        // SEMANTIC ERROR: Const must be initialized
        if (kind.equals("const") && varassign.expr == null) {
            symbolTable.addSemanticError(
                    "Const variable '" + varName + "' must be initialized at line " + token.getLine()
            );
        }

        // SEMANTIC ERROR: Variable re-declaration in the same scope
        if (symbolTable.isDeclaredInCurrentScope(varName)) {
            symbolTable.addSemanticError(
                "Variable '" + varName + "' is redeclared in the same scope at line " + token.getLine()
            );
        }

        String varType = "any";
        boolean isArrayType = false;
        if (varassign.type != null) {
            GrammarParser.TypeDefineContext typeDefine = varassign.type;
            GrammarParser.TypeDefineRuleContext Define = (GrammarParser.TypeDefineRuleContext) typeDefine;
            varType = Define.type.getText();
            isArrayType = Define.LBRACKET() != null; // Check if array type

            // Check if type is not known and not declared
            if (!KNOWN_TYPES.contains(varType)) {
                Symbol typeSymbol = symbolTable.lookupSymbol(varType);
                if (typeSymbol == null || !"type".equals(typeSymbol.getKind())) {
                    symbolTable.addSemanticError(
                        "Type '" + varType + "' used but not declared before at line " + token.getLine()
                    );
                }
            }
        }
        if (isArrayType) {
            varType = varType + "[]";
        }

        boolean declared = symbolTable.declareSymbol(
                varName,
                varType,
                kind,
                token.getLine(),
                token.getCharPositionInLine()
        );

        // SEMANTIC ERROR: Type mismatch between declared type and assigned value
        if (varassign.expr != null && varassign.type != null) {
            ValueNode assignedValue = (ValueNode) visit(varassign.expr);
            String assignedType = getValueType(assignedValue);

            // If declared type is array, assigned type must also be array of same type
            if (isArrayType) {
                if (!assignedType.endsWith("[]")) {
                    symbolTable.addSemanticError(
                        "Type mismatch: variable '" + varName + "' declared as '" + varType + "' but assigned value of type '" + assignedType + "' at line " + token.getLine()
                    );
                } else {
                    // Compare base type
                    String declaredBase = varType.substring(0, varType.length() - 2);
                    String assignedBase = assignedType.substring(0, assignedType.length() - 2);
                    if (!declaredBase.equals("any") && !assignedBase.equals("any") && !declaredBase.equals(assignedBase)) {
                        symbolTable.addSemanticError(
                            "Type mismatch: variable '" + varName + "' declared as '" + varType + "' but assigned value of type '" + assignedType + "' at line " + token.getLine()
                        );
                    }
                    
                    // If assigned value is an array literal, validate each element against the declared type
                    if (assignedValue != null && assignedValue.getPrimaryValue() instanceof ArrayNode) {
                        ArrayNode arrayNode = (ArrayNode) assignedValue.getPrimaryValue();
                        String baseType = declaredBase;
                        
                        // Check if base type is a user-defined type
                        if (!KNOWN_TYPES.contains(baseType)) {
                            Symbol typeSymbol = symbolTable.lookupSymbol(baseType);
                            if (typeSymbol != null && "type".equals(typeSymbol.getKind())) {
                                // Validate each array element against the declared type
                                for (int i = 0; i < arrayNode.getElements().size(); i++) {
                                    ValueNode element = arrayNode.getElements().get(i);
                                    String elementType = getValueType(element);
                                    
                                    if (element.getPrimaryValue() instanceof ObjectNode) {
                                        // Validate object literal against declared type
                                        ObjectNode objElement = (ObjectNode) element.getPrimaryValue();
                                        ASTNode typeAst = typeSymbol.getAstNode();
                                        if (typeAst instanceof TypeDeclarationNode) {
                                            TypeDeclarationNode typeDeclNode = (TypeDeclarationNode) typeAst;
                                            TypeDeclarationValueNode typeValueNode = typeDeclNode.getTypeValue();
                                            if (typeValueNode.isObjectType()) {
                                                TypeObjectNode declaredObj = typeValueNode.getTypeObject();
                                                validateObjectAgainstType(objElement, declaredObj, "array element " + i, token.getLine());
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                // If declared type is a user-defined type (object type), check object structure
                if (!varType.equals("any") && !assignedType.equals("unknown") && !varType.equals(assignedType)) {
                    // If declared type is a user-defined type (not primitive)
                    if (!KNOWN_TYPES.contains(varType) && !varType.endsWith("[]")) {
                        Symbol typeSymbol = symbolTable.lookupSymbol(varType);
                        if (typeSymbol != null && "type".equals(typeSymbol.getKind())) {
                            // Check if assignedValue is an object literal
                            if (assignedValue != null && assignedValue.getPrimaryValue() instanceof ObjectNode) {
                                ObjectNode assignedObj = (ObjectNode) assignedValue.getPrimaryValue();
                                // Get declared type structure
                                TypeDeclarationNode typeDeclNode = null;
                                ASTNode typeAst = typeSymbol.getAstNode();
                                if (typeAst instanceof TypeDeclarationNode) {
                                    typeDeclNode = (TypeDeclarationNode) typeAst;
                                }
                                if (typeDeclNode != null) {
                                    TypeDeclarationValueNode typeValueNode = typeDeclNode.getTypeValue();
                                    if (typeValueNode.isObjectType()) {
                                        TypeObjectNode declaredObj = typeValueNode.getTypeObject();
                                        // Compare structure
                                        List<String> missing = new ArrayList<>();
                                        List<String> typeMismatch = new ArrayList<>();
                                        // Check for missing properties
                                        for (TypeMemberNode member : declaredObj.getTypeMembers()) {
                                            PropertyNode prop = assignedObj.getProperty(member.getName());
                                            if (prop == null) {
                                                missing.add(member.getName());
                                            } else {
                                                // Check type of property
                                                String expectedType = member.getType().getName();
                                                String actualType = getValueType(prop.getValue());
                                                if (!expectedType.equals("any") && !actualType.equals("any") && !expectedType.equals(actualType)) {
                                                    typeMismatch.add(member.getName() + " (expected " + expectedType + ", got " + actualType + ")");
                                                }
                                            }
                                        }
                                        // Check for extra properties (not in declared type)
                                        List<String> extra = new ArrayList<>();
                                        for (PropertyNode prop : assignedObj.getProperties()) {
                                            boolean found = false;
                                            for (TypeMemberNode member : declaredObj.getTypeMembers()) {
                                                if (member.getName().equals(prop.getKey())) {
                                                    found = true;
                                                    break;
                                                }
                                            }
                                            if (!found) {
                                                extra.add(prop.getKey());
                                            }
                                        }
                                        if (!missing.isEmpty() || !typeMismatch.isEmpty() || !extra.isEmpty()) {
                                            StringBuilder sb = new StringBuilder();
                                            sb.append("Type mismatch: variable '").append(varName)
                                              .append("' declared as '").append(varType)
                                              .append("' but assigned object literal with property issues at line ")
                                              .append(token.getLine()).append(": ");
                                            if (!missing.isEmpty()) {
                                                sb.append("missing [").append(String.join(", ", missing)).append("]");
                                            }
                                            if (!typeMismatch.isEmpty()) {
                                                if (!missing.isEmpty()) sb.append("; ");
                                                sb.append("type mismatch in [").append(String.join(", ", typeMismatch)).append("]");
                                            }
                                            if (!extra.isEmpty()) {
                                                if (!missing.isEmpty() || !typeMismatch.isEmpty()) sb.append("; ");
                                                sb.append("extra properties [").append(String.join(", ", extra)).append("] not in type definition");
                                            }
                                            symbolTable.addSemanticError(sb.toString());
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                    symbolTable.addSemanticError(
                        "Type mismatch: variable '" + varName + "' declared as '" + varType + "' but assigned value of type '" + assignedType + "' at line " + token.getLine()
                    );
                    }
                }
            }
        }

        if (varassign.expr != null && declared) {
            Symbol symbol = symbolTable.lookupSymbol(varName);
            if (symbol != null) {
                symbol.setInitialized(true);
            }
        }

        return variableDeclarationNode;
    }

    @Override
    public ASTNode visitVarAssignRule(GrammarParser.VarAssignRuleContext ctx) {
        VariableAssignNode variableAssignNode = new VariableAssignNode(ctx.varName.getText());
        boolean isArrayType = false;
        String declaredType = "any";
        if (ctx.type != null) {
            TypeDefineNode typeNode = (TypeDefineNode) visit(ctx.type);
            variableAssignNode.setType(typeNode);
            declaredType = typeNode.getName();
            isArrayType = typeNode.isArray();
            if (isArrayType) {
                declaredType = declaredType + "[]";
            }
            // Check if type is not known and not declared
            if (!KNOWN_TYPES.contains(typeNode.getName())) {
                Symbol typeSymbol = symbolTable.lookupSymbol(typeNode.getName());
                if (typeSymbol == null || !"type".equals(typeSymbol.getKind())) {
                    symbolTable.addSemanticError(
                        "Type '" + typeNode.getName() + "' used but not declared before at line " + ctx.varName.getLine()
                    );
                }
            }
        }
        if (ctx.expr != null) {
            variableAssignNode.setValue((ValueNode) visit(ctx.expr));
        }

        Symbol symbol = symbolTable.lookupSymbol(ctx.varName.getText());
        if (symbol != null) {
            // SEMANTIC ERROR: Assignment to constant variable
            if ("const".equals(symbol.getKind())) {
                symbolTable.addSemanticError("Cannot assign to constant variable '" + ctx.varName.getText() + "' at line " + ctx.varName.getLine());
            }
            // SEMANTIC ERROR: Type mismatch on assignment
            if (ctx.expr != null && symbol.getType() != null && !"any".equals(symbol.getType())) {
                ValueNode assignedValue = (ValueNode) visit(ctx.expr);
                String assignedType = getValueType(assignedValue);

                if (symbol.getType().endsWith("[]")) {
                    // Declared as array, assigned must be array
                    if (!assignedType.endsWith("[]")) {
                        symbolTable.addSemanticError(
                                "Type mismatch: variable '" + ctx.varName.getText() + "' is of type '" + symbol.getType() + "' but assigned value of type '" + assignedType + "' at line " + ctx.varName.getLine()
                        );
                    } else {
                        // Compare base type
                        String declaredBase = symbol.getType().substring(0, symbol.getType().length() - 2);
                        String assignedBase = assignedType.substring(0, assignedType.length() - 2);
                        if (!declaredBase.equals("any") && !assignedBase.equals("any") && !declaredBase.equals(assignedBase)) {
                            symbolTable.addSemanticError(
                                    "Type mismatch: variable '" + ctx.varName.getText() + "' is of type '" + symbol.getType() + "' but assigned value of type '" + assignedType + "' at line " + ctx.varName.getLine()
                            );
                        }
                        
                        // If assigned value is an array literal, validate each element against the declared type
                        if (assignedValue != null && assignedValue.getPrimaryValue() instanceof ArrayNode) {
                            ArrayNode arrayNode = (ArrayNode) assignedValue.getPrimaryValue();
                            String baseType = declaredBase;
                            
                            // Check if base type is a user-defined type
                            if (!KNOWN_TYPES.contains(baseType)) {
                                Symbol typeSymbol = symbolTable.lookupSymbol(baseType);
                                if (typeSymbol != null && "type".equals(typeSymbol.getKind())) {
                                    // Validate each array element against the declared type
                                    for (int i = 0; i < arrayNode.getElements().size(); i++) {
                                        ValueNode element = arrayNode.getElements().get(i);
                                        String elementType = getValueType(element);
                                        
                                        if (element.getPrimaryValue() instanceof ObjectNode) {
                                            // Validate object literal against declared type
                                            ObjectNode objElement = (ObjectNode) element.getPrimaryValue();
                                            ASTNode typeAst = typeSymbol.getAstNode();
                                            if (typeAst instanceof TypeDeclarationNode) {
                                                TypeDeclarationNode typeDeclNode = (TypeDeclarationNode) typeAst;
                                                TypeDeclarationValueNode typeValueNode = typeDeclNode.getTypeValue();
                                                if (typeValueNode.isObjectType()) {
                                                    TypeObjectNode declaredObj = typeValueNode.getTypeObject();
                                                    validateObjectAgainstType(objElement, declaredObj, "array element " + i, ctx.varName.getLine());
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    // If declared type is a user-defined type (object type), check object structure
                    if (!symbol.getType().equals("any") && !assignedType.equals("unknown") && !symbol.getType().equals(assignedType)) {
                        if (!KNOWN_TYPES.contains(symbol.getType()) && !symbol.getType().endsWith("[]")) {
                            Symbol typeSymbol = symbolTable.lookupSymbol(symbol.getType());
                            if (typeSymbol != null && "type".equals(typeSymbol.getKind())) {
                                // Check if assignedValue is an object literal
                                if (assignedValue != null && assignedValue.getPrimaryValue() instanceof ObjectNode) {
                                    ObjectNode assignedObj = (ObjectNode) assignedValue.getPrimaryValue();
                                    // Get declared type structure
                                    TypeDeclarationNode typeDeclNode = (TypeDeclarationNode) typeSymbol.getAstNode();
                                    if (typeDeclNode != null) {
                                        TypeDeclarationValueNode typeValueNode = typeDeclNode.getTypeValue();
                                        if (typeValueNode.isObjectType()) {
                                            TypeObjectNode declaredObj = typeValueNode.getTypeObject();
                                            // Compare structure
                                            List<String> missing = new ArrayList<>();
                                            List<String> typeMismatch = new ArrayList<>();
                                            // Check for missing properties
                                            for (TypeMemberNode member : declaredObj.getTypeMembers()) {
                                                PropertyNode prop = assignedObj.getProperty(member.getName());
                                                if (prop == null) {
                                                    missing.add(member.getName());
                                                } else {
                                                    // Check type of property
                                                    String expectedType = member.getType().getName();
                                                    String actualType = getValueType(prop.getValue());
                                                    if (!expectedType.equals("any") && !actualType.equals("any") && !expectedType.equals(actualType)) {
                                                        typeMismatch.add(member.getName() + " (expected " + expectedType + ", got " + actualType + ")");
                                                    }
                                                }
                                            }
                                            // Check for extra properties (not in declared type)
                                            List<String> extra = new ArrayList<>();
                                            for (PropertyNode prop : assignedObj.getProperties()) {
                                                boolean found = false;
                                                for (TypeMemberNode member : declaredObj.getTypeMembers()) {
                                                    if (member.getName().equals(prop.getKey())) {
                                                        found = true;
                                                        break;
                                                    }
                                                }
                                                if (!found) {
                                                    extra.add(prop.getKey());
                                                }
                                            }
                                            if (!missing.isEmpty() || !typeMismatch.isEmpty() || !extra.isEmpty()) {
                                                StringBuilder sb = new StringBuilder();
                                                sb.append("Type mismatch: variable '").append(ctx.varName.getText())
                                                  .append("' is of type '").append(symbol.getType())
                                                  .append("' but assigned object literal with property issues at line ")
                                                  .append(ctx.varName.getLine()).append(": ");
                                                if (!missing.isEmpty()) {
                                                    sb.append("missing [").append(String.join(", ", missing)).append("]");
                                                }
                                                if (!typeMismatch.isEmpty()) {
                                                    if (!missing.isEmpty()) sb.append("; ");
                                                    sb.append("type mismatch in [").append(String.join(", ", typeMismatch)).append("]");
                                                }
                                                if (!extra.isEmpty()) {
                                                    if (!missing.isEmpty() || !typeMismatch.isEmpty()) sb.append("; ");
                                                    sb.append("extra properties [").append(String.join(", ", extra)).append("] not in type definition");
                                                }
                                                symbolTable.addSemanticError(sb.toString());
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                        symbolTable.addSemanticError(
                                "Type mismatch: variable '" + ctx.varName.getText() + "' is of type '" + symbol.getType() + "' but assigned value of type '" + assignedType + "' at line " + ctx.varName.getLine()
                        );
                        }
                    }
                }
            }
        }

        return variableAssignNode;
    }

    @Override
    public ASTNode visitTypeDefineRule(GrammarParser.TypeDefineRuleContext ctx) {
        // Check if type is not known and not declared
        String typeName = ctx.type.getText();
        if (!KNOWN_TYPES.contains(typeName)) {
            Symbol typeSymbol = symbolTable.lookupSymbol(typeName);
            if (typeSymbol == null || !"type".equals(typeSymbol.getKind())) {
                symbolTable.addSemanticError(
                    "Type '" + typeName + "' used but not declared before at line " + ctx.type.getLine()
                );
            }
        }
        return new TypeDefineNode(typeName, ctx.LBRACKET() != null);
    }

    @Override
    public ASTNode visitTypeDeclarationRule(GrammarParser.TypeDeclarationRuleContext ctx) {
        String typeName = ctx.name.getText();
        Token token = ctx.name;

        // SEMANTIC ERROR: Type re-declaration in the same scope
        if (symbolTable.isDeclaredInCurrentScope(typeName)) {
            symbolTable.addSemanticError(
                "Type '" + typeName + "' is redeclared in the same scope at line " + token.getLine()
            );
        }

        // Declare type in symbol table
        symbolTable.declareSymbol(typeName, "type", "type", token.getLine(), token.getCharPositionInLine());

        ASTNode typeValueNode = visit(ctx.typeValue);
        TypeDeclarationValueNode typeValue;
        
        // Handle different types of type values
        if (typeValueNode instanceof TypeDeclarationValueNode) {
            typeValue = (TypeDeclarationValueNode) typeValueNode;
        } else if (typeValueNode instanceof TypeObjectNode) {
            // Convert TypeObjectNode to TypeDeclarationValueNode
            TypeObjectNode objNode = (TypeObjectNode) typeValueNode;
            typeValue = new TypeDeclarationValueNode(objNode);
        } else {
            // Fallback for unknown types
            typeValue = new TypeDeclarationValueNode("any", false);
        }
        
        // Save AST node for type in symbol for later structure checking
        Symbol typeSymbol = symbolTable.lookupSymbol(typeName);
        if (typeSymbol != null) {
            typeSymbol.setAstNode(new TypeDeclarationNode(typeName, typeValue));
        }
        return new TypeDeclarationNode(typeName, typeValue);
    }

    @Override
    public ASTNode visitTypeSimple(GrammarParser.TypeSimpleContext ctx) {
        // Check if type is not known and not declared
        String typeName = ctx.type.getText();
        if (!KNOWN_TYPES.contains(typeName)) {
            Symbol typeSymbol = symbolTable.lookupSymbol(typeName);
            if (typeSymbol == null || !"type".equals(typeSymbol.getKind())) {
                symbolTable.addSemanticError(
                    "Type '" + typeName + "' used but not declared before at line " + ctx.type.getLine()
                );
            }
        }
        return new TypeDeclarationValueNode(typeName, ctx.LBRACKET() != null);
    }

    @Override
    public ASTNode visitTypeObjectAssign(GrammarParser.TypeObjectAssignContext ctx) {
        return visit(ctx.obj);
    }

    @Override
    public ASTNode visitTypeObjectRule(GrammarParser.TypeObjectRuleContext ctx) {
        TypeObjectNode typeObjectNode = new TypeObjectNode();
        Set<String> memberNames = new HashSet<>();

        for (GrammarParser.TypeMemberContext memberCtx : ctx.typeMembers) {
            TypeMemberNode member = (TypeMemberNode) visit(memberCtx);

            // SEMANTIC ERROR: Duplicate member name in type object
            if (memberNames.contains(member.getName())) {
                symbolTable.addSemanticError(
                    "Duplicate member name '" + member.getName() + "' in type object at line " + ctx.getStart().getLine()
                );
            }
            memberNames.add(member.getName());

            typeObjectNode.addTypeMember(member);
        }

        return typeObjectNode;
    }

    @Override
    public ASTNode visitTypeMemberRule(GrammarParser.TypeMemberRuleContext ctx) {
        String memberName = ctx.name.getText();
        TypeDeclarationValueNode memberType = (TypeDeclarationValueNode) visit(ctx.type);
        return new TypeMemberNode(memberName, memberType);
    }

    @Override
    public ASTNode visitAsTypeRule(GrammarParser.AsTypeRuleContext ctx) {
        // Check if type is not known and not declared
        String typeName = ctx.type.getText();
        if (!KNOWN_TYPES.contains(typeName)) {
            Symbol typeSymbol = symbolTable.lookupSymbol(typeName);
            if (typeSymbol == null || !"type".equals(typeSymbol.getKind())) {
                symbolTable.addSemanticError(
                    "Type '" + typeName + "' used but not declared before at line " + ctx.type.getLine()
                );
            }
        }
        return new TypeNode(typeName, ctx.LBRACKET() != null);
    }

    @Override
    public ASTNode visitReturnRule(GrammarParser.ReturnRuleContext ctx) {
        if (!inFunction) {
            symbolTable.addSemanticError("Return statement outside function at line " + ctx.getStart().getLine());
        }

        ReturnNode returnNode = new ReturnNode();
        if (ctx.expr != null) {
            returnNode.value = visit(ctx.expr);
        }
        // SEMANTIC ERROR: Return type mismatch
        if (inFunction && currentFunctionName != null) {
            Symbol functionSymbol = symbolTable.lookupSymbol(currentFunctionName);
            if (functionSymbol != null && functionSymbol.getType() != null && !"any".equals(functionSymbol.getType()) && ctx.expr != null) {
                String returnType = functionSymbol.getType();
                String actualType = getValueType((ValueNode) returnNode.value);

                // Enhanced return type checking with better error messages
                if (!isCompatibleType(returnType, actualType)) {
                    symbolTable.addSemanticError(
                        "Function '" + currentFunctionName + "' must return '" + returnType + 
                        "' but returned '" + actualType + "' at line " + ctx.getStart().getLine()
                    );
                }
            }
        }
        return returnNode;
    }

    @Override
    public ASTNode visitBinaryValue(GrammarParser.BinaryValueContext ctx) {
        ValueNode left = (ValueNode) visit(ctx.left);
        ValueNode right = (ValueNode) visit(ctx.right);
        String op = ctx.op.getText();

        String leftType = getValueType(left);
        String rightType = getValueType(right);

        if (!isValidBinaryOperation(leftType, rightType, op)) {
            symbolTable.addSemanticError("Invalid binary operation: " + leftType + " " + op + " " + rightType +
                    " at line " + ctx.getStart().getLine());
        }
        // SEMANTIC ERROR: Division by zero
        if (op.equals("/") && right instanceof ValueNode) {
            if (right.getPrimaryValue() instanceof NumberNode) {
                try {
                    double val = Double.parseDouble(((NumberNode) right.getPrimaryValue()).getValue());
                    if (val == 0.0) {
                        symbolTable.addControlFlowError("Division by zero detected", ctx.getStart().getLine(), 0);
                    }
                } catch (NumberFormatException e) {
                    // ignore, not a constant number
                }
            }
        }
        
        // CONTROL FLOW: Check for potential division by zero with variables
        if (op.equals("/")) {
            checkForDivisionByZero(new OperatorExpressionNode(left, op, right), ctx.getStart().getLine());
        }
        OperatorExpressionNode opExpr = new OperatorExpressionNode(left, op, right);
        ValueNode node = new ValueNode(left.getPrimaryValue());
        node.setOperatorExpression(opExpr);
        return node;
    }

    @Override
    public ASTNode visitPrimaryValueExpr(GrammarParser.PrimaryValueExprContext ctx) {
        ASTNode visitedNode = visit(ctx.pv);
        ValueNode valueNode;
        
        if (visitedNode instanceof PrimaryValueNode) {
            // Normal case: primary value is a PrimaryValueNode
            valueNode = new ValueNode((PrimaryValueNode) visitedNode);
        } else if (visitedNode instanceof ValueNode) {
            // Special case: primary value is already a ValueNode (e.g., from negation)
            valueNode = (ValueNode) visitedNode;
        } else {
            // Fallback: create a wrapper ValueNode
            valueNode = new ValueNode((PrimaryValueNode) visitedNode);
        }

        if (ctx.qm != null) {
            valueNode.setModifier(ctx.qm.getText());
        }

        if (ctx.type != null) {
            valueNode.setAsType((TypeNode) visit(ctx.type));
        }

        return valueNode;
    }

    @Override
    public ASTNode visitNumberValue(GrammarParser.NumberValueContext ctx) {
        if (ctx.num != null) return new NumberNode(ctx.num.getText());
        return null;
    }

    @Override
    public ASTNode visitStringValue(GrammarParser.StringValueContext ctx) {
        if (ctx.str != null) return new StringNode(ctx.str.getText().replaceAll("^\"|\"$", ""));
        return null;
    }

    @Override
    public ASTNode visitCallValue(GrammarParser.CallValueContext ctx) {
        return visit(ctx.call);
    }

    @Override
    public ASTNode visitIdValue(GrammarParser.IdValueContext ctx) {
        String varName = ctx.id.getText();

        // SEMANTIC ERROR: Check for undefined variables
        Symbol symbol = symbolTable.lookupSymbol(varName);
        if (symbol == null) {
            symbolTable.addSemanticError("Undefined variable '" + varName + "' at line " +
                    ctx.id.getLine());
        } else {
            symbol.setUsed(true);

            // SEMANTIC ERROR: Check for uninitialized variable usage
            // Skip this check for component properties (const kind) as they are initialized by the component
            if (!symbol.isInitialized() && !symbol.getKind().equals("parameter") && !symbol.getKind().equals("const")) {
                symbolTable.addSemanticError("Variable '" + varName + "' used before initialization at line " +
                        ctx.id.getLine());
            }
        }

        return new IdentifierNode(varName);
    }

    @Override
    public ASTNode visitParenValue(GrammarParser.ParenValueContext ctx) {
        return new ParenthesizedValueNode((ValueNode) visit(ctx.inner));
    }

    @Override
    public ASTNode visitPropertyAccessValue(GrammarParser.PropertyAccessValueContext ctx) {
        ASTNode left = visit(ctx.left);
        ASTNode right = visit(ctx.right);
        
        // SEMANTIC ERROR: Check if left is an array/object for property access
        if (left instanceof ValueNode) {
            String leftType = getValueType((ValueNode) left);
            if (right instanceof IdentifierNode) {
                String propertyName = ((IdentifierNode) right).getName();
                
                // Check if the property access is valid based on the left side type
                if (leftType.equals("string")) {
                    // String properties
                    if (propertyName.equals("map") || propertyName.equals("forEach")) {
                        symbolTable.addSemanticError("Cannot use '" + propertyName + "' on string type at line " + 
                            ctx.getStart().getLine());
                    }
                } else if (leftType.endsWith("[]")) {
                    // Array properties - validate array methods
                    if (!isValidArrayMethod(propertyName)) {
                        symbolTable.addSemanticError("Property '" + propertyName + "' is not valid for array type at line " + 
                            ctx.getStart().getLine());
                    }
                } else if (leftType.equals("object") || leftType.equals("any") || leftType.equals("unknown")) {
                    // Object properties - allow any property access for now
                    // Could be enhanced to check against declared object types
                } else if (!leftType.equals("any") && !leftType.equals("unknown")) {
                    // For other specific types, check if they support property access
                    if (!isValidPropertyAccess(leftType, propertyName)) {
                        symbolTable.addSemanticError("Property '" + propertyName + "' is not valid for type '" + leftType + "' at line " + 
                            ctx.getStart().getLine());
                    }
                }
            }
        }
        
        PropertyAccessValueNode propAccess = new PropertyAccessValueNode(left, right);
        return new ValueNode(propAccess);
    }

    @Override
    public ASTNode visitMethodCallValue(GrammarParser.MethodCallValueContext ctx) {
        ASTNode left = visit(ctx.left);
        List<ASTNode> args = new ArrayList<>();
        
        for (var argCtx : ctx.args) {
            args.add(visit(argCtx));
        }
        
        // SEMANTIC ERROR: Check if method is called on appropriate type
        if (left instanceof ValueNode) {
            String leftType = getValueType((ValueNode) left);
            
            // Extract method name from property access
            String methodName = null;
            if (left instanceof PropertyAccessValueNode) {
                PropertyAccessValueNode propAccess = (PropertyAccessValueNode) left;
                if (propAccess.getRight() instanceof IdentifierNode) {
                    methodName = ((IdentifierNode) propAccess.getRight()).getName();
                }
            }
            
            if (methodName != null) {
                if (leftType.equals("string")) {
                    // String methods
                    if (methodName.equals("map") || methodName.equals("forEach")) {
                        symbolTable.addSemanticError("Cannot use '" + methodName + "' on string type at line " + 
                            ctx.getStart().getLine());
                    }
                } else if (leftType.endsWith("[]")) {
                    // Array methods - validate array methods
                    if (!isValidArrayMethod(methodName)) {
                        symbolTable.addSemanticError("Method '" + methodName + "' is not valid for array type at line " + 
                            ctx.getStart().getLine());
                    }
                } else if (leftType.equals("object") || leftType.equals("any") || leftType.equals("unknown")) {
                    // Object methods - allow any method call for now
                    // Could be enhanced to check against declared object types
                } else if (!leftType.equals("any") && !leftType.equals("unknown")) {
                    // For other specific types, check if they support the method
                    if (!isValidMethodCall(leftType, methodName)) {
                        symbolTable.addSemanticError("Method '" + methodName + "' is not valid for type '" + leftType + "' at line " + 
                            ctx.getStart().getLine());
                    }
                }
            }
        }
        
        MethodCallValueNode methodCall = new MethodCallValueNode(left, args);
        return new ValueNode(methodCall);
    }

    @Override
    public ASTNode visitArrowFunctionValue(GrammarParser.ArrowFunctionValueContext ctx) {
        List<String> params = new ArrayList<>();
        
        // Enter a new scope for the arrow function parameters
        symbolTable.enterScope("arrow_function");
        
        for (var paramCtx : ctx.params) {
            String paramName = paramCtx.getText();
            params.add(paramName);
            // Declare the parameter in the arrow function scope
            symbolTable.declareSymbol(paramName, "any", "parameter", paramCtx.getLine(), paramCtx.getCharPositionInLine());
        }
        
        ASTNode body = visit(ctx.body);
        
        // Exit the arrow function scope
        symbolTable.exitScope();
        
        ArrowFunctionValueNode arrowFunc = new ArrowFunctionValueNode(params, body);
        return new ValueNode(arrowFunc);
    }

    @Override
    public ASTNode visitNestedTemplateInterpolation(GrammarParser.NestedTemplateInterpolationContext ctx) {
        List<ASTNode> nested = new ArrayList<>();
        for (var nestedCtx : ctx.nested) {
            nested.add(visit(nestedCtx));
        }
        
        return new NestedTemplateInterpolationNode(nested);
    }

    @Override
    public ASTNode visitObjectValue(GrammarParser.ObjectValueContext ctx) {
        return visit(ctx.obj);
    }

    @Override
    public ASTNode visitArrayValue(GrammarParser.ArrayValueContext ctx) {
        return visit(ctx.arr);
    }

    @Override
    public ASTNode visitArrayAccessValue(GrammarParser.ArrayAccessValueContext ctx) {
        return visit(ctx.access);
    }

    @Override
    public ASTNode visitFunctionValue(GrammarParser.FunctionValueContext ctx) {
        return visit(ctx.body);
    }

    @Override
    public ASTNode visitIncValue(GrammarParser.IncValueContext ctx) {
        return visit(ctx.inc);
    }

    @Override
    public ASTNode visitDecValue(GrammarParser.DecValueContext ctx) {
        return visit(ctx.dec);
    }

    @Override
    public ASTNode visitNegationValue(GrammarParser.NegationValueContext ctx) {
        ASTNode rightValue = visit(ctx.right);
        if (rightValue instanceof ValueNode) {
            ValueNode valueNode = (ValueNode) rightValue;
            valueNode.setModifier("!");
            return valueNode;
        } else {
            // Create a new ValueNode with the negation modifier
            ValueNode negatedValue = new ValueNode((PrimaryValueNode) rightValue);
            negatedValue.setModifier("!");
            return negatedValue;
        }
    }

    @Override
    public ASTNode visitTemplateValue(GrammarParser.TemplateValueContext ctx) {
        TemplateLiteralNode node = new TemplateLiteralNode();
        for (var htmlCtx : ctx.content) {
            node.addPart(visit(htmlCtx));
        }
        return node;
    }

    @Override
    public ASTNode visitArrayRule(GrammarParser.ArrayRuleContext ctx) {
        ArrayNode arrayNode = new ArrayNode();
        for (GrammarParser.ValueContext valueCtx : ctx.elems) {
            arrayNode.addElement((ValueNode) visit(valueCtx));
        }
        // SEMANTIC ERROR: Array with mixed types (if not allowed)
        if (arrayNode.getElements().size() > 1) {
            String firstType = getValueType(arrayNode.getElements().get(0));
            boolean isArray = false;
            if (firstType.endsWith("[]")) {
                isArray = true;
                firstType = firstType.substring(0, firstType.length() - 2);
            }
            for (ValueNode elem : arrayNode.getElements()) {
                String elemType = getValueType(elem);
                boolean elemIsArray = false;
                if (elemType.endsWith("[]")) {
                    elemIsArray = true;
                    elemType = elemType.substring(0, elemType.length() - 2);
                }
                if (isArray != elemIsArray || (!firstType.equals("any") && !elemType.equals("any") && !firstType.equals(elemType))) {
                    symbolTable.addSemanticError("Array contains mixed types: '" + firstType + "' and '" + elemType + "'");
                    break;
                }
            }
        }
        return arrayNode;
    }

    @Override
    public ASTNode visitObjectRule(GrammarParser.ObjectRuleContext ctx) {
        ObjectNode objectNode = new ObjectNode();
        Set<String> keys = new HashSet<>();
        for (GrammarParser.PairContext pairCtx : ctx.pairs) {
            GrammarParser.PairRuleContext pair = (GrammarParser.PairRuleContext) pairCtx;
            String key = pair.key.getText();
            ValueNode valueNode = (ValueNode) visit(pair.val);
            // SEMANTIC ERROR: Duplicate key in object literal
            if (keys.contains(key)) {
                symbolTable.addSemanticError("Duplicate key '" + key + "' in object literal at line " + pair.key.getLine());
            }
            keys.add(key);
            objectNode.addProperty(new PropertyNode(key, valueNode));
        }
        return objectNode;
    }

    @Override
    public ASTNode visitPairRule(GrammarParser.PairRuleContext ctx) {
        String key = ctx.key.getText();
        ValueNode value = (ValueNode) visit(ctx.val);
        return new PropertyNode(key, value);
    }

    @Override
    public ASTNode visitArrayAccessRule(GrammarParser.ArrayAccessRuleContext ctx) {
        String arrayName = ctx.arr.getText();
        ValueNode index = (ValueNode) visit(ctx.idx);

        // SEMANTIC ERROR: Accessing non-array variable as array
        Symbol symbol = symbolTable.lookupSymbol(arrayName);
        if (symbol != null && symbol.getType() != null && !"any".equals(symbol.getType()) && !symbol.getType().endsWith("[]")) {
            symbolTable.addSemanticError("Variable '" + arrayName + "' is not an array but is accessed as one at line " + ctx.arr.getLine());
        }
        // SEMANTIC ERROR: Array index is not a number
        String idxType = getValueType(index);
        if (!"number".equals(idxType) && !"any".equals(idxType)) {
            symbolTable.addSemanticError("Array index must be a number, got '" + idxType + "' at line " + ctx.idx.getStart().getLine());
        }
        return new ArrayAccessNode(arrayName, index);
    }

    @Override
    public ASTNode visitImportRule(GrammarParser.ImportRuleContext ctx) {
        String source = ctx.path.getText().replaceAll("^\"|\"$", "");
        ImportNode importNode = new ImportNode(source);

        if (ctx.def != null) {
            GrammarParser.DefaultImportContext importContext = ctx.def;
            GrammarParser.DefaultImportRuleContext defaultImportRuleContext = (GrammarParser.DefaultImportRuleContext) importContext;
            String importName = defaultImportRuleContext.id.getText();
            Token token = defaultImportRuleContext.id;

            // SEMANTIC ERROR: Importing with reserved word
            if (isReservedWord(importName)) {
                symbolTable.addSemanticError("Cannot import with reserved word '" + importName + "' at line " + token.getLine());
            }

            // Declare imported symbol
            symbolTable.declareSymbol(importName, "imported", "import", token.getLine(), token.getCharPositionInLine());
            Symbol symbol = symbolTable.lookupSymbol(importName);
            if (symbol != null) {
                symbol.setInitialized(true);
            }

            importNode.addImport(importName);
            importNode.setDefaultImport(true);
        }

        if (ctx.named != null) {
            GrammarParser.NamedImportsContext importContext = ctx.named;
            GrammarParser.NamedImportsRuleContext namedImportsRuleContext = (GrammarParser.NamedImportsRuleContext) importContext;
            importNode.setHtmlImport(namedImportsRuleContext.LBRACE_HTML() != null);
            for (GrammarParser.ImportSpecifierContext spec : namedImportsRuleContext.imports) {
                GrammarParser.ImportSpecifierRuleContext specifierRuleContext = (GrammarParser.ImportSpecifierRuleContext) spec ;
                String importName = specifierRuleContext.name.getText();
                Token token = specifierRuleContext.name;

                // SEMANTIC ERROR: Importing with reserved word
                if (isReservedWord(importName)) {
                    symbolTable.addSemanticError("Cannot import with reserved word '" + importName + "' at line " + token.getLine());
                }

                // Declare imported symbol
                symbolTable.declareSymbol(importName, "imported", "import", token.getLine(), token.getCharPositionInLine());
                Symbol symbol = symbolTable.lookupSymbol(importName);
                if (symbol != null) {
                    symbol.setInitialized(true);
                }

                importNode.addImport(importName);
            }
        }
        return importNode;
    }

    @Override
    public ASTNode visitDefaultImportRule(GrammarParser.DefaultImportRuleContext ctx) {
        return null; // This is handled in importRule
    }

    @Override
    public ASTNode visitNamedImportsRule(GrammarParser.NamedImportsRuleContext ctx) {
        return null; // This is handled in importRule
    }

    @Override
    public ASTNode visitImportSpecifierRule(GrammarParser.ImportSpecifierRuleContext ctx) {
        return null; // This is handled in importRule
    }

    @Override
    public ASTNode visitExportRule(GrammarParser.ExportRuleContext ctx) {
        ExportNode exportNode = new ExportNode();

        if (ctx.cls != null) {
            exportNode.setExportValue((ClassNode) visit(ctx.cls));
            exportNode.setExportType("class");
        } else if (ctx.val != null) {
            exportNode.setExportValue((ValueNode) visit(ctx.val));
            exportNode.setExportType("value");
        } else if (ctx.func != null) {
            exportNode.setExportValue((FunctionDeclarationNode) visit(ctx.func));
            exportNode.setExportType("function");
        }
        return exportNode;
    }

    @Override
    public ASTNode visitClassDeclarationRule(GrammarParser.ClassDeclarationRuleContext ctx) {
        String className = ctx.name.getText();
        Token token = ctx.name;

        // SEMANTIC ERROR: Class re-declaration in the same scope
        if (symbolTable.isDeclaredInCurrentScope(className)) {
            symbolTable.addSemanticError("Class '" + className + "' is redeclared in the same scope at line " + token.getLine());
        }

        // Declare class in symbol table
        symbolTable.declareSymbol(className, "class", "class", token.getLine(), token.getCharPositionInLine());

        // Enter class scope
        symbolTable.enterScope(className);

        ClassNode classNode = new ClassNode(className);
        GrammarParser.ClassBodyContext Body = ctx.body;
        GrammarParser.ClassBodyRuleContext bodyRuleContext = (GrammarParser.ClassBodyRuleContext) Body;

        for (GrammarParser.ClassBodyStatementContext stmtCtx : bodyRuleContext.stmts) {
            ASTNode member = visit(stmtCtx);
            if (member instanceof VariableDeclarationNode) classNode.addField((VariableDeclarationNode) member);
            else if (member instanceof FunctionDeclarationNode) classNode.addMethod((FunctionDeclarationNode) member);
            else classNode.addOtherMember(member);
        }

        // Exit class scope
        symbolTable.exitScope();

        return classNode;
    }

    @Override
    public ASTNode visitClassBodyRule(GrammarParser.ClassBodyRuleContext ctx) {
        return null; // This is handled in classDeclarationRule
    }

    @Override
    public ASTNode visitClassVarDecl(GrammarParser.ClassVarDeclContext ctx) {
        return visit(ctx.var);
    }

    @Override
    public ASTNode visitClassFuncDecl(GrammarParser.ClassFuncDeclContext ctx) {
        return visit(ctx.func);
    }

    @Override
    public ASTNode visitFunctionDeclarationRule(GrammarParser.FunctionDeclarationRuleContext ctx) {
        String functionName = ctx.funcName.getText();
        Token token = ctx.funcName; // <- استخدم getSymbol() هنا

        // SEMANTIC ERROR: Function re-declaration in the same scope
        if (symbolTable.isDeclaredInCurrentScope(functionName)) {
            symbolTable.addSemanticError("Function '" + functionName + "' is redeclared in the same scope at line " + token.getLine());
        }

        // Declare function in symbol table with default type
        symbolTable.declareSymbol(functionName, "any", "function", token.getLine(), token.getCharPositionInLine());

        // Enter function scope
        symbolTable.enterScope(functionName);
        inFunction = true;
        currentFunctionName = functionName;

        List<String> parameters = new ArrayList<>();
        Set<String> paramNames = new HashSet<>();
        if (ctx.params != null) {
            for (Token param : ctx.params) {
                String paramName = param.getText();
                Token paramToken = param; // <- صحيح

                // SEMANTIC ERROR: Duplicate parameter name
                if (paramNames.contains(paramName)) {
                    symbolTable.addSemanticError("Duplicate parameter name '" + paramName + "' in function '" + functionName + "' at line " + paramToken.getLine());
                }
                paramNames.add(paramName);

                parameters.add(paramName);

                // Declare parameters in symbol table
                symbolTable.declareSymbol(paramName, "any", "parameter", paramToken.getLine(), paramToken.getCharPositionInLine());
                Symbol paramSymbol = symbolTable.lookupSymbol(paramName);
                if (paramSymbol != null) {
                    paramSymbol.setInitialized(true);
                }
            }
        }

        FunctionBodyNode body = (FunctionBodyNode) visit(ctx.body);

        // Update function type in symbol table with actual return type
        Symbol functionSymbol = symbolTable.lookupSymbol(functionName);
        if (functionSymbol != null && body.getReturnType() != null) {
            String returnType = body.getReturnType().getName();
            if (body.getReturnType().isArray()) {
                returnType += "[]";
            }
            functionSymbol.setType(returnType);
        }

        // SEMANTIC ERROR: Comprehensive return type checking
        if (body.getReturnType() != null && !"any".equals(body.getReturnType().getName())) {
            String expectedReturnType = body.getReturnType().getName();
            if (body.getReturnType().isArray()) {
                expectedReturnType += "[]";
            }
            
            // Check all return statements in the function body
            List<String> returnTypes = analyzeReturnTypes(body, expectedReturnType);
            
            // Report type mismatches
            for (String actualType : returnTypes) {
                if (!isCompatibleType(expectedReturnType, actualType)) {
                    symbolTable.addSemanticError(
                        "Function '" + functionName + "' must return '" + expectedReturnType + 
                        "' but returned '" + actualType + "'"
                    );
                }
            }
            
            // Check if all code paths return a value
            if (!hasReturnInAllPaths(body)) {
                symbolTable.addSemanticError(
                    "Function '" + functionName + "' declares return type '" + expectedReturnType + 
                    "' but doesn't return a value in all code paths"
                );
            }
        }

        // Exit function scope
        symbolTable.exitScope();
        inFunction = false;
        currentFunctionName = null;

        return new FunctionDeclarationNode(functionName, parameters, body);
    }


    @Override
    public ASTNode visitFunctionBlock(GrammarParser.FunctionBlockContext ctx) {
        FunctionBodyNode bodyNode = new FunctionBodyNode();
        bodyNode.setBlockStyle(true);

        if (ctx.type != null) {
            bodyNode.setReturnType((TypeDefineNode) visit(ctx.type));
        }

        for (var stmtCtx : ctx.stmts) {
            bodyNode.addStatement(visit(stmtCtx));
        }

        return bodyNode;
    }

    @Override
    public ASTNode visitFunctionArrow(GrammarParser.FunctionArrowContext ctx) {
        FunctionBodyNode bodyNode = new FunctionBodyNode();
        bodyNode.setBlockStyle(false);

        List<String> params = new ArrayList<>();
        Set<String> paramNames = new HashSet<>();

        // Handle parameters - either single param or multiple params in parentheses
        if (ctx.singleParam != null) {
            String paramName = ctx.singleParam.getText();
            Token paramToken = ctx.singleParam;
            params.add(paramName);

            // Declare arrow function parameter
            symbolTable.declareSymbol(paramName, "any", "parameter", paramToken.getLine(), paramToken.getCharPositionInLine());
            Symbol paramSymbol = symbolTable.lookupSymbol(paramName);
            if (paramSymbol != null) {
                paramSymbol.setInitialized(true);
            }
        } else if (ctx.params != null) {
            for (Token id : ctx.params) {
                String paramName = id.getText();
                Token paramToken = id;
                // SEMANTIC ERROR: Duplicate parameter name
                if (paramNames.contains(paramName)) {
                    symbolTable.addSemanticError("Duplicate parameter name '" + paramName + "' in arrow function at line " + paramToken.getLine());
                }
                paramNames.add(paramName);

                params.add(paramName);

                // Declare arrow function parameters
                symbolTable.declareSymbol(paramName, "any", "parameter", paramToken.getLine(), paramToken.getCharPositionInLine());
                Symbol paramSymbol = symbolTable.lookupSymbol(paramName);
                if (paramSymbol != null) {
                    paramSymbol.setInitialized(true);
                }
            }
        }

        bodyNode.setParams(params);
        bodyNode.setArrowValue((ValueNode) visit(ctx.expr));

        if (ctx.type != null) {
            bodyNode.setReturnType((TypeDefineNode) visit(ctx.type));
        }

        return bodyNode;
    }

    @Override
    public ASTNode visitFunctionCallRule(GrammarParser.FunctionCallRuleContext ctx) {
        String functionName = ctx.funcName.getText();
        Token token = ctx.funcName;

        // Check if function exists
        Symbol function = symbolTable.lookupSymbol(functionName);
        if (function == null) {
            symbolTable.addSemanticError("Undefined function '" + functionName + "' at line " + token.getLine());
        } else if (!function.getKind().equals("function")) {
            symbolTable.addSemanticError("'" + functionName + "' is not a function at line " + token.getLine());
        } else {
            function.setUsed(true);
        }

        // SEMANTIC ERROR: Function call with wrong number of arguments
        if (function != null && function.getKind().equals("function")) {
            int expected = function.getParameterCount();
            int actual = ctx.args != null ? ctx.args.size() : 0;
            if (expected != -1 && expected != actual) {
                symbolTable.addSemanticError("Function '" + functionName + "' expects " + expected + " arguments but got " + actual + " at line " + token.getLine());
            }
        }

        // Visit function arguments
        FunctionCallNode functionCallNode = new FunctionCallNode(functionName);
        if (ctx.args != null) {
            for (var valueCtx : ctx.args) {
                functionCallNode.addArgument((ValueNode) visit(valueCtx));
            }
        }

        return functionCallNode;
    }

    @Override
    public ASTNode visitIfStatementRule(GrammarParser.IfStatementRuleContext ctx) {
        IfStatementNode ifStatementNode = new IfStatementNode();
        for (GrammarParser.IfBodyContext bodyCtx : ctx.ifBlocks) {
            ifStatementNode.addCondition((IfBodyNode) visit(bodyCtx));
        }
        // إذا وُجدت elseIfs
        if (ctx.elseIfs != null) {
            for (GrammarParser.IfBodyContext elseIfCtx : ctx.elseIfs) {
                ifStatementNode.addCondition((IfBodyNode) visit(elseIfCtx));
            }
        }
        if (ctx.elseBlock != null) {
            symbolTable.enterScope("else");
            List<ASTNode> elseStatements = new ArrayList<>();
            for (var stmt : ctx.elseStmts) {
                elseStatements.add(visit(stmt));
            }
            ifStatementNode.setElseBlock(elseStatements);
            symbolTable.exitScope();
        }
        return ifStatementNode;
    }

    @Override
    public ASTNode visitIfBodyRule(GrammarParser.IfBodyRuleContext ctx) {
        IfBodyNode ifBodyNode = new IfBodyNode();
        ValueNode left = (ValueNode) visit(ctx.left);

        if (ctx.condOps != null && ctx.condOps.size() > 0) {
            OperatorExpressionNode operatorExpression = new OperatorExpressionNode();
            operatorExpression.setLeft(left);
            String operator = ctx.condOps.get(0).getText();
            if (operator == null)
                throw new RuntimeException("Unknown comparison operator in if statement");
            operatorExpression.setOperator(operator);
            operatorExpression.setRight((ValueNode) visit(ctx.right.get(0)));
            left.setOperatorExpression(operatorExpression);

            // SEMANTIC ERROR: Condition is not boolean
            String condType = getValueType(left);
            if (!"boolean".equals(condType) && !"number".equals(condType) && !"any".equals(condType)) {
                symbolTable.addSemanticError("If condition is not a boolean or number at line " + ctx.getStart().getLine());
            }
        }

        ifBodyNode.setCondition(left);
        symbolTable.enterScope("if");
        List<ASTNode> statements = new ArrayList<>();
        for (GrammarParser.StatementContext stmtCtx : ctx.stmts) {
            statements.add(visit(stmtCtx));
        }
        
        // CONTROL FLOW: Check for unreachable code in if body
        checkForUnreachableCode(statements, ctx.getStart().getLine());
        
        for (ASTNode stmt : statements) {
            ifBodyNode.addStatement(stmt);
        }
        symbolTable.exitScope();
        return ifBodyNode;
    }

    // Iteration statements - updated method names
    @Override
    public ASTNode visitDoWhileLoop(GrammarParser.DoWhileLoopContext ctx) {
        symbolTable.enterScope("dowhile");
        List<ASTNode> bodyStatements = new ArrayList<>();
        for (var stmt : ctx.body) {
            bodyStatements.add(visit(stmt));
        }
        ASTNode body = new BlockNode(bodyStatements);
        ASTNode cond = visit(ctx.cond);
        
        // SEMANTIC ERROR: Loop condition is not boolean/number
        String condType = getValueType((ValueNode) cond);
        if (!"boolean".equals(condType) && !"number".equals(condType) && !"any".equals(condType)) {
            symbolTable.addSemanticError("Do-while loop condition is not a boolean or number at line " + ctx.getStart().getLine());
        }
        
        // CONTROL FLOW: Check for infinite loops
        checkForInfiniteLoop(cond, body, ctx.getStart().getLine());
        
        // CONTROL FLOW: Check for unreachable code in loop body
        checkForUnreachableCode(bodyStatements, ctx.getStart().getLine());
        
        symbolTable.exitScope();
        return new DoWhileStatementNode(body, cond);
    }

    @Override
    public ASTNode visitWhileLoop(GrammarParser.WhileLoopContext ctx) {
        ASTNode cond = visit(ctx.cond);
        ASTNode loopBody;

        // SEMANTIC ERROR: Loop condition is not boolean/number
        String condType = getValueType((ValueNode) cond);
        if (!"boolean".equals(condType) && !"number".equals(condType) && !"any".equals(condType)) {
            symbolTable.addSemanticError("While loop condition is not a boolean or number at line " + ctx.getStart().getLine());
        }

        // CONTROL FLOW: Check for infinite loops
        checkForInfiniteLoop(cond, null, ctx.getStart().getLine());

        symbolTable.enterScope("while");
        if (ctx.single != null) {
            loopBody = visit(ctx.single);
        } else {
            List<ASTNode> stmts = new ArrayList<>();
            for (var stmt : ctx.stmts) {
                stmts.add(visit(stmt));
            }
            loopBody = new BlockNode(stmts);
            
            // CONTROL FLOW: Check for unreachable code in loop body
            checkForUnreachableCode(stmts, ctx.getStart().getLine());
        }
        symbolTable.exitScope();

        return new WhileStatementNode(cond, loopBody);
    }

    @Override
    public ASTNode visitForLoopAssign(GrammarParser.ForLoopAssignContext ctx) {
        symbolTable.enterScope("for");
        ASTNode init = ctx.initVal != null ? visit(ctx.initVal) : null;
        ASTNode cond = ctx.cond != null ? visit(ctx.cond) : null;
        ASTNode step = ctx.step != null ? visit(ctx.step) : null;

        List<ASTNode> bodyStatements = new ArrayList<>();
        for (var stmt : ctx.body) {
            bodyStatements.add(visit(stmt));
        }
        ASTNode body = new BlockNode(bodyStatements);
        symbolTable.exitScope();

        return new ForStatementNode(init, cond, step, body);
    }

    @Override
    public ASTNode visitForLoopDecl(GrammarParser.ForLoopDeclContext ctx) {
        symbolTable.enterScope("for");
        ASTNode init = visit(ctx.initDecl);
        ASTNode cond = ctx.cond != null ? visit(ctx.cond) : null;
        ASTNode step = ctx.step != null ? visit(ctx.step) : null;

        List<ASTNode> bodyStatements = new ArrayList<>();
        for (var stmt : ctx.body) {
            bodyStatements.add(visit(stmt));
        }
        ASTNode body = new BlockNode(bodyStatements);
        symbolTable.exitScope();

        return new ForStatementNode(init, cond, step, body);
    }

    @Override
    public ASTNode visitForInLoopVal(GrammarParser.ForInLoopValContext ctx) {
        symbolTable.enterScope("forin");
        ASTNode iterVar = visit(ctx.iterVal);
        ASTNode iterable = visit(ctx.iterable);

        // SEMANTIC ERROR: For-in iterable is not array or object
        String iterableType = getValueType((ValueNode) iterable);
        if (!iterableType.endsWith("[]") && !"object".equals(iterableType) && !"any".equals(iterableType)) {
            symbolTable.addSemanticError("For-in loop iterable is not an array or object at line " + ctx.getStart().getLine());
        }

        List<ASTNode> bodyStatements = new ArrayList<>();
        for (var stmt : ctx.body) {
            bodyStatements.add(visit(stmt));
        }
        ASTNode body = new BlockNode(bodyStatements);
        symbolTable.exitScope();

        return new ForInStatementNode(iterVar, iterable, body);
    }

    @Override
    public ASTNode visitForInLoopDecl(GrammarParser.ForInLoopDeclContext ctx) {
        symbolTable.enterScope("forin");
        ASTNode iterVar = visit(ctx.iterDecl);
        ASTNode iterable = visit(ctx.iterable);

        // SEMANTIC ERROR: For-in iterable is not array or object
        String iterableType = getValueType((ValueNode) iterable);
        if (!iterableType.endsWith("[]") && !"object".equals(iterableType) && !"any".equals(iterableType)) {
            symbolTable.addSemanticError("For-in loop iterable is not an array or object at line " + ctx.getStart().getLine());
        }

        List<ASTNode> bodyStatements = new ArrayList<>();
        for (var stmt : ctx.body) {
            bodyStatements.add(visit(stmt));
        }
        ASTNode body = new BlockNode(bodyStatements);
        symbolTable.exitScope();

        return new ForInStatementNode(iterVar, iterable, body);
    }

    @Override
    public ASTNode visitComponentRule(GrammarParser.ComponentRuleContext ctx) {
        ComponentStatementNode componentNode = new ComponentStatementNode();

        if (ctx.selector != null) {
            String selector = ctx.selector.getText().replaceAll("^\"|\"$", "");
            componentNode.setSelector(selector);
        }

        // First, declare all component properties so they're available when processing the template
        if (ctx.keys != null) {
            Set<String> propKeys = new HashSet<>();
            for (int i = 0; i < ctx.keys.size(); i++) {
                String key = ctx.keys.get(i).getText();
                ValueNode value = (ValueNode) visit(ctx.vals.get(i));
                // SEMANTIC ERROR: Duplicate property key in component
                if (propKeys.contains(key)) {
                    symbolTable.addSemanticError("Duplicate property key '" + key + "' in component at line " + ctx.keys.get(i).getLine());
                }
                propKeys.add(key);
                componentNode.addProperty(key, value);
                
                // Also declare the property as a symbol so it can be used in template interpolations
                // Declare in global scope so it's accessible from template interpolations
                String propType = getValueType(value);
                // For now, declare as "any" to avoid complex type inference issues
                if (propType.equals("unknown")) {
                    propType = "any";
                }
                symbolTable.declareSymbolInScope(key, propType, "const", ctx.keys.get(i).getLine(), ctx.keys.get(i).getCharPositionInLine(), "global");
                
                // Mark the component property as initialized since it has a value
                Symbol propSymbol = symbolTable.lookupSymbol(key);
                if (propSymbol != null) {
                    propSymbol.setInitialized(true);
                }
            }
        }

        // Now visit the template after properties are declared
        ValueNode templateValue = (ValueNode) visit(ctx.template);
        componentNode.setTemplate(templateValue);

        return componentNode;
    }

    // HTML handling methods - updated to match new grammar
    @Override
    public ASTNode visitHtmlElement(GrammarParser.HtmlElementContext ctx) {
        HtmlNode node = new HtmlNode(HtmlNode.HtmlType.ELEMENT);

        // Get tag name from open tag
        String tagName = getHtmlElementName(ctx.open);
        node.setTagName(tagName);

        // SEMANTIC ERROR: Unknown HTML tag (if you want to restrict to known tags)
        if (!isKnownHtmlTag(tagName)) {
            symbolTable.addSemanticError("Unknown HTML tag '" + tagName + "' at line " + ctx.getStart().getLine());
        }

        // Process HTML attributes from open tag
        processHtmlAttributes(ctx.open, node);

        // Add children
        for (GrammarParser.HtmlContext child : ctx.inner) {
            HtmlNode childNode = (HtmlNode) visit(child);
            node.addChild(childNode);
        }

        return node;
    }

    @Override
    public ASTNode visitHtmlSingle(GrammarParser.HtmlSingleContext ctx) {
        HtmlNode node = new HtmlNode(HtmlNode.HtmlType.SELF_CLOSING);
        String tagName = getHtmlElementName(ctx.single);
        node.setTagName(tagName);

        // SEMANTIC ERROR: Unknown HTML tag
        if (!isKnownHtmlTag(tagName)) {
            symbolTable.addSemanticError("Unknown HTML tag '" + tagName + "' at line " + ctx.getStart().getLine());
        }

        // Process HTML attributes from single tag
        processHtmlAttributes(ctx.single, node);
        
        return node;
    }

    @Override
    public ASTNode visitHtmlBlock(GrammarParser.HtmlBlockContext ctx) {
        HtmlNode node = new HtmlNode(HtmlNode.HtmlType.EMBEDDED_STATEMENTS);
        for (GrammarParser.StatementContext stmt : ctx.stmts) {
            node.addEmbeddedStatement(visit(stmt));
        }
        return node;
    }

    @Override
    public ASTNode visitHtmlText(GrammarParser.HtmlTextContext ctx) {
        HtmlNode node = new HtmlNode(HtmlNode.HtmlType.TEXT);
        String raw = ctx.text.getText();
        node.setTextContent(raw);

        // Note: Template interpolation should be handled by visitSimpleInterpolation and visitNestedTemplateInterpolation
        // This method only handles plain HTML text without interpolation
        return node;
    }

    // Helper methods
    private String getHtmlElementName(GrammarParser.Open_tagContext openTag) {

        GrammarParser.OpenTagRuleContext OpenTagRule = (GrammarParser.OpenTagRuleContext) openTag;

        if (OpenTagRule != null) {
            return OpenTagRule.name.getText();
        }
        return "";
    }

    private String getHtmlElementName(GrammarParser.Single_tagContext singleTag) {

        GrammarParser.SingleTagRuleContext singleTagRuleContext = (GrammarParser.SingleTagRuleContext) singleTag;


        if (singleTagRuleContext != null) {
            return singleTagRuleContext.name.getText();
        }
        return "";
    }

    private String getValueType(ValueNode valueNode) {
        if (valueNode == null || valueNode.getPrimaryValue() == null) return "unknown";

        PrimaryValueNode primaryValue = valueNode.getPrimaryValue();
        if (primaryValue instanceof NumberNode) return "number";
        if (primaryValue instanceof StringNode) return "string";
        if (primaryValue instanceof IdentifierNode) {
            String varName = ((IdentifierNode) primaryValue).getName();
            Symbol symbol = symbolTable.lookupSymbol(varName);
            if (symbol != null) {
                return symbol.getType();
            } else {
                return "unknown";
            }
        }
        if (primaryValue instanceof ArrayNode) {
            // Try to infer array element type
            ArrayNode arr = (ArrayNode) primaryValue;
            if (arr.getElements().isEmpty()) return "any[]";
            
            String firstType = getValueType(arr.getElements().get(0));
            if (firstType.equals("unknown")) {
                // If first element type is unknown, try to infer from object structure
                ValueNode firstElem = arr.getElements().get(0);
                if (firstElem.getPrimaryValue() instanceof ObjectNode) {
                    // For object arrays, return "any[]" for now to avoid complex type inference
                    return "any[]";
                }
            }
            
            // Check if all elements have the same type
            boolean isArray = false;
            if (firstType.endsWith("[]")) {
                isArray = true;
                firstType = firstType.substring(0, firstType.length() - 2);
            }
            
            for (ValueNode elem : arr.getElements()) {
                String elemType = getValueType(elem);
                boolean elemIsArray = false;
                if (elemType.endsWith("[]")) {
                    elemIsArray = true;
                    elemType = elemType.substring(0, elemType.length() - 2);
                }
                if (isArray != elemIsArray || (!firstType.equals("any") && !elemType.equals("any") && !firstType.equals(elemType))) {
                    return "any[]";
                }
            }
            return firstType + "[]";
        }
        // Add more type checks as needed
        return "unknown";
    }

    private boolean isValidArrayMethod(String methodName) {
        // List of valid array methods
        return methodName.equals("map") || 
               methodName.equals("forEach") || 
               methodName.equals("filter") || 
               methodName.equals("reduce") || 
               methodName.equals("find") || 
               methodName.equals("some") || 
               methodName.equals("every") || 
               methodName.equals("length") ||
               methodName.equals("push") || 
               methodName.equals("pop") || 
               methodName.equals("shift") || 
               methodName.equals("unshift") ||
               methodName.equals("slice") || 
               methodName.equals("splice") || 
               methodName.equals("concat") || 
               methodName.equals("join") ||
               methodName.equals("reverse") || 
               methodName.equals("sort") || 
               methodName.equals("indexOf") || 
               methodName.equals("lastIndexOf") ||
               methodName.equals("includes");
    }

    private boolean isValidPropertyAccess(String type, String propertyName) {
        // Check if a property is valid for a given type
        switch (type) {
            case "string":
                // String properties
                return propertyName.equals("length") || 
                       propertyName.equals("charAt") || 
                       propertyName.equals("substring") || 
                       propertyName.equals("toLowerCase") || 
                       propertyName.equals("toUpperCase");
            case "number":
                // Number properties
                return propertyName.equals("toString") || 
                       propertyName.equals("toFixed") || 
                       propertyName.equals("toPrecision");
            case "boolean":
                // Boolean properties
                return propertyName.equals("toString");
            default:
                // For unknown types, allow property access (could be enhanced with type definitions)
                return true;
        }
    }

    private boolean isValidMethodCall(String type, String methodName) {
        // Check if a method is valid for a given type
        switch (type) {
            case "string":
                // String methods
                return methodName.equals("toString") || 
                       methodName.equals("charAt") || 
                       methodName.equals("substring") || 
                       methodName.equals("toLowerCase") || 
                       methodName.equals("toUpperCase") ||
                       methodName.equals("trim") ||
                       methodName.equals("replace") ||
                       methodName.equals("split");
            case "number":
                // Number methods
                return methodName.equals("toString") || 
                       methodName.equals("toFixed") || 
                       methodName.equals("toPrecision") ||
                       methodName.equals("valueOf");
            case "boolean":
                // Boolean methods
                return methodName.equals("toString") || 
                       methodName.equals("valueOf");
            default:
                // For unknown types, allow method calls (could be enhanced with type definitions)
                return true;
        }
    }

    private boolean isJavaScriptKeyword(String name) {
        // List of JavaScript keywords that should not trigger undefined variable errors
        return name.equals("function") || name.equals("class") || name.equals("const") || 
               name.equals("let") || name.equals("var") || name.equals("if") || 
               name.equals("else") || name.equals("for") || name.equals("while") || 
               name.equals("do") || name.equals("return") || name.equals("break") || 
               name.equals("continue") || name.equals("switch") || name.equals("case") || 
               name.equals("default") || name.equals("try") || name.equals("catch") || 
               name.equals("finally") || name.equals("throw") || name.equals("new") || 
               name.equals("delete") || name.equals("typeof") || name.equals("instanceof") ||
               name.equals("void") || name.equals("null") || name.equals("undefined") ||
               name.equals("true") || name.equals("false") || name.equals("in") || 
               name.equals("of") || name.equals("yield") || name.equals("super") ||
               name.equals("import") || name.equals("export") || name.equals("from") ||
               name.equals("as") || name.equals("static") || name.equals("extends") ||
               name.equals("get") || name.equals("set") || name.equals("async") || 
               name.equals("await") || name.equals("enum") || name.equals("interface") ||
               name.equals("type") || name.equals("namespace") || name.equals("module") ||
               name.equals("require") || name.equals("define") || name.equals("window") ||
               name.equals("document") || name.equals("console") || name.equals("Math") ||
               name.equals("Array") || name.equals("Object") || name.equals("String") ||
               name.equals("Number") || name.equals("Boolean") || name.equals("Date") ||
               name.equals("RegExp") || name.equals("Error") || name.equals("Promise") ||
               name.equals("Set") || name.equals("Map") || name.equals("WeakSet") ||
               name.equals("WeakMap") || name.equals("Proxy") || name.equals("Reflect") ||
               name.equals("Symbol") || name.equals("Generator") || name.equals("Iterator");
    }

    private boolean isComplexJavaScriptExpression(String expr) {
        // Check if the expression contains complex JavaScript syntax that should not trigger undefined variable errors
        String trimmed = expr.trim();
        
        // Skip expressions that contain method calls (e.g., products.map(...))
        if (trimmed.contains("(") && trimmed.contains(")")) {
            return true;
        }
        
        // Skip expressions that contain arrow functions (e.g., product => ...)
        if (trimmed.contains("=>")) {
            return true;
        }
        
        // Skip expressions that contain template literals (e.g., `...`)
        if (trimmed.contains("`")) {
            return true;
        }
        
        // Skip expressions that contain property access (e.g., product.name)
        if (trimmed.contains(".")) {
            return true;
        }
        
        // Skip expressions that contain operators (e.g., +, -, *, /, etc.)
        if (trimmed.matches(".*[+\\-*/%<>=!&|^~].*")) {
            return true;
        }
        
        return false;
    }

    private boolean isValidBinaryOperation(String leftType, String rightType, String operator) {
        switch (operator) {
            case "+":
                return (leftType.equals("number") && rightType.equals("number")) ||
                        (leftType.equals("string") || rightType.equals("string"));
            case "-":
            case "*":
            case "/":
            case "%":
                return leftType.equals("number") && rightType.equals("number");
            case "==":
            case "!=":
            case "===":
            case "!==":
                return true; // Any types can be compared
            case "<":
            case ">":
            case "<=":
            case ">=":
                return leftType.equals("number") && rightType.equals("number");
            case "&&":
            case "||":
                return true; // Logical operators work with any type
            case "??": // Nullish coalescing
                return true;
            default:
                return false;
        }
    }

    private void checkUnusedSymbols() {
        // This would require access to all symbols in all scopes
        // Implementation depends on your SymbolTable structure
        // You can implement this based on your SymbolTable's getAllSymbols() method

        // Example: Warn about unused variables/functions
        List<Symbol> allSymbols = symbolTable.getAllSymbols();
        for (Symbol symbol : allSymbols) {
            if (!symbol.isUsed() && !"parameter".equals(symbol.getKind()) && !"import".equals(symbol.getKind())) {
                symbolTable.addSemanticError("Symbol '" + symbol.getName() + "' declared at line " + symbol.getLine() + " is never used.");
            }
            // SEMANTIC ERROR: Variable declared but never initialized
            if (!symbol.isInitialized() && ("let".equals(symbol.getKind()) || "var".equals(symbol.getKind()))) {
                symbolTable.addSemanticError("Variable '" + symbol.getName() + "' declared at line " + symbol.getLine() + " is never initialized.");
            }
        }
    }

    private String stripQuotes(String s) {
        if (s == null || s.length() < 2) return s;
        return s.substring(1, s.length() - 1);
    }

    // Additional visitor methods for increment/decrement operations
    @Override
    public ASTNode visitIncrease_variable(GrammarParser.Increase_variableContext ctx) {
        String varName = ctx.id.getText();
        Token token = ctx.id;

        // Check if variable exists and is initialized
        Symbol symbol = symbolTable.lookupSymbol(varName);
        if (symbol == null) {
            symbolTable.addSemanticError("Undefined variable '" + varName + "' at line " + token.getLine());
        } else {
            symbol.setUsed(true);
            if (!symbol.isInitialized()) {
                symbolTable.addSemanticError("Variable '" + varName + "' used before initialization at line " + token.getLine());
            }
            // Check if it's a number type for increment operation
            if (!symbol.getType().equals("number") && !symbol.getType().equals("any")) {
                symbolTable.addSemanticError("Cannot increment non-numeric variable '" + varName + "' at line " + token.getLine());
            }
            // SEMANTIC ERROR: Incrementing a constant
            if ("const".equals(symbol.getKind())) {
                symbolTable.addSemanticError("Cannot increment constant variable '" + varName + "' at line " + token.getLine());
            }
        }

        boolean isPrefix = ctx.PLUSPLUS().getSymbol().getTokenIndex() < ctx.id.getTokenIndex();
        return new IncrementNode(varName, isPrefix);
    }

    @Override
    public ASTNode visitDecrease_variable(GrammarParser.Decrease_variableContext ctx) {
        String varName = ctx.id.getText();
        Token token = ctx.id;

        // Check if variable exists and is initialized
        Symbol symbol = symbolTable.lookupSymbol(varName);
        if (symbol == null) {
            symbolTable.addSemanticError("Undefined variable '" + varName + "' at line " + token.getLine());
        } else {
            symbol.setUsed(true);
            if (!symbol.isInitialized()) {
                symbolTable.addSemanticError("Variable '" + varName + "' used before initialization at line " + token.getLine());
            }
            if (!symbol.getType().equals("number") && !symbol.getType().equals("any")) {
                symbolTable.addSemanticError("Cannot decrement non-numeric variable '" + varName + "' at line " + token.getLine());
            }
            // SEMANTIC ERROR: Decrementing a constant
            if ("const".equals(symbol.getKind())) {
                symbolTable.addSemanticError("Cannot decrement constant variable '" + varName + "' at line " + token.getLine());
            }
        }

        boolean isPrefix = ctx.MINUSMINUS().getSymbol().getTokenIndex() < ctx.id.getTokenIndex();
        return new DecrementNode(varName, isPrefix);
    }

    // Binary operator visitor
    @Override
    public ASTNode visitBinaryOp(GrammarParser.BinaryOpContext ctx) {
        // This method returns the operator text
        // The actual binary operation handling is done in visitBinaryValue
        return null;
    }



    // Comparison visitors
    @Override
    public ASTNode visitIdEqComparison(GrammarParser.IdEqComparisonContext ctx) {
        ValueNode left = new ValueNode(null); // Should be set by parent
        PrimaryValueNode right = (PrimaryValueNode) visit(ctx.right);
        return new OperatorExpressionNode(left, "===", new ValueNode(right));
    }

    @Override
    public ASTNode visitEqComparison(GrammarParser.EqComparisonContext ctx) {
        ValueNode left = new ValueNode(null); // Should be set by parent
        PrimaryValueNode right = (PrimaryValueNode) visit(ctx.right);
        return new OperatorExpressionNode(left, "==", new ValueNode(right));
    }

    @Override
    public ASTNode visitNeqComparison(GrammarParser.NeqComparisonContext ctx) {
        ValueNode left = new ValueNode(null); // Should be set by parent
        PrimaryValueNode right = (PrimaryValueNode) visit(ctx.right);
        return new OperatorExpressionNode(left, "!=", new ValueNode(right));
    }

    @Override
    public ASTNode visitRtagComparison(GrammarParser.RtagComparisonContext ctx) {
        ValueNode left = new ValueNode(null); // Should be set by parent
        PrimaryValueNode right = (PrimaryValueNode) visit(ctx.right);
        String operator = ">"; // Default
        if (ctx.ASSIGN() != null) operator = ">=";
        else if (ctx.DOUBLE_ASSIGN() != null) operator = ">="; // or whatever DOUBLE_ASSIGN means in this context
        return new OperatorExpressionNode(left, operator, new ValueNode(right));
    }

    @Override
    public ASTNode visitLtagComparison(GrammarParser.LtagComparisonContext ctx) {
        ValueNode left = new ValueNode(null); // Should be set by parent
        PrimaryValueNode right = (PrimaryValueNode) visit(ctx.right);
        String operator = "<"; // Default
        if (ctx.ASSIGN() != null) operator = "<=";
        else if (ctx.DOUBLE_ASSIGN() != null) operator = "<="; // or whatever DOUBLE_ASSIGN means in this context
        return new OperatorExpressionNode(left, operator, new ValueNode(right));
    }

    // HTML tag visitors
    @Override
    public ASTNode visitOpenTagRule(GrammarParser.OpenTagRuleContext ctx) {
        // This is handled in visitHtmlElement
        return null;
    }

    @Override
    public ASTNode visitCloseTagRule(GrammarParser.CloseTagRuleContext ctx) {
        // This is handled in visitHtmlElement
        return null;
    }

    @Override
    public ASTNode visitSingleTagRule(GrammarParser.SingleTagRuleContext ctx) {
        // This is handled in visitHtmlSingle
        return null;
    }

    // HTML element name visitor
    @Override
    public ASTNode visitHtmlElementName(GrammarParser.HtmlElementNameContext ctx) {
        // Return the element name as a string
        if (ctx.DIV() != null) return new StringNode("div");
        if (ctx.P() != null) return new StringNode("p");
        if (ctx.H1() != null) return new StringNode("h1");
        if (ctx.H2() != null) return new StringNode("h2");
        if (ctx.H3() != null) return new StringNode("h3");
        if (ctx.H4() != null) return new StringNode("h4");
        if (ctx.H5() != null) return new StringNode("h5");
        if (ctx.H6() != null) return new StringNode("h6");
        if (ctx.BUTTON() != null) return new StringNode("button");
        if (ctx.SPAN() != null) return new StringNode("span");
        if (ctx.A() != null) return new StringNode("a");
        if (ctx.IMG() != null) return new StringNode("img");
        if (ctx.INPUT() != null) return new StringNode("input");
        if (ctx.FORM() != null) return new StringNode("form");
        if (ctx.ID() != null) return new StringNode(ctx.ID().getText());
        return new StringNode("div"); // Default
    }

    // HTML attribute visitors
    @Override
    public ASTNode visitAttributes(GrammarParser.AttributesContext ctx) {
        // This is handled in visitOpenTagRule
        return null;
    }

    @Override
    public ASTNode visitAttributeValue(GrammarParser.AttributeValueContext ctx) {
        if (ctx.STRING() != null) {
            return new StringNode(ctx.STRING().getText().replaceAll("^\"|\"$", ""));
        } else if (ctx.interpolation() != null) {
            return visit(ctx.interpolation());
        }
        return null;
    }

    @Override
    public ASTNode visitSimpleInterpolation(GrammarParser.SimpleInterpolationContext ctx) {
        // Visit the expression to build the AST
        ASTNode exprNode = visit(ctx.expr);
        
        // Mark the expression as used if it's an identifier
        if (exprNode instanceof ValueNode) {
            ValueNode valueNode = (ValueNode) exprNode;
            if (valueNode.getPrimaryValue() instanceof IdentifierNode) {
                String varName = ((IdentifierNode) valueNode.getPrimaryValue()).getName();
                Symbol sym = symbolTable.lookupSymbol(varName);
                if (sym != null) {
                    sym.setUsed(true);
                }
            }
        }
        
        return exprNode;
    }

    // Helper: Check for reserved words
    private boolean isReservedWord(String name) {
        String[] reserved = {
            "if", "else", "for", "while", "do", "return", "function", "class", "const", "let", "var", "import", "export", "extends", "super", "new", "this", "break", "continue", "switch", "case", "default", "try", "catch", "finally", "throw", "true", "false", "null", "undefined"
        };
        for (String word : reserved) {
            if (word.equals(name)) return true;
        }
        return false;
    }

    // Helper: Check for known HTML tags
    private boolean isKnownHtmlTag(String tag) {
        String[] known = {
            "div", "p", "h1", "h2", "h3", "h4", "h5", "h6", "button", "span", "a", "img", "input", "form"
        };
        for (String t : known) {
            if (t.equalsIgnoreCase(tag)) return true;
        }
        return false;
    }

    // Helper: Analyze return types in function body
    private List<String> analyzeReturnTypes(FunctionBodyNode body, String expectedType) {
        List<String> returnTypes = new ArrayList<>();
        
        if (body.isBlockStyle()) {
            // Analyze block-style function body
            for (ASTNode stmt : body.getStatements()) {
                if (stmt instanceof ReturnNode) {
                    ReturnNode returnStmt = (ReturnNode) stmt;
                    if (returnStmt.value != null) {
                        String actualType = getValueType((ValueNode) returnStmt.value);
                        returnTypes.add(actualType);
                    } else {
                        returnTypes.add("void");
                    }
                }
            }
        } else {
            // Analyze arrow function body
            if (body.getArrowValue() != null) {
                String actualType = getValueType(body.getArrowValue());
                returnTypes.add(actualType);
            }
        }
        
        return returnTypes;
    }

    // Helper: Check if all code paths return a value
    private boolean hasReturnInAllPaths(FunctionBodyNode body) {
        if (!body.isBlockStyle()) {
            // Arrow functions always return a value
            return true;
        }
        
        // For block-style functions, check if all paths have returns
        List<ASTNode> statements = body.getStatements();
        if (statements.isEmpty()) {
            return false;
        }
        
        // Check if the last statement is a return
        ASTNode lastStmt = statements.get(statements.size() - 1);
        if (lastStmt instanceof ReturnNode) {
            return true;
        }
        
        // Check for unreachable code after return
        boolean foundReturn = false;
        for (ASTNode stmt : statements) {
            if (stmt instanceof ReturnNode) {
                foundReturn = true;
            } else if (foundReturn) {
                // Found unreachable code after return
                symbolTable.addSemanticError("Unreachable code after return statement");
            }
        }
        
        return foundReturn;
    }

    // Helper: Check if two types are compatible
    private boolean isCompatibleType(String expected, String actual) {
        if ("any".equals(expected) || "any".equals(actual)) {
            return true;
        }
        if ("unknown".equals(actual)) {
            return true;
        }
        if (expected.equals(actual)) {
            return true;
        }
        
        // Handle array types
        if (expected.endsWith("[]") && actual.endsWith("[]")) {
            String expectedBase = expected.substring(0, expected.length() - 2);
            String actualBase = actual.substring(0, actual.length() - 2);
            return isCompatibleType(expectedBase, actualBase);
        }
        
        // Handle primitive type compatibility
        if (("number".equals(expected) && "number".equals(actual)) ||
            ("string".equals(expected) && "string".equals(actual)) ||
            ("boolean".equals(expected) && "boolean".equals(actual))) {
            return true;
        }
        
        return false;
    }

    // Helper: Validate object literal against declared type
    private void validateObjectAgainstType(ObjectNode assignedObj, TypeObjectNode declaredObj, String context, int line) {
        List<String> missing = new ArrayList<>();
        List<String> typeMismatch = new ArrayList<>();
        List<String> extra = new ArrayList<>();
        
        // Check for missing properties
        for (TypeMemberNode member : declaredObj.getTypeMembers()) {
            PropertyNode prop = assignedObj.getProperty(member.getName());
            if (prop == null) {
                missing.add(member.getName());
            } else {
                // Check type of property
                String expectedType = member.getType().getName();
                String actualType = getValueType(prop.getValue());
                if (!expectedType.equals("any") && !actualType.equals("any") && !expectedType.equals(actualType)) {
                    typeMismatch.add(member.getName() + " (expected " + expectedType + ", got " + actualType + ")");
                }
            }
        }
        
        // Check for extra properties (not in declared type)
        for (PropertyNode prop : assignedObj.getProperties()) {
            boolean found = false;
            for (TypeMemberNode member : declaredObj.getTypeMembers()) {
                if (member.getName().equals(prop.getKey())) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                extra.add(prop.getKey());
            }
        }
        
        // Report errors
        if (!missing.isEmpty() || !typeMismatch.isEmpty() || !extra.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            sb.append("Type mismatch in ").append(context).append(" at line ").append(line).append(": ");
            if (!missing.isEmpty()) {
                sb.append("missing [").append(String.join(", ", missing)).append("]");
            }
            if (!typeMismatch.isEmpty()) {
                if (!missing.isEmpty()) sb.append("; ");
                sb.append("type mismatch in [").append(String.join(", ", typeMismatch)).append("]");
            }
            if (!extra.isEmpty()) {
                if (!missing.isEmpty() || !typeMismatch.isEmpty()) sb.append("; ");
                sb.append("extra properties [").append(String.join(", ", extra)).append("] not in type definition");
            }
            symbolTable.addSemanticError(sb.toString());
        }
    }
    
    // Helper: Check if object literal matches a declared type structure
    private boolean matchesObjectStructure(ObjectNode obj, TypeObjectNode typeObj) {
        // Check if all required properties exist
        for (TypeMemberNode member : typeObj.getTypeMembers()) {
            PropertyNode prop = obj.getProperty(member.getName());
            if (prop == null) {
                return false; // Missing required property
            }
        }
        
        // Check if all object properties are defined in the type
        for (PropertyNode prop : obj.getProperties()) {
            boolean found = false;
            for (TypeMemberNode member : typeObj.getTypeMembers()) {
                if (member.getName().equals(prop.getKey())) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                return false; // Extra property not in type definition
            }
        }
        
        return true;
    }

    // Control Flow Analysis Methods
    
    /**
     * Check for infinite loops in while/do-while loops
     */
    private void checkForInfiniteLoop(ASTNode condition, ASTNode body, int line) {
        if (condition == null) return;
        
        // Check if condition is always true
        if (isAlwaysTrue(condition)) {
            symbolTable.addControlFlowError(
                "Potential infinite loop: condition is always true", 
                line, 0
            );
        }
        
        // Check if condition is always false
        if (isAlwaysFalse(condition)) {
            symbolTable.addControlFlowError(
                "Loop will never execute: condition is always false", 
                line, 0
            );
        }
    }
    
    /**
     * Check for unreachable code in if-else chains
     */
    private void checkForUnreachableCode(List<ASTNode> statements, int line) {
        boolean foundReturn = false;
        boolean foundBreak = false;
        boolean foundContinue = false;
        
        for (ASTNode stmt : statements) {
            if (foundReturn || foundBreak || foundContinue) {
                // Code after return/break/continue is unreachable
                if (stmt instanceof ReturnNode) {
                    symbolTable.addControlFlowError(
                        "Unreachable return statement", 
                        line, 0
                    );
                } else if (stmt instanceof ASTNode) {
                    symbolTable.addControlFlowError(
                        "Unreachable code after return/break/continue", 
                        line, 0
                    );
                    break; // Only report the first unreachable code
                }
            }
            
            if (stmt instanceof ReturnNode) {
                foundReturn = true;
            } else if (stmt instanceof ASTNode) {
                // Check if this is a break or continue statement
                // You might need to add specific node types for break/continue
                String stmtType = stmt.getClass().getSimpleName();
                if (stmtType.contains("Break") || stmtType.contains("Continue")) {
                    foundBreak = true;
                }
            }
        }
    }
    
    /**
     * Check if a condition is always true
     */
    private boolean isAlwaysTrue(ASTNode condition) {
        if (condition == null) return false;
        
        // Check for literal true values
        if (condition instanceof ValueNode) {
            ValueNode valueNode = (ValueNode) condition;
            if (valueNode.getPrimaryValue() instanceof StringNode) {
                String value = ((StringNode) valueNode.getPrimaryValue()).getValue();
                return "true".equals(value);
            }
        }
        
        // Check for comparison operations that are always true
        if (condition instanceof OperatorExpressionNode) {
            OperatorExpressionNode opExpr = (OperatorExpressionNode) condition;
            String operator = opExpr.getOperator();
            
            // Check for x == x, x != y where x and y are different literals
            if ("==".equals(operator) || "===".equals(operator)) {
                ValueNode left = opExpr.getLeft();
                ValueNode right = opExpr.getRight();
                if (left != null && right != null) {
                    String leftType = getValueType(left);
                    String rightType = getValueType(right);
                    if (leftType.equals(rightType) && isLiteralValue(left) && isLiteralValue(right)) {
                        // This could be optimized to check actual values
                        return false; // Conservative approach
                    }
                }
            }
        }
        
        return false;
    }
    
    /**
     * Check if a condition is always false
     */
    private boolean isAlwaysFalse(ASTNode condition) {
        if (condition == null) return false;
        
        // Check for literal false values
        if (condition instanceof ValueNode) {
            ValueNode valueNode = (ValueNode) condition;
            if (valueNode.getPrimaryValue() instanceof StringNode) {
                String value = ((StringNode) valueNode.getPrimaryValue()).getValue();
                return "false".equals(value);
            }
        }
        
        // Check for comparison operations that are always false
        if (condition instanceof OperatorExpressionNode) {
            OperatorExpressionNode opExpr = (OperatorExpressionNode) condition;
            String operator = opExpr.getOperator();
            
            // Check for x != x, x == y where x and y are different literals
            if ("!=".equals(operator) || "!==".equals(operator)) {
                ValueNode left = opExpr.getLeft();
                ValueNode right = opExpr.getRight();
                if (left != null && right != null) {
                    String leftType = getValueType(left);
                    String rightType = getValueType(right);
                    if (leftType.equals(rightType) && isLiteralValue(left) && isLiteralValue(right)) {
                        // This could be optimized to check actual values
                        return false; // Conservative approach
                    }
                }
            }
        }
        
        return false;
    }
    
    /**
     * Check if a value is a literal (not a variable)
     */
    private boolean isLiteralValue(ValueNode value) {
        if (value == null || value.getPrimaryValue() == null) return false;
        
        PrimaryValueNode primary = value.getPrimaryValue();
        return primary instanceof NumberNode || 
               primary instanceof StringNode || 
               primary instanceof BooleanNode;
    }
    
    // Additional Semantic Checks
    
    /**
     * Check for potential null pointer access
     */
    private void checkForNullPointerAccess(ValueNode value, int line) {
        if (value == null) return;
        
        // Check for property access on potentially null values
        if (value.getPrimaryValue() instanceof PropertyAccessNode) {
            PropertyAccessNode propAccess = (PropertyAccessNode) value.getPrimaryValue();
            ValueNode baseNode = new ValueNode((PrimaryValueNode) propAccess.getBase());
            String baseType = getValueType(baseNode);
            
            // Warn about accessing properties on nullable types
            if ("any".equals(baseType) || "unknown".equals(baseType)) {
                symbolTable.addControlFlowError(
                    "Potential null pointer access: accessing property on nullable type",
                    line, 0
                );
            }
        }
    }
    
    /**
     * Check for unused variables and functions
     */
    private void checkForUnusedSymbols() {
        for (String scope : symbolTable.getAllScopes()) {
            List<Symbol> scopeSymbols = symbolTable.getSymbolsInScope(scope);
            if (scopeSymbols != null) {
                for (Symbol symbol : scopeSymbols) {
                    if (!symbol.isUsed() && !symbol.getKind().equals("function") && !symbol.getKind().equals("class")) {
                        symbolTable.addControlFlowError(
                            "Symbol '" + symbol.getName() + "' declared at line " + symbol.getLine() + " is never used",
                            symbol.getLine(), 0
                        );
                    }
                }
            }
        }
    }
    
    /**
     * Check for potential division by zero
     */
    private void checkForDivisionByZero(OperatorExpressionNode opExpr, int line) {
        if (opExpr == null || !"/".equals(opExpr.getOperator())) return;
        
        ValueNode right = opExpr.getRight();
        if (right != null && right.getPrimaryValue() instanceof NumberNode) {
            NumberNode numNode = (NumberNode) right.getPrimaryValue();
            try {
                double numValue = Double.parseDouble(numNode.getValue());
                if (numValue == 0.0) {
                    symbolTable.addControlFlowError(
                        "Division by zero detected",
                        line, 0
                    );
                }
            } catch (NumberFormatException e) {
                // Ignore if the value is not a valid number
            }
        }
    }

    /**
     * Process HTML attributes from open tag or single tag and add them to the HtmlNode
     */
    private void processHtmlAttributes(GrammarParser.Open_tagContext openTag, HtmlNode node) {
        if (openTag instanceof GrammarParser.OpenTagRuleContext) {
            GrammarParser.OpenTagRuleContext openTagRule = (GrammarParser.OpenTagRuleContext) openTag;
            
            // Process each attributes block
            for (GrammarParser.AttributesContext attrBlock : openTagRule.attributes()) {
                // Process each attribute in the block
                for (GrammarParser.AttributeContext attr : attrBlock.attribute()) {
                    if (attr instanceof GrammarParser.NgForAttributeRuleContext) {
                        // Handle *ngFor directive
                        GrammarParser.NgForAttributeRuleContext ngForAttr = (GrammarParser.NgForAttributeRuleContext) attr;
                        String variableName = ngForAttr.varName.getText();
                        String collectionName = ngForAttr.collection.getText();
                        
                        // SEMANTIC ERROR: Check if variable name is valid
                        if (variableName == null || variableName.trim().isEmpty()) {
                            symbolTable.addSemanticError(
                                "ngFor directive requires a valid variable name at line " + attr.getStart().getLine()
                            );
                        }
                        
                        // SEMANTIC ERROR: Check if collection name is valid
                        if (collectionName == null || collectionName.trim().isEmpty()) {
                            symbolTable.addSemanticError(
                                "ngFor directive requires a valid collection name at line " + attr.getStart().getLine()
                            );
                        }
                        
                        // Store the ngFor directive information in the HtmlNode
                        node.addAttribute("*ngFor", "let " + variableName + " of " + collectionName);
                        
                    } else if (attr instanceof GrammarParser.NgIfAttributeRuleContext) {
                        // Handle *ngIf directive
                        GrammarParser.NgIfAttributeRuleContext ngIfAttr = (GrammarParser.NgIfAttributeRuleContext) attr;
                        ValueNode condition = (ValueNode) visit(ngIfAttr.condition);
                        
                        // SEMANTIC ERROR: Check if condition is valid
                        if (condition == null) {
                            symbolTable.addSemanticError(
                                "ngIf directive condition cannot be null at line " + attr.getStart().getLine()
                            );
                        }
                        
                        // Store the ngIf directive information in the HtmlNode
                        node.addAttribute("*ngIf", convertValueNodeToExpression(condition));
                    } else {
                        // Handle regular attributes
                        if (attr instanceof GrammarParser.RegularAttributeContext) {
                            GrammarParser.RegularAttributeContext regularAttr = (GrammarParser.RegularAttributeContext) attr;
                            String attrName = regularAttr.name.getText();
                            ASTNode attrValueNode = visit(regularAttr.val);
                            
                            // Convert className to class to avoid conflicts with JavaScript class keyword
                            if ("className".equals(attrName)) {
                                attrName = "class";
                            }
                            
                            if (attrValueNode instanceof StringNode) {
                                String attrValue = ((StringNode) attrValueNode).getValue();
                                node.addAttribute(attrName, attrValue);
                            } else if (attrValueNode instanceof ValueNode) {
                                // For interpolated values, we'll store the expression as a string for now
                                // This could be improved to handle dynamic attributes
                                String attrValue = attrValueNode.toString();
                                node.addAttribute(attrName, attrValue);
                            }
                        }
                    }
                }
            }
        }
    }

    /**
     * Process HTML attributes from single tag and add them to the HtmlNode
     */
    private void processHtmlAttributes(GrammarParser.Single_tagContext singleTag, HtmlNode node) {
        if (singleTag instanceof GrammarParser.SingleTagRuleContext) {
            GrammarParser.SingleTagRuleContext singleTagRule = (GrammarParser.SingleTagRuleContext) singleTag;
            
            // Single tags don't have attributes in the current grammar
            // This method is here for consistency and future extensibility
            // No attributes to process for single tags
            // Note: If single tags get attributes in the future, className->class conversion should be added here too
        }
    }

    /**
     * Helper method to validate if a string condition is valid for ngIf
     */
    private boolean isValidConditionString(ValueNode condition) {
        if (condition.getPrimaryValue() instanceof StringNode) {
            String value = ((StringNode) condition.getPrimaryValue()).getValue();
            return "true".equals(value) || "false".equals(value);
        }
        return true; // Non-string conditions are fine
    }

    private String convertValueNodeToExpression(ValueNode valueNode) {
        String expression = "";
        
        if (valueNode.getOperatorExpression() != null) {
            OperatorExpressionNode opExpr = valueNode.getOperatorExpression();
            String leftExpr = convertValueNodeToExpression(opExpr.getLeft());
            String rightExpr = convertValueNodeToExpression(opExpr.getRight());
            String operator = opExpr.getOperator();
            expression = "(" + leftExpr + " " + operator + " " + rightExpr + ")";
        } else if (valueNode.getPrimaryValue() instanceof IdentifierNode) {
            expression = ((IdentifierNode) valueNode.getPrimaryValue()).getName();
        } else if (valueNode.getPrimaryValue() instanceof PropertyAccessValueNode) {
            PropertyAccessValueNode propAccess = (PropertyAccessValueNode) valueNode.getPrimaryValue();
            String leftExpr = "";
            String rightExpr = "";
            
            // Handle left side
            if (propAccess.getLeft() instanceof ValueNode) {
                leftExpr = convertValueNodeToExpression((ValueNode) propAccess.getLeft());
            } else if (propAccess.getLeft() instanceof IdentifierNode) {
                leftExpr = ((IdentifierNode) propAccess.getLeft()).getName();
            } else {
                leftExpr = propAccess.getLeft().toString();
            }
            
            // Handle right side
            if (propAccess.getRight() instanceof ValueNode) {
                rightExpr = convertValueNodeToExpression((ValueNode) propAccess.getRight());
            } else if (propAccess.getRight() instanceof IdentifierNode) {
                rightExpr = ((IdentifierNode) propAccess.getRight()).getName();
            } else {
                rightExpr = propAccess.getRight().toString();
            }
            
            expression = leftExpr + "." + rightExpr;
        } else if (valueNode.getPrimaryValue() instanceof StringNode) {
            expression = ((StringNode) valueNode.getPrimaryValue()).getValue();
        } else if (valueNode.getPrimaryValue() instanceof NumberNode) {
            expression = ((NumberNode) valueNode.getPrimaryValue()).getValue();
        } else if (valueNode.getPrimaryValue() instanceof BooleanNode) {
            expression = String.valueOf(((BooleanNode) valueNode.getPrimaryValue()).getValue());
        } else {
            // Fallback for unsupported types
            expression = valueNode.toString();
        }
        
        // Apply negation modifier if present
        if (valueNode.getModifier() != null && "!".equals(valueNode.getModifier())) {
            expression = "!" + expression;
        }
        
        return expression;
    }
}