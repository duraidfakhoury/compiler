package Classes;

public class DecrementNode extends ASTNode {
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

    @Override
    public String toString() {
        return (isPrefix ? "--" : "") + varName + (isPrefix ? "" : "--");
    }

}
