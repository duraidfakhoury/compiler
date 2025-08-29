package Classes;

import Classes.Errors.SemanticErrorManager;
import gen.GrammarParser;
import gen.GrammarParserBaseVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.Token;
import Classes.Errors.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.HashSet;


public class BaseVisitor extends GrammarParserBaseVisitor<ASTNode> {
    SymbolTable symbolTable = new SymbolTable();
    SemanticErrorManager errorManager = new SemanticErrorManager();

    private boolean inFunction = false;
    private String currentFunctionName = null;
    private boolean inLoop = false;
    private boolean hasReturn = false;
    private String currentFunctionReturnType = null;

    // Getters
    public SymbolTable getSymbolTable() {
        return symbolTable;
    }

    public SemanticErrorManager getErrorManager() {
        return errorManager;
    }

    @Override
    public ASTNode visitProgram(GrammarParser.ProgramContext ctx) {
        ProgramNode programNode = new ProgramNode();
        for (var statementCtx : ctx.statement()) {
            ASTNode statement = visit(statementCtx);
            if (statement != null) programNode.addStatement(statement);
        }

        // Check for unused variables at the end
        checkUnusedSymbols();

        return programNode;
    }

    @Override
    public ASTNode visitVariableDeclaration(GrammarParser.VariableDeclarationContext ctx) {
        String kind = ctx.CONST() != null ? "const" : ctx.LET() != null ? "let" : "var";
        VariableDeclarationNode variableDeclarationNode = new VariableDeclarationNode(kind);
        VariableAssignNode assignNode = (VariableAssignNode) visit(ctx.variableAssign());
        variableDeclarationNode.setAssignment(assignNode);

        String varName = ctx.variableAssign().ID().getText();
        Token token = ctx.variableAssign().ID().getSymbol();

        // Check for const without initialization
        if (kind.equals("const") && ctx.variableAssign().value() == null) {
            errorManager.addError(new ConstWithoutInitializationError(
                    varName, token.getLine(), token.getCharPositionInLine()));
        }

        // Check for variable redeclaration in same scope
        Symbol existingSymbol = symbolTable.lookupSymbolInCurrentScope(varName);
        if (existingSymbol != null && !existingSymbol.getKind().equals("parameter")) {
            errorManager.addError(new VariableRedeclarationError(
                    varName, token.getLine(), token.getCharPositionInLine(), existingSymbol.getLine()));
            return variableDeclarationNode;
        }

        // Declare symbol in symbol table
        String varType = "any"; // default type
        if (ctx.variableAssign().typeDefine() != null) {
            varType = ctx.variableAssign().typeDefine().ID().getText();
        }

        boolean declared = symbolTable.declareSymbol(varName, varType, kind, token.getLine(), token.getCharPositionInLine());

        // Mark as initialized if there's a value
        if (ctx.variableAssign().value() != null && declared) {
            Symbol symbol = symbolTable.lookupSymbol(varName);
            if (symbol != null) {
                symbol.setInitialized(true);

                // Type checking for initialization
                if (!varType.equals("any")) {
                    String initType = getValueType((ValueNode) visit(ctx.variableAssign().value()));
                    if (!isCompatibleType(varType, initType)) {
                        errorManager.addError(new TypeMismatchError(
                                varType, initType, token.getLine(), token.getCharPositionInLine()));
                    }
                }
            }
        }

        return variableDeclarationNode;
    }

    @Override
    public ASTNode visitVariableAssign(GrammarParser.VariableAssignContext ctx) {
        VariableAssignNode variableAssignNode = new VariableAssignNode(ctx.ID().getText());
        if (ctx.typeDefine() != null) {
            TypeDefineNode typeNode = (TypeDefineNode) visit(ctx.typeDefine());
            variableAssignNode.setType(typeNode);
        }
        if (ctx.value() != null) {
            variableAssignNode.setValue((ValueNode) visit(ctx.value()));
        }

        return variableAssignNode;
    }

