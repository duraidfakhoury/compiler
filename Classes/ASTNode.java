package Classes;

import java.util.*;

public class ASTNode {
    public String type;  // Type of the node (e.g., 'variableDeclaration', 'functionCall', etc.)
    public List<ASTNode> children = new ArrayList<>();

    // Position metadata for debugging and error reporting
    public int lineNumber;
    public int columnNumber;

    // Additional data that may be useful in specific nodes (e.g., for variables, function names)
    public Object value;

    // Constructor to create ASTNode with type and optional position metadata
    public ASTNode(String type) {
        this.type = type;
    }

    // Constructor with position information
    public ASTNode(String type, int lineNumber, int columnNumber) {
        this(type);
        this.lineNumber = lineNumber;
        this.columnNumber = columnNumber;
    }

    // Add a child node
    public void addChild(ASTNode child) {
        children.add(child);
    }

    // Set value (for nodes that have specific data, e.g., variable values or function names)
    public void setValue(Object value) {
        this.value = value;
    }

    // Get all descendants of the node (recursively)
    public List<ASTNode> getDescendants() {
        List<ASTNode> descendants = new ArrayList<>(children);
        for (ASTNode child : children) {
            descendants.addAll(child.getDescendants());
        }
        return descendants;
    }

    // Override toString() to print the tree structure
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(type);

        if (value != null) {
            sb.append(" [value=" + value + "]");
        }


        if (!children.isEmpty()) {
            sb.append(" {\n");
            for (ASTNode child : children) {
                sb.append("  ").append(child.toString().replaceAll("(?m)^", "  ")).append("\n");
            }
            sb.append("}");
        }

        return sb.toString();
    }

}
