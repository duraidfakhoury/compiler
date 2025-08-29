package Classes;

public class IncrementNode extends ASTNode {
    private String varName;
    private boolean isPrefix;

    public IncrementNode(String varName, boolean isPrefix) {
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
        return (isPrefix ? "++" : "") + varName + (isPrefix ? "" : "++");
    }

    // يمكنك إضافة طريقة evaluate أو accept إذا كنت تستخدم Visitor pattern لاحقًا
}