    @Override
    public ASTNode visitTypeDefine(GrammarParser.TypeDefineContext ctx) {
        String typeName = ctx.ID().getText();
        if (!isValidType(typeName)) {
            errorManager.addError(new UndefinedTypeError(
                    typeName, ctx.ID().getSymbol().getLine(), ctx.ID().getSymbol().getCharPositionInLine()));
        }

        return new TypeDefineNode(typeName, ctx.LBRACKET() != null);
    }

    @Override
    public ASTNode visitValue(GrammarParser.ValueContext ctx) {
        if (ctx.binaryOp() != null) {
            ValueNode left = (ValueNode) visit(ctx.value(0));
            ValueNode right = (ValueNode) visit(ctx.value(1));
            String op = ctx.binaryOp().getText();

            // Type checking for binary operations
            String leftType = getValueType(left);
            String rightType = getValueType(right);

            if (!isValidBinaryOperation(leftType, rightType, op)) {
                errorManager.addError(new InvalidBinaryOperationError(
                        leftType, rightType, op, ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine()));
            }

            OperatorExpressionNode opExpr = new OperatorExpressionNode(left, op, right);
            ValueNode node = new ValueNode(left.getPrimaryValue());
            node.setOperatorExpression(opExpr);

            if (ctx.QMARK() != null) node.setModifier("?");
            else if (ctx.EMARK() != null) {
                node.setModifier("!");
                // Check null safety
                checkNullSafety(left, ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine());
            }

            if (ctx.asType() != null) {
                node.setAsType((TypeNode) visit(ctx.asType()));
            }
            return node;
        }

        PrimaryValueNode primaryValue = (PrimaryValueNode) visit(ctx.primaryValue());
        ValueNode valueNode = new ValueNode(primaryValue);

        if (ctx.QMARK() != null) valueNode.setModifier("?");
        else if (ctx.EMARK() != null) {
            valueNode.setModifier("!");
            checkNullSafety(valueNode, ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine());
        }

        if (ctx.asType() != null) {
            valueNode.setAsType((TypeNode) visit(ctx.asType()));
        }

        return valueNode;
    }

    @Override
    public ASTNode visitPrimaryValue(GrammarParser.PrimaryValueContext ctx) {
        if (ctx.NUMBER() != null) return new NumberNode(ctx.NUMBER().getText());
        if (ctx.STRING() != null) return new StringNode(ctx.STRING().getText().replaceAll("^\"|\"$", ""));

        if (ctx.ID() != null) {
            String varName = ctx.ID().getText();
            Token token = ctx.ID().getSymbol();

            // Check for undefined variables
            Symbol symbol = symbolTable.lookupSymbol(varName);
            if (symbol == null) {
                errorManager.addError(new UndefinedVariableError(
                        varName, token.getLine(), token.getCharPositionInLine()));
            } else {
                // Mark as used
                symbol.setUsed(true);

                // Check for uninitialized variable usage
                if (!symbol.isInitialized() && !symbol.getKind().equals("parameter")) {
                    errorManager.addError(new UninitializedVariableUsageError(
                            varName, token.getLine(), token.getCharPositionInLine()));
                }

                // Check for const reassignment
                if (symbol.getKind().equals("const") && isAssignmentContext(ctx)) {
                    errorManager.addError(new ConstReassignmentError(
                            varName, token.getLine(), token.getCharPositionInLine()));
                }
            }

            return new IdentifierNode(varName);
        }

        if (ctx.functionCall() != null) return visit(ctx.functionCall());
        if (ctx.LPAREN() != null) return new ParenthesizedValueNode((ValueNode) visit(ctx.value()));
        if (ctx.object() != null) return visit(ctx.object());
        if (ctx.array() != null) return visitArray(ctx.array());
        if (ctx.arrayAccess() != null) return visit(ctx.arrayAccess());
        if (ctx.functionBody() != null) return visit(ctx.functionBody());
        if (ctx.increase_variable() != null || ctx.decrease_variable() != null) return visitChildren(ctx);

        if (ctx.BACKTICK() != null || ctx.BACKTICK_HTML() != null) {
            TemplateLiteralNode node = new TemplateLiteralNode();
            for (var htmlCtx : ctx.html()) {
                node.addPart(visit(htmlCtx));
            }
            return node;
        }
        return null;
    }

