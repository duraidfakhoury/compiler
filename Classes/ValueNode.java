package Classes;

public class ValueNode extends ASTNode {
    public Object value;  // Store any type of value

    // Position metadata
    public int lineNumber;
    public int columnNumber;

    public ValueNode(Object value) {
        super("ValueNode");
        this.value = value;
        this.lineNumber = -1;  // Default to no position information
        this.columnNumber = -1;
    }

    // Constructor with position metadata
    public ValueNode(Object value, int lineNumber, int columnNumber) {
        super("ValueNode");
        this.value = value;
        this.lineNumber = lineNumber;
        this.columnNumber = columnNumber;
    }

    // Optionally, if you need setter methods
    public void setValue(Object value) {
        this.value = value;
    }

    public Object getValue() {
        return value;
    }

    // Add the getType() method to return the type of the value
    public String getType() {
        if (value instanceof Integer) {
            return "Integer";
        } else if (value instanceof Double) {
            return "Double";
        } else if (value instanceof String) {
            return "String";
        } else if (value instanceof Boolean) {
            return "Boolean";
        } else {
            return "Unknown";  // If the type isn't recognized
        }
    }

    @Override
    public String toString() {
        return "ValueNode{" +
                "value=" + value +
                '}'+"\n";
    }
}
