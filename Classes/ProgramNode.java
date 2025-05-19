package Classes;
import java.util.ArrayList;
import java.util.List;

public class ProgramNode extends ASTNode {
    public List<ASTNode> statements;  // List of statements in the program
    public int lineNumber;            // Line number where the program starts (optional)
    public int columnNumber;          // Column number where the program starts (optional)

    public ProgramNode() {
        super("ProgramNode");
        this.statements = new ArrayList<>();
        this.lineNumber = -1;          // Default to -1, meaning no position info available
        this.columnNumber = -1;        // Default to -1
    }

    // Constructor with position metadata
    public ProgramNode(int lineNumber, int columnNumber) {
        super("ProgramNode");
        this.statements = new ArrayList<>();
        this.lineNumber = lineNumber;
        this.columnNumber = columnNumber;
    }

    public void addStatement(ASTNode statement) {
        statements.add(statement);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ProgramNode{\n");
        sb.append("statements=\n");

        for (ASTNode statement : statements) {
            sb.append(statement.toString()).append("\n");
        }
        sb.append("}");
        return sb.toString();
    }
}
