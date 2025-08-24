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
    public ASTNode visitProgramRule(GrammarParser.ProgramRuleContext ctx) {
        ProgramNode programNode = new ProgramNode();
        for (var statementCtx : ctx.statements) {
            ASTNode statement = visit(statementCtx);
            if (statement != null) programNode.addStatement(statement);
        }

        checkUnusedSymbols();

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
    public ASTNode visitVarDeclarationRule(GrammarParser.VarDeclarationRuleContext ctx) {
        String kind = ctx.kind.getText();

        VariableDeclarationNode variableDeclarationNode = new VariableDeclarationNode(kind);

        VariableAssignNode assignNode = (VariableAssignNode) visit(ctx.assign);
        variableDeclarationNode.setAssignment(assignNode);

        String varName = ctx.assign.varName.getText(); // Direct access from context
        Token token = ctx.assign.varName.getSymbol();

        if (kind.equals("const") && ctx.assign.expr == null) {
            symbolTable.addSemanticError(
                    "Const variable '" + varName + "' must be initialized at line " + token.getLine()
            );
        }

        String varType = "any";
        if (ctx.assign.type != null) {
            varType = ctx.assign.type.type.getText();
        }

        boolean declared = symbolTable.declareSymbol(
                varName,
                varType,
                kind,
                token.getLine(),
                token.getCharPositionInLine()
        );

        if (ctx.assign.expr != null && declared) {
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
        if (ctx.type != null) {
            TypeDefineNode typeNode = (TypeDefineNode) visit(ctx.type);
            variableAssignNode.setType(typeNode);
        }
        if (ctx.expr != null) {
            variableAssignNode.setValue((ValueNode) visit(ctx.expr));
        }

        return variableAssignNode;
    }

    @Override
    public ASTNode visitTypeDefineRule(GrammarParser.TypeDefineRuleContext ctx) {
        return new TypeDefineNode(ctx.type.getText(), ctx.LBRACKET() != null);
    }

    @Override
    public ASTNode visitAsTypeRule(GrammarParser.AsTypeRuleContext ctx) {
        return new TypeNode(ctx.type.getText(), ctx.LBRACKET() != null);
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
        OperatorExpressionNode opExpr = new OperatorExpressionNode(left, op, right);
        ValueNode node = new ValueNode(left.getPrimaryValue());
        node.setOperatorExpression(opExpr);
        return node;
    }

    @Override
    public ASTNode visitPrimaryValueExpr(GrammarParser.PrimaryValueExprContext ctx) {
        PrimaryValueNode primaryValue = (PrimaryValueNode) visit(ctx.pv);
        ValueNode valueNode = new ValueNode(primaryValue);

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

        // SEMANTIC ERROR 3: Check for undefined variables
        Symbol symbol = symbolTable.lookupSymbol(varName);
        if (symbol == null) {
            symbolTable.addSemanticError("Undefined variable '" + varName + "' at line " +
                    ctx.id.getSymbol().getLine());
        } else {
            symbol.setUsed(true);

            // SEMANTIC ERROR 4: Check for uninitialized variable usage
            if (!symbol.isInitialized() && !symbol.getKind().equals("parameter")) {
                symbolTable.addSemanticError("Variable '" + varName + "' used before initialization at line " +
                        ctx.id.getSymbol().getLine());
            }
        }

        return new IdentifierNode(varName);
    }

    @Override
    public ASTNode visitParenValue(GrammarParser.ParenValueContext ctx) {
        return new ParenthesizedValueNode((ValueNode) visit(ctx.inner));
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
        return arrayNode;
    }

    @Override
    public ASTNode visitObjectRule(GrammarParser.ObjectRuleContext ctx) {
        ObjectNode objectNode = new ObjectNode();
        for (GrammarParser.PairContext pairCtx : ctx.pairs) {
            String key = pairCtx.key.getText();
            ValueNode valueNode = (ValueNode) visit(pairCtx.val);
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
        return new ArrayAccessNode(arrayName, index);
    }

    @Override
    public ASTNode visitImportRule(GrammarParser.ImportRuleContext ctx) {
        String source = ctx.path.getText().replaceAll("^\"|\"$", "");
        ImportNode importNode = new ImportNode(source);

        if (ctx.def != null) {
            String importName = ctx.def.id.getText();
            Token token = ctx.def.id.getSymbol();

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
            importNode.setHtmlImport(ctx.named.LBRACE_HTML() != null);
            for (GrammarParser.ImportSpecifierContext spec : ctx.named.imports) {
                String importName = spec.name.getText();
                Token token = spec.name.getSymbol();

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
        Token token = ctx.name.getSymbol();

        // Declare class in symbol table
        symbolTable.declareSymbol(className, "class", "class", token.getLine(), token.getCharPositionInLine());

        // Enter class scope
        symbolTable.enterScope(className);

        ClassNode classNode = new ClassNode(className);
        for (GrammarParser.ClassBodyStatementContext stmtCtx : ctx.body.stmts) {
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
        Token token = ctx.funcName.getSymbol();

        // Declare function in symbol table
        symbolTable.declareSymbol(functionName, "function", "function", token.getLine(), token.getCharPositionInLine());

        // Enter function scope
        symbolTable.enterScope(functionName);
        inFunction = true;
        currentFunctionName = functionName;

        List<String> parameters = new ArrayList<>();
        if (ctx.params != null) {
            for (TerminalNode param : ctx.params) {
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
        }

        FunctionBodyNode body = (FunctionBodyNode) visit(ctx.body);

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

        // Handle parameters - either single param or multiple params in parentheses
        if (ctx.singleParam != null) {
            String paramName = ctx.singleParam.getText();
            Token paramToken = ctx.singleParam.getSymbol();
            params.add(paramName);

            // Declare arrow function parameter
            symbolTable.declareSymbol(paramName, "any", "parameter", paramToken.getLine(), paramToken.getCharPositionInLine());
            Symbol paramSymbol = symbolTable.lookupSymbol(paramName);
            if (paramSymbol != null) {
                paramSymbol.setInitialized(true);
            }
        } else if (ctx.params != null) {
            for (TerminalNode id : ctx.params) {
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
        Token token = ctx.funcName.getSymbol();

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
        }

        ifBodyNode.setCondition(left);
        symbolTable.enterScope("if");
        for (GrammarParser.StatementContext stmtCtx : ctx.stmts) {
            ifBodyNode.addStatement(visit(stmtCtx));
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
        symbolTable.exitScope();
        return new DoWhileStatementNode(body, cond);
    }

    @Override
    public ASTNode visitWhileLoop(GrammarParser.WhileLoopContext ctx) {
        ASTNode cond = visit(ctx.cond);
        ASTNode loopBody;

        symbolTable.enterScope("while");
        if (ctx.single != null) {
            loopBody = visit(ctx.single);
        } else {
            List<ASTNode> stmts = new ArrayList<>();
            for (var stmt : ctx.stmts) {
                stmts.add(visit(stmt));
            }
            loopBody = new BlockNode(stmts);
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

        ValueNode templateValue = (ValueNode) visit(ctx.template);
        componentNode.setTemplate(templateValue);

        if (ctx.keys != null) {
            for (int i = 0; i < ctx.keys.size(); i++) {
                String key = ctx.keys.get(i).getText();
                ValueNode value = (ValueNode) visit(ctx.vals.get(i));
                componentNode.addProperty(key, value);
            }
        }

        return componentNode;
    }

    // HTML handling methods - updated to match new grammar
    @Override
    public ASTNode visitHtmlElement(GrammarParser.HtmlElementContext ctx) {
        HtmlNode node = new HtmlNode(HtmlNode.HtmlType.ELEMENT);

        // Get tag name from open tag
        String tagName = getHtmlElementName(ctx.open);
        node.setTagName(tagName);

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
        node.setTextContent(ctx.text.getText());
        return node;
    }

    // Helper methods
    private String getHtmlElementName(GrammarParser.Open_tagContext openTag) {
        if (openTag != null) {
            return openTag.name.getText();
        }
        return "";
    }

    private String getHtmlElementName(GrammarParser.Single_tagContext singleTag) {
        if (singleTag != null) {
            return singleTag.name.getText();
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
    }

    private String stripQuotes(String s) {
        if (s == null || s.length() < 2) return s;
        return s.substring(1, s.length() - 1);
    }

    // Additional visitor methods for increment/decrement operations
    @Override
    public ASTNode visitIncrease_variable(GrammarParser.Increase_variableContext ctx) {
        String varName = ctx.id.getText();
        Token token = ctx.id.getSymbol();

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
        }

        boolean isPrefix = ctx.PLUSPLUS().getSymbol().getTokenIndex() < ctx.id.getSymbol().getTokenIndex();
        return new IncrementNode(varName, isPrefix);
    }

    @Override
    public ASTNode visitDecrease_variable(GrammarParser.Decrease_variableContext ctx) {
        String varName = ctx.id.getText();
        Token token = ctx.id.getSymbol();

        // Check if variable exists and is initialized
        Symbol symbol = symbolTable.lookupSymbol(varName);
        if (symbol == null) {
            symbolTable.addSemanticError("Undefined variable '" + varName + "' at line " + token.getLine());
        } else {
            symbol.setUsed(true);
            if (!symbol.isInitialized()) {
                symbolTable.addSemanticError("Variable '" + varName + "' used before initialization at line " + token.getLine());
            }
            // Check if it's a number type for decrement operation
            if (!symbol.getType().equals("number") && !symbol.getType().equals("any")) {
                symbolTable.addSemanticError("Cannot decrement non-numeric variable '" + varName + "' at line " + token.getLine());
            }
        }

        boolean isPrefix = ctx.MINUSMINUS().getSymbol().getTokenIndex() < ctx.id.getSymbol().getTokenIndex();
        return new DecrementNode(varName, isPrefix);
    }

    // Binary operator visitor
    @Override
    public ASTNode visitBinaryOp(GrammarParser.BinaryOpContext ctx) {
        // This method returns the operator text
        // The actual binary operation handling is done in visitBinaryValue
        return null;
    }

    // Operator expression visitor
    @Override
    public ASTNode visitOperatorExpression(GrammarParser.OperatorExpressionContext ctx) {
        if (ctx.val != null) {
            if (ctx.DOT() != null) {
                // Property access
                ValueNode object = new ValueNode(null); // This should be set by the parent context
                ValueNode property = (ValueNode) visit(ctx.val);
                return new PropertyAccessNode(object, property);
            } else if (ctx.DOUBLE_QMARK() != null) {
                // Nullish coalescing
                ValueNode left = new ValueNode(null); // This should be set by the parent context
                ValueNode right = (ValueNode) visit(ctx.val);
                return new OperatorExpressionNode(left, "??", right);
            } else if (ctx.OR() != null) {
                // Logical OR
                ValueNode left = new ValueNode(null);
                ValueNode right = (ValueNode) visit(ctx.val);
                return new OperatorExpressionNode(left, "||", right);
            } else if (ctx.AND() != null) {
                // Logical AND
                ValueNode left = new ValueNode(null);
                ValueNode right = (ValueNode) visit(ctx.val);
                return new OperatorExpressionNode(left, "&&", right);
            }
        } else if (ctx.comp != null) {
            return visit(ctx.comp);
        }
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
}