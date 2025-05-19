package Classes;

import java.util.*;

class FunctionDeclarationNode extends ASTNode {
    public String functionName;
    public List<String> parameters = new ArrayList<>();
    public ASTNode body;
    public String returnType;  // Optional: If your language has return types

    // Default constructor
    public FunctionDeclarationNode() {
        super("FunctionDeclarationNode");
    }

    // Constructor with parameters and return type
    public FunctionDeclarationNode(String functionName, List<String> parameters, ASTNode body, String returnType) {
        super("FunctionDeclarationNode");
        this.functionName = functionName;
        this.parameters = parameters;
        this.body = body;
        this.returnType = returnType;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FunctionDeclarationNode{functionName=").append(functionName);
        if (!parameters.isEmpty()) {
            sb.append(", parameters=").append(parameters);
        }
        if (returnType != null && !returnType.isEmpty()) {
            sb.append(", returnType=").append(returnType);
        }
        sb.append(", body=").append(body);
        sb.append("}");
        return sb.toString();
    }
}