    @Override
    public ASTNode visitArray(GrammarParser.ArrayContext ctx) {
        ArrayNode arrayNode = new ArrayNode();
        String expectedType = null;

        for (GrammarParser.ValueContext valueCtx : ctx.value()) {
            ValueNode element = (ValueNode) visit(valueCtx);
            arrayNode.addElement(element);

            // Check for inconsistent array types
            String elementType = getValueType(element);
            if (expectedType == null) {
                expectedType = elementType;
            } else if (!isCompatibleType(expectedType, elementType)) {
                errorManager.addError(new InconsistentArrayTypesError(
                        expectedType, elementType, valueCtx.getStart().getLine(), valueCtx.getStart().getCharPositionInLine()));
            }
        }

        return arrayNode;
    }

    @Override
    public ASTNode visitObject(GrammarParser.ObjectContext ctx) {
        ObjectNode objectNode = new ObjectNode();
        Set<String> usedKeys = new HashSet<>();

        for (GrammarParser.PairContext pairCtx : ctx.pair()) {
            String key = pairCtx.ID().getText();
            Token token = pairCtx.ID().getSymbol();

            // Check for duplicate object keys
            if (usedKeys.contains(key)) {
                errorManager.addError(new DuplicateObjectKeyError(
                        key, token.getLine(), token.getCharPositionInLine()));
            }
            usedKeys.add(key);

            ValueNode valueNode = (ValueNode) visit(pairCtx.value());
            objectNode.addProperty(new PropertyNode(key, valueNode));
        }
        return objectNode;
    }

