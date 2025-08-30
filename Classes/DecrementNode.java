package Classes;

public class DecrementNode extends PrimaryValueNode {
    private String varName;
    private boolean isPrefix;

    public DecrementNode(String varName, boolean isPrefix) {
        this.varName = varName;
        this.isPrefix = isPrefix;
    }

    public String getVarName() {
        return varName;
    }

    public boolean isPrefix() {
        return isPrefix;
    }

    public String getOperand() {
        return varName;
    }

    @Override
    public String toString() {
        return (isPrefix ? "--" : "") + varName + (isPrefix ? "" : "--");
    }

}
