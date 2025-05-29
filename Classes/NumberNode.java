package Classes;


public class NumberNode extends PrimaryValueNode {
    private final String value;

    public NumberNode(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "\nNumberNode{" + value + "}";
    }
}
