package Classes;

import java.util.*;

public class WhileLoopNode extends ASTNode {
    public ASTNode condition;     // The loop condition
    public List<ASTNode> body = new ArrayList<>(); // Body of the loop, which is a list of statements

    // Position metadata
    public int lineNumber;
    public int columnNumber;

    public WhileLoopNode() {
        super("WhileLoopNode");
        this.lineNumber = -1;  // Default to no position information
        this.columnNumber = -1;
    }

    // Constructor with position metadata
    public WhileLoopNode(ASTNode condition, List<ASTNode> body, int lineNumber, int columnNumber) {
        super("WhileLoopNode");
        this.condition = condition;
        this.body = body;
        this.lineNumber = lineNumber;
        this.columnNumber = columnNumber;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("WhileLoopNode{condition=")
                .append(condition)
                .append(", body=")
                .append(body.isEmpty() ? "empty" : body)
                .append(", lineNumber=")
                .append(lineNumber)
                .append(", columnNumber=")
                .append(columnNumber)
                .append("}");
        return sb.toString();
    }
}
