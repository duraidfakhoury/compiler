package Classes;

public class IncDecNode extends PrimaryValueNode {
    private final String variableName;
    private final String operator; // "++" أو "--"
    private final boolean isPrefix; // true إذا كانت العملية قبل المتغير

    public IncDecNode(String variableName, String operator, boolean isPrefix) {
        this.variableName = variableName;
        this.operator = operator;
        this.isPrefix = isPrefix;
    }

    public String getVariableName() {
        return variableName;
    }

    public String getOperator() {
        return operator;
    }

    public boolean isPrefix() {
        return isPrefix;
    }

    public String getOperand() {
        return variableName;
    }

    public boolean isIncrement() {
        return "++".equals(operator);
    }

    @Override
    public String toString() {
        return "\nIncDecNode{" +
                "variableName='" + variableName + '\'' +
                ", operator='" + operator + '\'' +
                ", isPrefix=" + isPrefix +
                "}";
    }
}
