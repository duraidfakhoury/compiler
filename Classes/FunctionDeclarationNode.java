package Classes;

import java.util.List;

public class FunctionDeclarationNode extends ASTNode {
    private String name;
    private List<String> parameters;
    private FunctionBodyNode body;

    public FunctionDeclarationNode(String name, List<String> params, FunctionBodyNode body) {
        this.name = name;
        this.parameters = params;
        this.body = body;
    }

    public String getName() {
        return name;
    }

    public List<String> getParameters() {
        return parameters;
    }

    public FunctionBodyNode getBody() {
        return body;
    }

    @Override
    public String toString() {
        return "\nFunctionDeclarationNode{" +
                "name='" + name + '\'' +
                ", parameters=" + parameters +
                ", body=" + body +
                '}';
    }
}
