package Classes;

import java.util.ArrayList;
import java.util.List;

public class IfStatementNode extends ASTNode {
    private List<IfBodyNode> conditions = new ArrayList<>();
    private List<ASTNode> elseBlock;

    public void addCondition(IfBodyNode body) { conditions.add(body); }
    public void setElseBlock(List<ASTNode> elseBlock) { this.elseBlock = elseBlock; }

    public List<IfBodyNode> getConditions() {
        return conditions;
    }

    public List<ASTNode> getElseBlock() {
        return elseBlock;
    }

    @Override
    public String toString() {
        return "\nIfStatementNode{" +
                "conditions=" + conditions +
                ", elseBlock=" + elseBlock +
                '}';
    }
}
