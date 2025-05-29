package Classes;

public class ParenthesizedValueNode extends PrimaryValueNode {
    private final ValueNode innerValue;

    public ParenthesizedValueNode(ValueNode innerValue) {
        this.innerValue = innerValue;
    }

    public ValueNode getInnerValue() {
        return innerValue;
    }

    @Override
    public String toString() {
        return "\nParenthesizedValueNode(" + innerValue + ")";
    }
}
