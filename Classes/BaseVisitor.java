package Classes;

import gen.GrammarParser;
import gen.GrammarParserBaseVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.Token;

import java.util.ArrayList;
import java.util.List;

public class BaseVisitor extends GrammarParserBaseVisitor<ASTNode> {
    SymbolTable symbolTable = new SymbolTable();
    private boolean inFunction = false;
    private String currentFunctionName = null;

    // Getter for symbol table
    public SymbolTable getSymbolTable() {
        return symbolTable;
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

        // SEMANTIC ERROR 1: Check for const without initialization
        String varName = ctx.variableAssign().ID().getText();
        Token token = ctx.variableAssign().ID().getSymbol();

        if (kind.equals("const") && ctx.variableAssign().value() == null) {
            symbolTable.addSemanticError("Const variable '" + varName + "' must be initialized at line " + token.getLine());
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
        return new TypeDefineNode(ctx.ID().getText(), ctx.LBRACKET() != null);
    }

    @Override
    public ASTNode visitValue(GrammarParser.ValueContext ctx) {
        if (ctx.binaryOp() != null) {
            ValueNode left = (ValueNode) visit(ctx.value(0));
            ValueNode right = (ValueNode) visit(ctx.value(1));
            String op = ctx.binaryOp().getText();

            // SEMANTIC ERROR 2: Type checking for binary operations
            String leftType = getValueType(left);
            String rightType = getValueType(right);

            if (!isValidBinaryOperation(leftType, rightType, op)) {
                symbolTable.addSemanticError("Invalid binary operation: " + leftType + " " + op + " " + rightType +
                        " at line " + ctx.getStart().getLine());
            }

            OperatorExpressionNode opExpr = new OperatorExpressionNode(left, op, right);
            ValueNode node = new ValueNode(left.getPrimaryValue());
            node.setOperatorExpression(opExpr);

            if (ctx.QMARK() != null) node.setModifier("?");
            else if (ctx.EMARK() != null) node.setModifier("!");

            if (ctx.asType() != null) {
                node.setAsType((TypeNode) visit(ctx.asType()));
            }
            return node;
        }

        PrimaryValueNode primaryValue = (PrimaryValueNode) visit(ctx.primaryValue());
        ValueNode valueNode = new ValueNode(primaryValue);

        if (ctx.QMARK() != null) valueNode.setModifier("?");
        else if (ctx.EMARK() != null) valueNode.setModifier("!");

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

            // SEMANTIC ERROR 3: Check for undefined variables
            Symbol symbol = symbolTable.lookupSymbol(varName);
            if (symbol == null) {
                symbolTable.addSemanticError("Undefined variable '" + varName + "' at line " +
                        ctx.ID().getSymbol().getLine());
            } else {
                // Mark as used
                symbol.setUsed(true);

                // SEMANTIC ERROR 4: Check for uninitialized variable usage
                if (!symbol.isInitialized() && !symbol.getKind().equals("parameter")) {
                    symbolTable.addSemanticError("Variable '" + varName + "' used before initialization at line " +
                            ctx.ID().getSymbol().getLine());
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
        for (GrammarParser.ValueContext valueCtx : ctx.value()) {
            arrayNode.addElement((ValueNode) visit(valueCtx));
        }
        return arrayNode;
    }

    @Override
    public ASTNode visitObject(GrammarParser.ObjectContext ctx) {
        ObjectNode objectNode = new ObjectNode();
        for (GrammarParser.PairContext pairCtx : ctx.pair()) {
            String key = pairCtx.ID().getText();
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

            // Declare imported symbol
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

        // Declare class in symbol table
        symbolTable.declareSymbol(className, "class", "class", token.getLine(), token.getCharPositionInLine());

        // Enter class scope
        symbolTable.enterScope(className);

        ClassNode classNode = new ClassNode(className);
        for (GrammarParser.ClassBodyStatementContext stmtCtx : ctx.classBody().classBodyStatement()) {
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
    public ASTNode visitFunctionDeclaration(GrammarParser.FunctionDeclarationContext ctx) {
        String functionName = ctx.ID().getFirst().getText();
        Token token = ctx.ID().getFirst().getSymbol();

        // Declare function in symbol table
        symbolTable.declareSymbol(functionName, "function", "function", token.getLine(), token.getCharPositionInLine());

        // Enter function scope
        symbolTable.enterScope(functionName);
        inFunction = true;
        currentFunctionName = functionName;

        List<String> parameters = new ArrayList<>();
        for (TerminalNode param : ctx.ID().subList(1, ctx.ID().size())) {
            String paramName = param.getText();
            Token paramToken = param.getSymbol();
            parameters.add(paramName);

            // Declare parameters in symbol table
            symbolTable.declareSymbol(paramName, "any", "parameter", paramToken.getLine(), paramToken.getCharPositionInLine());
            Symbol paramSymbol = symbolTable.lookupSymbol(paramName);
            if (paramSymbol != null) {
                paramSymbol.setInitialized(true);
            }
        }

        FunctionBodyNode body = (FunctionBodyNode) visit(ctx.functionBody());

        // Exit function scope
        symbolTable.exitScope();
        inFunction = false;
        currentFunctionName = null;

        return new FunctionDeclarationNode(functionName, parameters, body);
    }

    @Override
    public ASTNode visitFunctionBody(GrammarParser.FunctionBodyContext ctx) {
        FunctionBodyNode bodyNode = new FunctionBodyNode();
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

                // Declare arrow function parameters
                symbolTable.declareSymbol(paramName, "any", "parameter", paramToken.getLine(), paramToken.getCharPositionInLine());
                Symbol paramSymbol = symbolTable.lookupSymbol(paramName);
                if (paramSymbol != null) {
                    paramSymbol.setInitialized(true);
                }
            }
            bodyNode.setParams(params);
            bodyNode.setArrowValue((ValueNode) visit(ctx.value()));
        }

        if (ctx.typeDefine() != null) {
            bodyNode.setReturnType((TypeDefineNode) visit(ctx.typeDefine()));
        }
        return bodyNode;
    }

    @Override
    public ASTNode visitReturn(GrammarParser.ReturnContext ctx) {
        // SEMANTIC ERROR 5: Return statement outside function
        if (!inFunction) {
            symbolTable.addSemanticError("Return statement outside function at line " + ctx.getStart().getLine());
        }

        ReturnNode returnNode = new ReturnNode();
        if (ctx.value() != null) {
            returnNode.value = visit(ctx.value());
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
            operatorExpression.setRight((ValueNode) visit(ctx.value(1)));

            left.setOperatorExpression(operatorExpression);
        }

        ifBodyNode.setCondition(left);

        // Enter if scope
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

        int startIndex = ctx.SELECTOR() != null ? 1 : 0;
        for (int i = startIndex; i < ctx.ID().size(); i++) {
            String key = ctx.ID(i).getText();
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
            symbolTable.addSemanticError("Undefined function '" + functionName + "' at line " + token.getLine());
        } else if (!function.getKind().equals("function")) {
            symbolTable.addSemanticError("'" + functionName + "' is not a function at line " + token.getLine());
        } else {
            function.setUsed(true);
        }

        // Visit function arguments
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
            node.setTagName(ctx.open_tag().ID().getText());

            if (ctx.open_tag().attribute() != null) {
                for (GrammarParser.AttributeContext attrCtx : ctx.open_tag().attribute()) {
                    node.addAttribute(attrCtx.ID().getText(), stripQuotes(attrCtx.STRING().getText()));
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
                for (GrammarParser.AttributeContext attrCtx : ctx.single_tag().attribute()) {
                    node.addAttribute(attrCtx.ID().getText(), stripQuotes(attrCtx.STRING().getText()));
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
        if (primaryValue instanceof IdentifierNode) {
            String varName = ((IdentifierNode) primaryValue).getName();
            Symbol symbol = symbolTable.lookupSymbol(varName);
            return symbol != null ? symbol.getType() : "unknown";
        }
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
                return true; // Any types can be compared
            case "<":
            case ">":
            case "<=":
            case ">=":
                return leftType.equals("number") && rightType.equals("number");
            default:
                return false;
        }
    }

    private void checkUnusedSymbols() {
        // This would require access to all symbols in all scopes
        // Implementation depends on your SymbolTable structure
    }

    private String stripQuotes(String s) {
        if (s == null || s.length() < 2) return s;
        return s.substring(1, s.length() - 1);
    }
}