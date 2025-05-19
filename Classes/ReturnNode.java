package Classes;

class ReturnNode extends ASTNode {
    public ASTNode value;  // The value being returned (optional)
    public int lineNumber;  // Line number of the return statement (optional)
    public int columnNumber;  // Column number of the return statement (optional)

    public ReturnNode() {
        super("ReturnNode");
        this.lineNumber = -1;  // Default to -1, meaning no position info available
        this.columnNumber = -1;  // Default to -1
    }

    // Constructor with position metadata
    public ReturnNode(int lineNumber, int columnNumber) {
        super("ReturnNode");
        this.lineNumber = lineNumber;
        this.columnNumber = columnNumber;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ReturnNode{");
        sb.append("lineNumber=").append(lineNumber)
                .append(", columnNumber=").append(columnNumber);
        if (value != null) {
            sb.append(", value=").append(value.toString());
        }
        sb.append("}");
        return sb.toString();
    }
}
