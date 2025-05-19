package Classes;

public class EmptyNode extends ASTNode {

    // Default constructor
    public EmptyNode() {
        super("EmptyNode");
    }

    // Constructor with position metadata
    public EmptyNode(int lineNumber, int columnNumber) {
        super("EmptyNode", lineNumber, columnNumber);
    }

    @Override
    public String toString() {
        return "EmptyNode{" +
                "type='" + type + '\'' +
                '}';
    }
}

