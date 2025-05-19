package Classes;

public class BinaryExpressionNode extends ASTNode {
    public String operator; // e.g., +, -, *, /, ==, etc.
    public ASTNode left;    // Left operand
    public ASTNode right;   // Right operand

    // The result of the expression after evaluation (optional)
    public Object value;

    public BinaryExpressionNode() {
        super("BinaryExpressionNode");
    }

    // Constructor with position metadata and operands
    public BinaryExpressionNode(String operator, ASTNode left, ASTNode right, int lineNumber, int columnNumber) {
        super("BinaryExpressionNode", lineNumber, columnNumber);
        this.operator = operator;
        this.left = left;
        this.right = right;
    }

    // Evaluate the binary expression (if possible)
    public Object evaluate() {
        // Example of evaluating a simple expression (only handles numbers here)
        if (left instanceof ValueNode && right instanceof ValueNode) {
            double leftValue = (double) ((ValueNode) left).value;
            double rightValue = (double) ((ValueNode) right).value;

            switch (operator) {
                case "+":
                    value = leftValue + rightValue;
                    break;
                case "-":
                    value = leftValue - rightValue;
                    break;
                case "*":
                    value = leftValue * rightValue;
                    break;
                case "/":
                    value = leftValue / rightValue;
                    break;
                case "==":
                    value = leftValue == rightValue;
                    break;
                // Add more cases for other operators as needed
                default:
                    value = null;
                    break;
            }
        }
        return value;
    }

    @Override
    public String toString() {
        return "BinaryExpressionNode{operator=" + operator
                + ", left=" + (left != null ? left.toString() : "null")
                + ", right=" + (right != null ? right.toString() : "null")
                + ", value=" + (value != null ? value : "not evaluated") + "}";
    }
}
