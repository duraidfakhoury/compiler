package Classes;

import java.util.*;

public class ObjectNode extends ASTNode {
    public List<PropertyNode> properties;  // List of properties as key-value pairs

    public ObjectNode() {
        super("ObjectNode");
        this.properties = new ArrayList<>();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(type + " [properties=");
        for (PropertyNode property : properties) {
            sb.append(property.toString()).append(", ");
        }
        sb.setLength(sb.length() - 2);  // Remove last comma and space
        sb.append("]");
        return sb.toString();
    }
}

class PropertyNode {
    public String key;     // The key of the property
    public ASTNode value;  // The value of the property (can be any ASTNode)

    public PropertyNode(String key, ASTNode value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        return "PropertyNode{key=" + key + ", value=" + value + "}";
    }
}
