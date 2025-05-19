package Classes;

import java.util.ArrayList;
import java.util.List;

public class DoWhileLoopNode extends ASTNode {
    public ASTNode condition;    // The condition of the loop
    public ProgramNode body;     // The body of the loop (using ProgramNode for consistency)

    // Default constructor
    public DoWhileLoopNode() {
        super("DoWhileLoopNode");
        this.body = new ProgramNode(); // Initialize with an empty program body
    }

    // Constructor with parameters to set the condition and body
    public DoWhileLoopNode(ASTNode condition, ProgramNode body) {
        super("DoWhileLoopNode");
        this.condition = condition;
        this.body = body;
    }

    // Constructor with position metadata
    public DoWhileLoopNode(ASTNode condition, ProgramNode body, int lineNumber, int columnNumber) {
        super("DoWhileLoopNode", lineNumber, columnNumber);
        this.condition = condition;
        this.body = body;
    }

    // Method to add a statement to the loop body
    public void addStatementToBody(ASTNode statement) {
        body.addStatement(statement); // Use addStatement from ProgramNode
    }

    @Override
    public String toString() {
        return "DoWhileLoopNode{" +
                "condition=" + (condition != null ? condition.toString() : "null") +
                ", body=" + (body != null ? body.toString() : "null") +
                '}';
    }
}
