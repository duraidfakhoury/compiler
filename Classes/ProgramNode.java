package Classes;

import java.util.ArrayList;
import java.util.List;

public class ProgramNode extends ASTNode {
    private List<ASTNode> statements = new ArrayList<>();

    public void addStatement(ASTNode statement) {
        statements.add(statement);
    }

    public List<ASTNode> getStatements() {
        return statements;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ProgramNode:");
        for (ASTNode stmt : statements) {
            sb.append("  ").append(stmt.toString().replace("\n", "\n  ")).append("\n");
        }
        return sb.toString();
    }
}
