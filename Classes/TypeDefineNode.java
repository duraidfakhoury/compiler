package Classes;

public class TypeDefineNode extends ASTNode {
    private String name ;
    private boolean isArray ;

    public TypeDefineNode(String name, boolean isArray) {
        this.name = name;
        this.isArray = isArray;
    }

    public String getName() {
        return name;
    }

    public boolean isArray() {
        return isArray;
    }

    @Override
    public String toString() {
        return "\nTypeDefineNode{" +
                "name='" + name + '\'' +
                ", isArray=" + isArray +
                "}";
    }
}
