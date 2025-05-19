package Classes;

import java.util.*;

public class IfStatementNode extends ASTNode {
    public ASTNode condition;  // The condition for the if or else-if
    public ProgramNode thenBranch;  // The "then" branch
    public List<ASTNode> elseIfBranches;  // A list to handle multiple "else if" branches
    public ASTNode elseBranch;  // The "else" branch (can be another IfStatementNode or a ProgramNode)

    // Constructor
    public IfStatementNode() {
        super("IfStatementNode");
        this.elseIfBranches = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "IfStatementNode{" +
                "condition=" + condition +
                ", thenBranch=" + thenBranch +
                ", elseIfBranches=" + elseIfBranches +
                ", elseBranch=" + elseBranch +
                '}';
    }
}
