package Classes;

import java.util.List;

public class MethodCallValueNode extends PrimaryValueNode {
    private ASTNode left;
    private List<ASTNode> args;

    public MethodCallValueNode(ASTNode left, List<ASTNode> args) {
        this.left = left;
        this.args = args;
    }

    public ASTNode getLeft() {
        return left;
    }

    public List<ASTNode> getArgs() {
        return args;
    }

    public void setLeft(ASTNode left) {
        this.left = left;
    }

    public void setArgs(List<ASTNode> args) {
        this.args = args;
    }

    @Override
    public String toString() {
        return "MethodCallValueNode{" +
                "left=" + left +
                ", args=" + args +
                '}';
    }
}
