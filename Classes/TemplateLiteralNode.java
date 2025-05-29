package Classes;

import java.util.ArrayList;
import java.util.List;

public class TemplateLiteralNode extends PrimaryValueNode {
    private final List<ASTNode> parts = new ArrayList<>();

    public void addPart(ASTNode part) {
        parts.add(part);
    }

    public List<ASTNode> getParts() {
        return parts;
    }

    @Override
    public String toString() {
        return "\nTemplateLiteralNode{" +
                "parts=" + parts +
                "}";
    }
}
