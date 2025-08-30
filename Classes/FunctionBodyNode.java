package Classes;

import java.util.ArrayList;
import java.util.List;

public class FunctionBodyNode extends PrimaryValueNode {
    private boolean blockStyle; // true = {} block, false = arrow
    private List<ASTNode> statements = new ArrayList<>(); // for block
    private List<String> params = new ArrayList<>(); // for arrow
    private ValueNode arrowValue; // for arrow
    private TypeDefineNode returnType;

    public void setBlockStyle(boolean blockStyle) {
        this.blockStyle = blockStyle;
    }

    public void addStatement(ASTNode stmt) {
        statements.add(stmt);
    }

    public void setParams(List<String> params) {
        this.params = params;
    }

    public void setArrowValue(ValueNode value) {
        this.arrowValue = value;
    }

    public void setReturnType(TypeDefineNode returnType) {
        this.returnType = returnType;
    }
    
    public TypeDefineNode getReturnType() {
        return returnType;
    }
    
    public List<ASTNode> getStatements() {
        return statements;
    }
    
    public List<String> getParams() {
        return params;
    }
    
    public ValueNode getArrowValue() {
        return arrowValue;
    }
    
    public boolean isBlockStyle() {
        return blockStyle;
    }

    @Override
    public String toString() {
        if (blockStyle) {
            StringBuilder sb = new StringBuilder("FunctionBodyBlock:\n");
            if (returnType != null) {
                sb.append("ReturnType: ").append(returnType).append("\n");
            }
            for (ASTNode stmt : statements) {
                sb.append("  ").append(stmt).append("\n");
            }
            return sb.toString();
        } else {
            return "ArrowFunctionBody: (" + String.join(", ", params) + ") => " + arrowValue +
                    (returnType != null ? " : " + returnType : "");
        }
    }
}

