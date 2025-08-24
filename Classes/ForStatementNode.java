package Classes;

public class ForStatementNode extends ASTNode {
    public final ASTNode init;
    public final ASTNode condition;
    public final ASTNode step;
    public final ASTNode body;

    public ForStatementNode(ASTNode init, ASTNode condition, ASTNode step, ASTNode body) {
        this.init = init;
        this.condition = condition;
        this.step = step;
        this.body = body;
    }

    public ASTNode getInit() {
        return init;
    }

    public ASTNode getCondition() {
        return condition;
    }

    public ASTNode getStep() {
        return step;
    }

    public ASTNode getBody() {
        return body;
    }

    @Override
    public String toString() {
        return "ForStatement(\n  init=" + init + ",\n  condition=" + condition + ",\n  step=" + step + ",\n  body=" + body + "\n)";
    }
}
