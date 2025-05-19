package Classes;

import java.util.List;

public class ForLoopNode extends ASTNode {
    public ASTNode initializer;
    public ASTNode condition;
    public ASTNode update;
    public List<ASTNode> body;

    // Default constructor
    public ForLoopNode() {
        super("ForLoopNode");
    }

    // Constructor with position metadata
    public ForLoopNode(int lineNumber, int columnNumber) {
        super("ForLoopNode", lineNumber, columnNumber);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ForLoopNode{");
        sb.append("initializer=").append(initializer).append(", ");
        sb.append("condition=").append(condition).append(", ");
        sb.append("update=").append(update).append(", ");
        sb.append("body=").append(body);
        sb.append("}");
        return sb.toString();
    }
}
