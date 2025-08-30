package Classes;

public class TypeDeclarationNode extends ASTNode {
    private String name;
    private TypeDeclarationValueNode typeValue;

    public TypeDeclarationNode(String name, TypeDeclarationValueNode typeValue) {
        this.name = name;
        this.typeValue = typeValue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TypeDeclarationValueNode getTypeValue() {
        return typeValue;
    }

    public void setTypeValue(TypeDeclarationValueNode typeValue) {
        this.typeValue = typeValue;
    }

    @Override
    public String toString() {
        return "\nTypeDeclarationNode{" +
                "name='" + name + '\'' +
                ", typeValue=" + typeValue +
                "}";
    }
}
