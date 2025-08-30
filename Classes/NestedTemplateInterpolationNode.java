package Classes;

import java.util.List;

public class NestedTemplateInterpolationNode extends ASTNode {
    private List<ASTNode> nested;

    public NestedTemplateInterpolationNode(List<ASTNode> nested) {
        this.nested = nested;
    }

    public List<ASTNode> getNested() {
        return nested;
    }

    public void setNested(List<ASTNode> nested) {
        this.nested = nested;
    }

    public List<ASTNode> getParts() {
        return nested;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("NestedTemplateInterpolationNode{nested=");
        if (nested != null) {
            sb.append("[");
            for (int i = 0; i < nested.size(); i++) {
                sb.append(nested.get(i));
                if (i < nested.size() - 1) {
                    sb.append(", ");
                }
            }
            sb.append("]");
        } else {
            sb.append("null");
        }
        sb.append("}");
        return sb.toString();
    }
}
