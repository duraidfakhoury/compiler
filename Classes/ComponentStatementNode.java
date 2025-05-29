package Classes;

import java.util.LinkedHashMap;
import java.util.Map;

public class ComponentStatementNode extends ASTNode {
    private String selector;
    private ValueNode template;
    private Map<String, ValueNode> properties = new LinkedHashMap<>();

    public ComponentStatementNode() {
    }

    public void setSelector(String selector) {
        this.selector = selector;
    }

    public String getSelector() {
        return selector;
    }

    public void setTemplate(ValueNode template) {
        this.template = template;
    }

    public ValueNode getTemplate() {
        return template;
    }

    public void addProperty(String key, ValueNode value) {
        properties.put(key, value);
    }

    public Map<String, ValueNode> getProperties() {
        return properties;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ComponentStatementNode { selector: ").append(selector)
                .append(", template: ").append(template)
                .append(", properties: ").append(properties)
                .append(" }");
        return sb.toString();
    }
}
