package Classes;

public class PropertyNode extends ASTNode {
    private final String key;
    private final ValueNode value;

    public PropertyNode(String key, ValueNode value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public ValueNode getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "\nPropertyNode{" +
                "key='" + key + '\'' +
                ", value=" + value +
                '}';
    }
}
