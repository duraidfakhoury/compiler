package Classes;

import java.util.ArrayList;
import java.util.List;

public class ObjectNode extends PrimaryValueNode {
    private final List<PropertyNode> properties = new ArrayList<>();

    public void addProperty(PropertyNode property) {
        properties.add(property);
    }

    public List<PropertyNode> getProperties() {
        return properties;
    }

    @Override
    public String toString() {
        return "\nObjectNode{" + properties + "}";
    }
}

class PropertyNode extends ASTNode {
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
                "}";
    }
}
