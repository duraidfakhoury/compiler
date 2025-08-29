package Classes;

public class PropertyAccessNode extends ASTNode {
    private ASTNode object;   // الكائن الذي تحتويه الخاصية
    private ASTNode property; // الخاصية نفسها

    public PropertyAccessNode(ASTNode object, ASTNode property) {
        this.object = object;
        this.property = property;
    }

    public ASTNode getObject() {
        return object;
    }

    public ASTNode getProperty() {
        return property;
    }

    @Override
    public String toString() {
        return object + "." + property;
    }

    // إذا كنت تستخدم Visitor pattern:
    // public <T> T accept(Visitor<T> visitor) {
    //     return visitor.visitPropertyAccessNode(this);
    // }
}
