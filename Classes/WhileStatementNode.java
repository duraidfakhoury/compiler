package Classes;

public class WhileStatementNode extends ASTNode {
    public final ASTNode condition;
    public final ASTNode body;

    public WhileStatementNode(ASTNode condition, ASTNode body) {
        this.condition = condition;
        this.body = body;
    }

    public ASTNode getCondition() {
        return condition;
    }

    public ASTNode getBody() {
        return body;
    }

    @Override
    public String toString() {
        return "WhileStatement(\n  condition=" + condition + ",\n  body=" + body + "\n)";
    }
}
