package Classes;

import java.util.*;

public class ArrayNode extends ASTNode {
    private List<ASTNode> elements = new ArrayList<>();

    public ArrayNode() {
        super("Array");
    }

    public void addElement(ASTNode element) {
        elements.add(element);
    }

    public List<ASTNode> getElements() {
        return elements;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Array: [\n");
        for (ASTNode element : elements) {
            sb.append(element.toString()).append(", ");
        }
        if (!elements.isEmpty()) {
            sb.setLength(sb.length() - 2); // Remove the trailing comma and space
        }
        sb.append("]");
        return sb.toString();
    }
}

