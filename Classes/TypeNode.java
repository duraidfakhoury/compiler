package Classes;


public class TypeNode extends ASTNode {
    private String typeName;
    private boolean isArray;

    public TypeNode(String typeName, boolean isArray) {
        this.typeName = typeName;
        this.isArray = isArray;
    }

    // Getters
    public String getTypeName() {
        return typeName;
    }

    public boolean isArray() {
        return isArray;
    }

    @Override
    public String toString() {
        return "\nTypeNode{" +
                "typeName='" + typeName + '\'' +
                ", isArray=" + isArray +
                "}";
    }
}
