package Classes;

public class PropertyAccessValueNode extends PrimaryValueNode {
    private ASTNode left;
    private ASTNode right;

    public PropertyAccessValueNode(ASTNode left, ASTNode right) {
        this.left = left;
        this.right = right;
    }

    public ASTNode getLeft() {
        return left;
    }

    public ASTNode getRight() {
        return right;
    }

    public void setLeft(ASTNode left) {
        this.left = left;
    }

    public void setRight(ASTNode right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return "PropertyAccessValueNode{" +
                "left=" + left +
                ", right=" + right +
                '}';
    }
}
