package Classes;

import java.util.ArrayList;
import java.util.List;

public class IfBodyNode extends ASTNode {
    private ValueNode condition;
    private List<ASTNode> statements = new ArrayList<>();

    public void setCondition(ValueNode condition) {
        this.condition = condition;
    }

    public void addStatement(ASTNode stmt) {
        statements.add(stmt);
    }

    public ValueNode getCondition() {
        return condition;
    }

    public List<ASTNode> getStatements() {
        return statements;
    }

    @Override
    public String toString() {
        return "\nIfBodyNode{condition=" + condition + ", statements=" + statements + "}";
    }
}

