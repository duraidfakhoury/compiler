package Classes;

import gen.GrammarParser;
import gen.GrammarParserBaseVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.List;

public class BaseVisitor extends GrammarParserBaseVisitor<ASTNode> {
    @Override
    public ASTNode visitProgram(GrammarParser.ProgramContext ctx) {
        ProgramNode programNode = new ProgramNode();
        for (var statementCtx : ctx.statement()) {
            ASTNode statement = visit(statementCtx);
            if (statement != null) programNode.addStatement(statement);
        }
        return programNode;
    }

    @Override
    public ASTNode visitVariableDeclaration(GrammarParser.VariableDeclarationContext ctx) {
        String kind = ctx.CONST() != null ? "const" : ctx.LET() != null ? "let" : "var";
        VariableDeclarationNode variableDeclarationNode = new VariableDeclarationNode(kind);
        VariableAssignNode assignNode = (VariableAssignNode) visit(ctx.variableAssign());
        variableDeclarationNode.setAssignment(assignNode);
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

        // إذا لم يكن تعبير ثنائي
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
        if (ctx.ID() != null) return new IdentifierNode(ctx.ID().getText());
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
            importNode.addImport(ctx.defaultImport().ID().getText());
            importNode.setDefaultImport(true);
        } else {
            importNode.setHtmlImport(ctx.namedImports().LBRACE_HTML() != null);
            for (GrammarParser.ImportSpecifierContext spec : ctx.namedImports().importSpecifier()) {
                importNode.addImport(spec.ID(0).getText());
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
        ClassNode classNode = new ClassNode(ctx.ID().getText());
        for (GrammarParser.ClassBodyStatementContext stmtCtx : ctx.classBody().classBodyStatement()) {
            ASTNode member = visit(stmtCtx);
            if (member instanceof VariableDeclarationNode) classNode.addField((VariableDeclarationNode) member);
            else if (member instanceof FunctionDeclarationNode) classNode.addMethod((FunctionDeclarationNode) member);
            else classNode.addOtherMember(member);
        }
        return classNode;
    }

    @Override
    public ASTNode visitFunctionDeclaration(GrammarParser.FunctionDeclarationContext ctx) {
        String functionName = ctx.ID().getFirst().getText();
        List<String> parameters = new ArrayList<>();
        for (TerminalNode param : ctx.ID().subList(1, ctx.ID().size())) {
            parameters.add(param.getText());
        }
        FunctionBodyNode body = (FunctionBodyNode) visit(ctx.functionBody());
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
            for (TerminalNode id : ctx.ID()) params.add(id.getText());
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
        ReturnNode returnNode = new ReturnNode();
        returnNode.value = visit(ctx.value());
        return returnNode;
    }

    @Override
    public ASTNode visitIfStatement(GrammarParser.IfStatementContext ctx) {
        IfStatementNode ifStatementNode = new IfStatementNode();
        for (GrammarParser.IfBodyContext ifCtx : ctx.ifBody()) {
            ifStatementNode.addCondition((IfBodyNode) visit(ifCtx));
        }
        if (ctx.ELSE() != null) {
            List<ASTNode> elseStatements = new ArrayList<>();
            for (var stmt : ctx.statement()) {
                elseStatements.add(visit(stmt));
            }
            ifStatementNode.setElseBlock(elseStatements);
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
        for (var stmt : ctx.statement()) {
            ifBodyNode.addStatement(visit(stmt));
        }
        return ifBodyNode;
    }

    @Override
    public ASTNode visitComponentStatement(GrammarParser.ComponentStatementContext ctx) {
        ComponentStatementNode componentNode = new ComponentStatementNode();

        // إذا كان هناك SELECTOR
        if (ctx.SELECTOR() != null) {
            String selector = ctx.STRING().getText().replaceAll("^\"|\"$", ""); // نحذف علامات التنصيص
            componentNode.setSelector(selector);
        }

        // الـ TEMPLATE (قيمة)
        ValueNode templateValue = (ValueNode) visit(ctx.value(0));
        componentNode.setTemplate(templateValue);

        // بقية الخصائص (ID : value)
        int startIndex = ctx.SELECTOR() != null ? 1 : 0;  // تحديد بداية خصائص ID: value حسب وجود SELECTOR
        for (int i = startIndex; i < ctx.ID().size(); i++) {
            String key = ctx.ID(i).getText();
            ValueNode value = (ValueNode) visit(ctx.value(i + 1));
            componentNode.addProperty(key, value);
        }

        return componentNode;
    }

}