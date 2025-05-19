package Classes;

public class VariableDeclarationNode extends ASTNode {
    private final String declarationType; // CONST, LET, VAR
    private final String variableName;
    private final String type; // Optional type definition
    private final ASTNode value; // Assigned value (optional)

    public VariableDeclarationNode(String declarationType, String variableName, String type, ASTNode value) {
        super("VariableDeclarationNode");
        this.declarationType = declarationType;
        this.variableName = variableName;
        this.type = type;
        this.value = value;
    }

    // Setter methods


    @Override
    public String toString() {
        return "VariableDeclarationNode{" +
                "declarationType='" + declarationType + '\'' +
                ", variableName='" + variableName + '\'' +
                ", type='" + type + '\'' +
                ", value=" + (value != null ? value.toString() : "null") +
                '}';

    }
}