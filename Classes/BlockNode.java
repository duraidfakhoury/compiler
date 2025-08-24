package Classes;

import java.util.List;

public class BlockNode extends ASTNode {
    public final List<ASTNode> statements;

    public BlockNode(List<ASTNode> statements) {
        this.statements = statements;
    }
    public void addStatement(ASTNode stmt) {
        statements.add(stmt);
    }
    public List<ASTNode> getStatements() {
        return statements;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("BlockNode[\n");
        for (ASTNode stmt : statements) {
            sb.append("  ").append(stmt).append(",\n");
        }
        sb.append("]");
        return sb.toString();
    }
}
