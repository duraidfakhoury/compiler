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

    @Override
    public String toString() {
        return "\nFunctionDeclarationNode{" +
                "name='" + name + '\'' +
                ", parameters=" + parameters +
                ", body=" + body +
                '}';
    }
}
