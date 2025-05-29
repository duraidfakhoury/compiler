package Classes;

public class VariableDeclarationNode extends ASTNode {
    private String Kind ;
    private VariableAssignNode assignment ;

    public VariableDeclarationNode(String kind) {
        Kind = kind;
    }

    public VariableAssignNode getAssignment() {
        return assignment;
    }

    public void setAssignment(VariableAssignNode assignment) {
        this.assignment = assignment;
    }

    public String getKind() {
        return Kind;
    }

    @Override
    public String toString() {
        return "\nVariableDeclarationNode{" +
                "Kind='" + Kind + '\'' +
                ", assignment=" + assignment +
                "}";
    }
}
