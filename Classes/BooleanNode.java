package Classes;

public class BooleanNode extends PrimaryValueNode {
    private boolean value;

    public BooleanNode(boolean value) {
        this.value = value;
    }

    public BooleanNode(String value) {
        this.value = "true".equalsIgnoreCase(value);
    }

    public boolean getValue() {
        return value;
    }

    public void setValue(boolean value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "BooleanNode{" +
                "value=" + value +
                "}";
    }
}
