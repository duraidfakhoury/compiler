package Classes;

public class VariableAssignNode extends ASTNode {

    private String identifier ;
    private TypeDefineNode type ;
    private ASTNode value ;

    public VariableAssignNode(String identifier) {
        this.identifier = identifier;
    }

    public ASTNode getValue() {
        return value;
    }

    public void setValue(ASTNode value) {
        this.value = value;
    }

    public TypeDefineNode getType() {
        return type;
    }

    public void setType(TypeDefineNode type) {
        this.type = type;
    }

    public String getIdentifier() {
        return identifier;
    }

    @Override
    public String toString() {
        return "\nVariableAssignNode{" +
                "identifier='" + identifier + '\'' +
                ", type=" + type +
                ", value=" + value +
                "}";
    }
}
