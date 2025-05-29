package Classes;

import java.util.ArrayList;
import java.util.List;

public class ArrayNode extends PrimaryValueNode {
    private final List<ValueNode> elements = new ArrayList<>();

    public void addElement(ValueNode element) {
        elements.add(element);
    }

    public List<ValueNode> getElements() {
        return elements;
    }

    @Override
    public String toString() {
        return "\nArrayNode{" + elements + "}";
    }
}
