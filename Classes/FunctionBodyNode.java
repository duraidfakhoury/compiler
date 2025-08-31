package Classes;

import java.util.ArrayList;
import java.util.List;

public class FunctionBodyNode extends PrimaryValueNode {
    private boolean blockStyle; // true = {} block, false = arrow
    private List<ASTNode> statements = new ArrayList<>(); // for block
    private List<String> params = new ArrayList<>(); // for arrow
    private ValueNode arrowValue; // for arrow (expression style)
    private List<ASTNode> arrowStatements = new ArrayList<>(); // for arrow (statement style)
    private TypeDefineNode returnType;
    private boolean arrowHasStatements; // true if arrow function has statements, false if expression

    public void setBlockStyle(boolean blockStyle) {
        this.blockStyle = blockStyle;
    }

    public void addStatement(ASTNode stmt) {
        statements.add(stmt);
    }

    public void addArrowStatement(ASTNode stmt) {
        arrowStatements.add(stmt);
        arrowHasStatements = true;
    }

    public void setParams(List<String> params) {
        this.params = params;
    }

    public void setArrowValue(ValueNode value) {
        this.arrowValue = value;
        arrowHasStatements = false;
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
    
    public List<ASTNode> getArrowStatements() {
        return arrowStatements;
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

    public boolean arrowHasStatements() {
        return arrowHasStatements;
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
            StringBuilder sb = new StringBuilder("ArrowFunctionBody: (" + String.join(", ", params) + ") => ");
            if (arrowHasStatements) {
                sb.append("{\n");
                for (ASTNode stmt : arrowStatements) {
                    sb.append("  ").append(stmt).append("\n");
                }
                sb.append("}");
            } else {
                sb.append(arrowValue);
            }
            if (returnType != null) {
                sb.append(" : ").append(returnType);
            }
            return sb.toString();
        }
    }
}

