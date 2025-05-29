package Classes;

public class IdentifierNode extends PrimaryValueNode {
    private final String name;

    public IdentifierNode(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "\nIdentifierNode{" + name + "}";
    }
}