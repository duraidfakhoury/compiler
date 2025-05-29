package Classes;

public class ArrayAccessNode extends PrimaryValueNode {
    private final String arrayName;
    private final ValueNode index;

    public ArrayAccessNode(String arrayName, ValueNode index) {
        this.arrayName = arrayName;
        this.index = index;
    }

    public String getArrayName() {
        return arrayName;
    }

    public ValueNode getIndex() {
        return index;
    }

    @Override
    public String toString() {
        return "\nArrayAccessNode{" +
                "arrayName='" + arrayName + '\'' +
                ", index=" + index +
                "}";
    }
}
