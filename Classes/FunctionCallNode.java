package Classes;

import java.util.*;

class FunctionCallNode extends ASTNode {
    public String functionName;
    public List<ASTNode> arguments = new ArrayList<>();

    // Default constructor
    public FunctionCallNode() {
        super("FunctionCallNode");
    }

    // Constructor with position metadata
    public FunctionCallNode(String functionName, List<ASTNode> arguments) {
        super("FunctionCallNode");
        this.functionName = functionName;
        this.arguments = arguments;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FunctionCallNode{functionName=").append(functionName);
        if (!arguments.isEmpty()) {
            sb.append(", arguments=");
            for (ASTNode arg : arguments) {
                sb.append(arg).append(", ");
            }
            sb.setLength(sb.length() - 2);  // Remove last comma
        }
        sb.append("}");
        return sb.toString();
    }
}
