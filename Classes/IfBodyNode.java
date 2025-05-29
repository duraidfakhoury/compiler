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

    @Override
    public String toString() {
        return "\nIfBodyNode{condition=" + condition + ", statements=" + statements + "}";
    }
}

