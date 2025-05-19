package Classes;

import java.util.*;


public class ComponentNode extends ASTNode {
    public String selector;
    public String template;
    public Map<String, String> properties = new HashMap<>();

    public ComponentNode() {
        super("ComponentNode");
    }

    @Override
    public String toString() {
        return "ComponentNode{" +
                "selector='" + selector + '\'' +
                ", template='" + template + '\'' +
                ", properties=" + properties +
                '}';
    }
}

