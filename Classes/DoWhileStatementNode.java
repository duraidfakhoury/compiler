package Classes;

public class DoWhileStatementNode extends ASTNode {
    public final ASTNode body;
    public final ASTNode condition;

    public DoWhileStatementNode(ASTNode body, ASTNode condition) {
        this.body = body;
        this.condition = condition;
    }

    public ASTNode getBody() {
        return body;
    }

    public ASTNode getCondition() {
        return condition;
    }

    @Override
    public String toString() {
        return "DoWhileStatement(\n  body=" + body + ",\n  condition=" + condition + "\n)";
    }
}
