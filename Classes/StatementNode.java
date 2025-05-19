package Classes;

class StatementNode extends ASTNode {
    public int lineNumber;  // Line number of the statement (optional)
    public int columnNumber;  // Column number of the statement (optional)

    public StatementNode() {
        super("StatementNode");
        this.lineNumber = -1;  // Default to -1, meaning no position info available
        this.columnNumber = -1;  // Default to -1
    }

    // Constructor with position metadata
    public StatementNode(int lineNumber, int columnNumber) {
        super("StatementNode");
        this.lineNumber = lineNumber;
        this.columnNumber = columnNumber;
    }

    @Override
    public String toString() {
        return "StatementNode{" +
                "lineNumber=" + lineNumber +
                ", columnNumber=" + columnNumber +
                '}';
    }
}
