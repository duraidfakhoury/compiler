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
    
    public PropertyNode getProperty(String key) {
        for (PropertyNode prop : properties) {
            if (prop.getKey().equals(key)) {
                return prop;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "\nObjectNode{" + properties + "}";
    }
}
