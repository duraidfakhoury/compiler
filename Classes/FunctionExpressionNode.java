package Classes;

import java.util.List;

public class FunctionExpressionNode extends ASTNode {
    private List<String> parameters;
    private BlockNode body;

    public FunctionExpressionNode(List<String> parameters, BlockNode body) {
        this.parameters = parameters;
        this.body = body;
    }

    public List<String> getParameters() {
        return parameters;
    }

    public BlockNode getBody() {
        return body;
    }

    // Removed @Override annotation because getType() is not overriding a superclass method
    public String getType() {
        return "function";
    }

    // Removed @Override annotation because toString() is not overriding a superclass method
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("function(");
        for (int i = 0; i < parameters.size(); i++) {
            if (i > 0) sb.append(", ");
            sb.append(parameters.get(i));
        }
        sb.append(") ");
        sb.append(body.toString());
        return sb.toString();
    }
}
