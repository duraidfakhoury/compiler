package Classes;

public class OperatorExpressionNode extends ASTNode {
    private ValueNode left;
    private ValueNode right;
    private String operator;

    public OperatorExpressionNode() {}

    public OperatorExpressionNode(ValueNode left, String operator, ValueNode right) {
        this.left = left;
        this.operator = operator;
        this.right = right;
    }

    public ValueNode getLeft() {
        return left;
    }

    public void setLeft(ValueNode left) {
        this.left = left;
    }

    public ValueNode getRight() {
        return right;
    }

    public void setRight(ValueNode right) {
        this.right = right;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    @Override
    public String toString() {
        return "\nOperatorExpressionNode{" +
                "left=" + left +
                ", operator='" + operator + '\'' +
                ", right=" + right +
                '}';
    }
}