    @Override
    public ASTNode visitImportStatement(GrammarParser.ImportStatementContext ctx) {
        String source = ctx.STRING().getText().replaceAll("^\"|\"$", "");
        ImportNode importNode = new ImportNode(source);

        if (ctx.defaultImport() != null) {
            String importName = ctx.defaultImport().ID().getText();
            Token token = ctx.defaultImport().ID().getSymbol();

            // Check for import name conflicts
            if (symbolTable.lookupSymbolInCurrentScope(importName) != null) {
                errorManager.addError(new ImportNameConflictError(
                        importName, token.getLine(), token.getCharPositionInLine()));
            }

            symbolTable.declareSymbol(importName, "imported", "import", token.getLine(), token.getCharPositionInLine());
            Symbol symbol = symbolTable.lookupSymbol(importName);
            if (symbol != null) {
                symbol.setInitialized(true);
            }

            importNode.addImport(importName);
            importNode.setDefaultImport(true);
        } else {
            importNode.setHtmlImport(ctx.namedImports().LBRACE_HTML() != null);
            for (GrammarParser.ImportSpecifierContext spec : ctx.namedImports().importSpecifier()) {
                String importName = spec.ID(0).getText();
                Token token = spec.ID(0).getSymbol();

                // Check for import name conflicts
                if (symbolTable.lookupSymbolInCurrentScope(importName) != null) {
                    errorManager.addError(new ImportNameConflictError(
                            importName, token.getLine(), token.getCharPositionInLine()));
                }

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
    public ASTNode visitExportStatement(GrammarParser.ExportStatementContext ctx) {
        ExportNode exportNode = new ExportNode();

        if (ctx.classDeclaration() != null) {
            exportNode.setExportValue((ClassNode) visit(ctx.classDeclaration()));
            exportNode.setExportType("class");
        } else if (ctx.value() != null) {
            exportNode.setExportValue((ValueNode) visit(ctx.value()));
            exportNode.setExportType("value");
        } else if (ctx.functionBody() != null) {
            exportNode.setExportValue((FunctionDeclarationNode) visit(ctx.functionBody()));
            exportNode.setExportType("function");
        }
        return exportNode;
    }

    @Override
    public ASTNode visitClassDeclaration(GrammarParser.ClassDeclarationContext ctx) {
        String className = ctx.ID().getText();
        Token token = ctx.ID().getSymbol();

        // Check for class name conflicts
        Symbol existingSymbol = symbolTable.lookupSymbolInCurrentScope(className);
        if (existingSymbol != null) {
            errorManager.addError(new ClassRedeclarationError(
                    className, token.getLine(), token.getCharPositionInLine(), existingSymbol.getLine()));
        }

        symbolTable.declareSymbol(className, "class", "class", token.getLine(), token.getCharPositionInLine());
        symbolTable.enterScope(className);

        ClassNode classNode = new ClassNode(className);
        Set<String> memberNames = new HashSet<>();

        for (GrammarParser.ClassBodyStatementContext stmtCtx : ctx.classBody().classBodyStatement()) {
            ASTNode member = visit(stmtCtx);

            // Check for duplicate class members
            String memberName = getMemberName(member);
            if (memberName != null && memberNames.contains(memberName)) {
                errorManager.addError(new DuplicateClassMemberError(
                        memberName, className, stmtCtx.getStart().getLine(), stmtCtx.getStart().getCharPositionInLine()));
            }
            if (memberName != null) memberNames.add(memberName);

            if (member instanceof VariableDeclarationNode) classNode.addField((VariableDeclarationNode) member);
            else if (member instanceof FunctionDeclarationNode) classNode.addMethod((FunctionDeclarationNode) member);
            else classNode.addOtherMember(member);
        }

        symbolTable.exitScope();
        return classNode;
    }

    @Override
    public ASTNode visitFunctionDeclaration(GrammarParser.FunctionDeclarationContext ctx) {
        String functionName = ctx.ID().getFirst().getText();
        Token token = ctx.ID().getFirst().getSymbol();

        // Check for function name conflicts
        Symbol existingSymbol = symbolTable.lookupSymbolInCurrentScope(functionName);
        if (existingSymbol != null) {
            errorManager.addError(new FunctionRedeclarationError(
                    functionName, token.getLine(), token.getCharPositionInLine(), existingSymbol.getLine()));
        }

        symbolTable.declareSymbol(functionName, "function", "function", token.getLine(), token.getCharPositionInLine());
        symbolTable.enterScope(functionName);
        inFunction = true;
        currentFunctionName = functionName;
        hasReturn = false;

        List<String> parameters = new ArrayList<>();
        Set<String> paramNames = new HashSet<>();

        for (TerminalNode param : ctx.ID().subList(1, ctx.ID().size())) {
            String paramName = param.getText();
            Token paramToken = param.getSymbol();

            // Check for duplicate parameters
            if (paramNames.contains(paramName)) {
                errorManager.addError(new DuplicateParameterError(
                        paramName, functionName, paramToken.getLine(), paramToken.getCharPositionInLine()));
            }
            paramNames.add(paramName);
            parameters.add(paramName);

            symbolTable.declareSymbol(paramName, "any", "parameter", paramToken.getLine(), paramToken.getCharPositionInLine());
            Symbol paramSymbol = symbolTable.lookupSymbol(paramName);
            if (paramSymbol != null) {
                paramSymbol.setInitialized(true);
            }
        }

        FunctionBodyNode body = (FunctionBodyNode) visit(ctx.functionBody());

        // Check for missing return in non-void functions
        if (!hasReturn && currentFunctionReturnType != null && !currentFunctionReturnType.equals("void")) {
            errorManager.addError(new MissingReturnError(
                    functionName, currentFunctionReturnType, token.getLine(), token.getCharPositionInLine()));
        }

        symbolTable.exitScope();
        inFunction = false;
        currentFunctionName = null;
        currentFunctionReturnType = null;

        return new FunctionDeclarationNode(functionName, parameters, body);
    }

    @Override
    public ASTNode visitFunctionBody(GrammarParser.FunctionBodyContext ctx) {
        FunctionBodyNode bodyNode = new FunctionBodyNode();

        if (ctx.typeDefine() != null) {
            String returnType = ctx.typeDefine().ID().getText();
            currentFunctionReturnType = returnType;
            bodyNode.setReturnType((TypeDefineNode) visit(ctx.typeDefine()));
        }

        if (ctx.LBRACE() != null) {
            bodyNode.setBlockStyle(true);
            for (var stmtCtx : ctx.statement()) {
                bodyNode.addStatement(visit(stmtCtx));
            }
        } else {
            bodyNode.setBlockStyle(false);
            List<String> params = new ArrayList<>();
            for (TerminalNode id : ctx.ID()) {
                String paramName = id.getText();
                Token paramToken = id.getSymbol();
                params.add(paramName);

                symbolTable.declareSymbol(paramName, "any", "parameter", paramToken.getLine(), paramToken.getCharPositionInLine());
                Symbol paramSymbol = symbolTable.lookupSymbol(paramName);
                if (paramSymbol != null) {
                    paramSymbol.setInitialized(true);
                }
            }
            bodyNode.setParams(params);
            ValueNode arrowValue = (ValueNode) visit(ctx.value());
            bodyNode.setArrowValue(arrowValue);

            // For arrow functions, check return type compatibility
            if (currentFunctionReturnType != null) {
                String actualReturnType = getValueType(arrowValue);
                if (!isCompatibleType(currentFunctionReturnType, actualReturnType)) {
                    errorManager.addError(new ReturnTypeMismatchError(
                            currentFunctionReturnType, actualReturnType, ctx.value().getStart().getLine(), ctx.value().getStart().getCharPositionInLine()));
                }
            }
        }

        return bodyNode;
    }

    @Override
    public ASTNode visitReturn(GrammarParser.ReturnContext ctx) {
        // Return statement outside function
        if (!inFunction) {
            errorManager.addError(new ReturnOutsideFunctionError(
                    ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine()));
        }

        hasReturn = true;
        ReturnNode returnNode = new ReturnNode();

        if (ctx.value() != null) {
            ValueNode returnValue = (ValueNode) visit(ctx.value());
            returnNode.value = returnValue;

            // Check return type compatibility
            if (currentFunctionReturnType != null && !currentFunctionReturnType.equals("void")) {
                String actualReturnType = getValueType(returnValue);
                if (!isCompatibleType(currentFunctionReturnType, actualReturnType)) {
                    errorManager.addError(new ReturnTypeMismatchError(
                            currentFunctionReturnType, actualReturnType, ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine()));
                }
            }
        } else if (currentFunctionReturnType != null && !currentFunctionReturnType.equals("void")) {
            errorManager.addError(new ReturnTypeMismatchError(
                    currentFunctionReturnType, "void", ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine()));
        }

        return returnNode;
    }

    @Override
    public ASTNode visitIfStatement(GrammarParser.IfStatementContext ctx) {
        IfStatementNode ifStatementNode = new IfStatementNode();
        for (GrammarParser.IfBodyContext ifCtx : ctx.ifBody()) {
            ifStatementNode.addCondition((IfBodyNode) visit(ifCtx));
        }
        if (ctx.ELSE() != null) {
            symbolTable.enterScope("else");
            List<ASTNode> elseStatements = new ArrayList<>();
            for (var stmt : ctx.statement()) {
                elseStatements.add(visit(stmt));
            }
            ifStatementNode.setElseBlock(elseStatements);
            symbolTable.exitScope();
        }
        return ifStatementNode;
    }

    @Override
    public ASTNode visitIfBody(GrammarParser.IfBodyContext ctx) {
        IfBodyNode ifBodyNode = new IfBodyNode();
        ValueNode left = (ValueNode) visit(ctx.value(0));

        if (ctx.value().size() > 1) {
            OperatorExpressionNode operatorExpression = new OperatorExpressionNode();
            operatorExpression.setLeft(left);

            String operator = ctx.DOUBLE_ASSIGN() != null ? "=="
                    : ctx.NOT_EQUAL() != null ? "!="
                    : ctx.DOUBLE_ASSIGN_ID() != null ? "==="
                    : null;

            if (operator == null) throw new RuntimeException("Unknown comparison operator in if statement");

            operatorExpression.setOperator(operator);
            ValueNode right = (ValueNode) visit(ctx.value(1));
            operatorExpression.setRight(right);

            // Check condition types
            String leftType = getValueType(left);
            String rightType = getValueType(right);
            if (!isValidComparison(leftType, rightType, operator)) {
                errorManager.addError(new InvalidComparisonError(
                        leftType, rightType, operator, ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine()));
            }

            left.setOperatorExpression(operatorExpression);
        }

        ifBodyNode.setCondition(left);

        symbolTable.enterScope("if");
        for (var stmt : ctx.statement()) {
            ifBodyNode.addStatement(visit(stmt));
        }
        symbolTable.exitScope();

        return ifBodyNode;
    }

    @Override
    public ASTNode visitComponentStatement(GrammarParser.ComponentStatementContext ctx) {
        ComponentStatementNode componentNode = new ComponentStatementNode();

        if (ctx.SELECTOR() != null) {
            String selector = ctx.STRING().getText().replaceAll("^\"|\"$", "");
            componentNode.setSelector(selector);
        }

        ValueNode templateValue = (ValueNode) visit(ctx.value(0));
        componentNode.setTemplate(templateValue);

        Set<String> propertyNames = new HashSet<>();
        int startIndex = ctx.SELECTOR() != null ? 1 : 0;

        for (int i = startIndex; i < ctx.ID().size(); i++) {
            String key = ctx.ID(i).getText();
            Token token = ctx.ID(i).getSymbol();

            // Check for duplicate component properties
            if (propertyNames.contains(key)) {
                errorManager.addError(new DuplicateComponentPropertyError(
                        key, token.getLine(), token.getCharPositionInLine()));
            }
            propertyNames.add(key);

            // Validate component property
            validateComponentProperty(key, ctx.value(i + 1));

            ValueNode value = (ValueNode) visit(ctx.value(i + 1));
            componentNode.addProperty(key, value);
        }

        return componentNode;
    }

    @Override
    public ASTNode visitFunctionCall(GrammarParser.FunctionCallContext ctx) {
        String functionName = ctx.ID().getText();
        Token token = ctx.ID().getSymbol();

        // Check if function exists
        Symbol function = symbolTable.lookupSymbol(functionName);
        if (function == null) {
            errorManager.addError(new UndefinedFunctionError(
                    functionName, token.getLine(), token.getCharPositionInLine()));
        } else if (!function.getKind().equals("function")) {
            errorManager.addError(new NotAFunctionError(
                    functionName, token.getLine(), token.getCharPositionInLine()));
        } else {
            function.setUsed(true);
        }

        FunctionCallNode functionCallNode = new FunctionCallNode(functionName);
        if (ctx.value() != null) {
            for (var valueCtx : ctx.value()) {
                functionCallNode.addArgument((ValueNode) visit(valueCtx));
            }
        }

        return functionCallNode;
    }

    public ASTNode visitHtml(GrammarParser.HtmlContext ctx) {
        if (ctx.open_tag() != null && ctx.close_tag() != null) {
            HtmlNode node = new HtmlNode(HtmlNode.HtmlType.ELEMENT);
            String openTag = ctx.open_tag().ID().getText();
            String closeTag = ctx.close_tag().ID().getText();

            // Check for mismatched HTML tags
            if (!openTag.equals(closeTag)) {
                errorManager.addError(new MismatchedHtmlTagsError(
                        openTag, closeTag, ctx.close_tag().ID().getSymbol().getLine(), ctx.close_tag().ID().getSymbol().getCharPositionInLine()));
            }

            node.setTagName(openTag);

            if (ctx.open_tag().attribute() != null) {
                Set<String> attributeNames = new HashSet<>();
                for (GrammarParser.AttributeContext attrCtx : ctx.open_tag().attribute()) {
                    String attrName = attrCtx.ID().getText();
                    Token attrToken = attrCtx.ID().getSymbol();

                    // Check for duplicate attributes
                    if (attributeNames.contains(attrName)) {
                        errorManager.addError(new DuplicateHtmlAttributeError(
                                attrName, attrToken.getLine(), attrToken.getCharPositionInLine()));
                    }
                    attributeNames.add(attrName);

                    // Validate Angular directives
                    if (isAngularDirective(attrName)) {
                        validateAngularDirective(attrName, attrToken.getLine(), attrToken.getCharPositionInLine());
                    }

                    node.addAttribute(attrName, stripQuotes(attrCtx.STRING().getText()));
                }
            }

            for (GrammarParser.HtmlContext child : ctx.html()) {
                HtmlNode childNode = (HtmlNode) visitHtml(child);
                node.addChild(childNode);
            }

            return node;

        } else if (ctx.single_tag() != null) {
            HtmlNode node = new HtmlNode(HtmlNode.HtmlType.SELF_CLOSING);
            node.setTagName(ctx.single_tag().ID().getText());

            if (ctx.single_tag().attribute() != null) {
                Set<String> attributeNames = new HashSet<>();
                for (GrammarParser.AttributeContext attrCtx : ctx.single_tag().attribute()) {
                    String attrName = attrCtx.ID().getText();
                    Token attrToken = attrCtx.ID().getSymbol();

                    // Check for duplicate attributes
                    if (attributeNames.contains(attrName)) {
                        errorManager.addError(new DuplicateHtmlAttributeError(
                                attrName, attrToken.getLine(), attrToken.getCharPositionInLine()));
                    }
                    attributeNames.add(attrName);

                    // Validate Angular directives
                    if (isAngularDirective(attrName)) {
                        validateAngularDirective(attrName, attrToken.getLine(), attrToken.getCharPositionInLine());
                    }

                    node.addAttribute(attrName, stripQuotes(attrCtx.STRING().getText()));
                }
            }

            return node;

        } else if (ctx.TEXT_HTML() != null) {
            HtmlNode node = new HtmlNode(HtmlNode.HtmlType.TEXT);
            node.setTextContent(ctx.TEXT_HTML().getText());
            return node;

        } else if (ctx.getStart().getType() == gen.MyLexer.LBRACE_HTML || ctx.getStart().getType() == gen.MyLexer.LBRACE) {
            HtmlNode node = new HtmlNode(HtmlNode.HtmlType.EMBEDDED_STATEMENTS);
            for (GrammarParser.StatementContext stmt : ctx.statement()) {
                node.addEmbeddedStatement(visit(stmt));
            }
            return node;
        }

        return null;
    }

    // Helper methods for semantic analysis
    private String getValueType(ValueNode valueNode) {
        if (valueNode == null || valueNode.getPrimaryValue() == null) return "unknown";

        PrimaryValueNode primaryValue = valueNode.getPrimaryValue();
        if (primaryValue instanceof NumberNode) return "number";
        if (primaryValue instanceof StringNode) return "string";
        if (primaryValue instanceof ArrayNode) return "array";
        if (primaryValue instanceof ObjectNode) return "object";
        if (primaryValue instanceof IdentifierNode) {
            String varName = ((IdentifierNode) primaryValue).getName();
            Symbol symbol = symbolTable.lookupSymbol(varName);
            return symbol != null ? symbol.getType() : "unknown";
        }
        if (primaryValue instanceof FunctionCallNode) return "any";

        return "unknown";
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
                return true;
            case "<":
            case ">":
            case "<=":
            case ">=":
                return leftType.equals("number") && rightType.equals("number");
            case "&&":
            case "||":
                return true;
            default:
                return false;
        }
    }

    private boolean isValidComparison(String leftType, String rightType, String operator) {
        switch (operator) {
            case "==":
            case "!=":
                return true;
            case "===":
            case "!==":
                return true;
            case "<":
            case ">":
            case "<=":
            case ">=":
                return (leftType.equals("number") && rightType.equals("number")) ||
                        (leftType.equals("string") && rightType.equals("string"));
            default:
                return false;
        }
    }

    private boolean isCompatibleType(String expectedType, String actualType) {
        if (expectedType.equals("any") || actualType.equals("any")) return true;
        if (expectedType.equals(actualType)) return true;
        return false;
    }

    private boolean isValidType(String typeName) {
        Set<String> validTypes = Set.of(
                "string", "number", "boolean", "any", "void", "object", "array",
                "Date", "RegExp", "Function", "Promise", "Observable"
        );
        return validTypes.contains(typeName);
    }

    private boolean isAssignmentContext(GrammarParser.PrimaryValueContext ctx) {
        return false; // Simplified for now
    }

    private String getMemberName(ASTNode member) {
        if (member instanceof VariableDeclarationNode) {
            VariableDeclarationNode varDecl = (VariableDeclarationNode) member;
            return varDecl.getAssignment().getIdentifier();
        }
        if (member instanceof FunctionDeclarationNode) {
            FunctionDeclarationNode funcDecl = (FunctionDeclarationNode) member;
            return funcDecl.getName();
        }
        return null;
    }

    private void checkUnusedSymbols() {
        List<Symbol> unusedSymbols = symbolTable.getUnusedSymbols();
        for (Symbol symbol : unusedSymbols) {
            if (!symbol.getKind().equals("import")) {
                errorManager.addError(new UnusedVariableError(
                        symbol.getName(), symbol.getLine(), symbol.getColumn()));
            }
        }
    }

    private void checkNullSafety(ValueNode value, int line, int column) {
        if (value != null && value.getModifier() != null) {
            String modifier = value.getModifier();
            String valueType = getValueType(value);

            if (modifier.equals("!") && (valueType.equals("null") || valueType.equals("undefined"))) {
                errorManager.addError(new NonNullAssertionError(line, column));
            }
        }
    }

    private void validateComponentProperty(String propertyName, GrammarParser.ValueContext valueCtx) {
        Set<String> validComponentProperties = Set.of(
                "selector", "template", "templateUrl", "styleUrls", "styles",
                "inputs", "outputs", "providers", "viewProviders", "changeDetection"
        );

        if (!validComponentProperties.contains(propertyName)) {
            errorManager.addError(new InvalidComponentPropertyError(
                    propertyName, valueCtx.getStart().getLine(), valueCtx.getStart().getCharPositionInLine()));
        }
    }

    private boolean isAngularDirective(String attrName) {
        return attrName.startsWith("*") || attrName.startsWith("[") ||
                attrName.startsWith("(") || attrName.startsWith("[(");
    }

    private void validateAngularDirective(String directiveName, int line, int column) {
        Set<String> validDirectives = Set.of(
                "*ngFor", "*ngIf", "*ngSwitch", "[ngClass]", "[ngStyle]",
                "(click)", "(change)", "(submit)", "[(ngModel)]"
        );

        if (!validDirectives.contains(directiveName) &&
                !directiveName.matches("\\*ng[A-Z].*") &&
                !directiveName.matches("\\[.*\\]") &&
                !directiveName.matches("\\(.*\\)") &&
                !directiveName.matches("\\[\\(.*\\)\\]")) {
            errorManager.addError(new InvalidAngularDirectiveError(
                    directiveName, line, column));
        }
    }

    private String stripQuotes(String s) {
        if (s == null || s.length() < 2) return s;
        return s.substring(1, s.length() - 1);
    }

    // Method to get compilation summary
    public void printCompilationSummary() {
        errorManager.printErrorsSummary();
        if (errorManager.hasErrors() || errorManager.hasWarnings()) {
            System.out.println("\nDetailed Errors:");
            errorManager.printAllErrors();
        }
    }
}