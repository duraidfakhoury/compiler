package Classes;

import java.util.List;

public class ArrowFunctionValueNode extends PrimaryValueNode {
    private List<String> params;
    private ASTNode body;

    public ArrowFunctionValueNode(List<String> params, ASTNode body) {
        this.params = params;
        this.body = body;
    }

    public List<String> getParams() {
        return params;
    }

    public ASTNode getBody() {
        return body;
    }

    public void setParams(List<String> params) {
        this.params = params;
    }

    public void setBody(ASTNode body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "ArrowFunctionValueNode{" +
                "params=" + params +
                ", body=" + body +
                '}';
    }
}
