package Classes;

class UnaryExpressionNode extends ASTNode {
    public String operator; // e.g., ++, --, !
    public ASTNode operand; // The operand of the unary operator (e.g., the variable or value)

    // Position metadata
    public int lineNumber;
    public int columnNumber;

    public UnaryExpressionNode() {
        super("UnaryExpressionNode");
        this.lineNumber = -1;  // Default to no position information
        this.columnNumber = -1;
    }

    // Constructor with position metadata
    public UnaryExpressionNode(String operator, ASTNode operand, int lineNumber, int columnNumber) {
        super("UnaryExpressionNode");
        this.operator = operator;
        this.operand = operand;
        this.lineNumber = lineNumber;
        this.columnNumber = columnNumber;
    }

    @Override
    public String toString() {
        return "UnaryExpressionNode{" +
                "operator='" + operator + '\'' +
                ", operand=" + operand +
                ", lineNumber=" + lineNumber +
                ", columnNumber=" + columnNumber +
                '}';
    }
}
