package Classes;

public class TypeMemberNode extends ASTNode {
    private String name;
    private TypeDeclarationValueNode type;

    public TypeMemberNode(String name, TypeDeclarationValueNode type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TypeDeclarationValueNode getType() {
        return type;
    }

    public void setType(TypeDeclarationValueNode type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "\nTypeMemberNode{" +
                "name='" + name + '\'' +
                ", type=" + type +
                "}";
    }
}
