package Classes;

public class ValueNode extends ASTNode {
    private PrimaryValueNode primaryValue;
    private String modifier; // يمكن أن يكون "?" أو "!"
    private OperatorExpressionNode operatorExpression;
    private TypeNode asType;

    // Constructor
    public ValueNode(PrimaryValueNode primaryValue) {
        this.primaryValue = primaryValue;
    }

    // Getters and Setters
    public PrimaryValueNode getPrimaryValue() {
        return primaryValue;
    }

    public void setPrimaryValue(PrimaryValueNode primaryValue) {
        this.primaryValue = primaryValue;
    }

    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier;
    }

    public OperatorExpressionNode getOperatorExpression() {
        return operatorExpression;
    }

    public void setOperatorExpression(OperatorExpressionNode operatorExpression) {
        this.operatorExpression = operatorExpression;
    }

    public TypeNode getAsType() {
        return asType;
    }

    public void setAsType(TypeNode asType) {
        this.asType = asType;
    }

    @Override
    public String toString() {
        return "\nValueNode{" +
                "\nprimaryValue=" + primaryValue +
                (modifier != null ? ", modifier='" + modifier + '\'' : "") +
                (operatorExpression != null ? ", operatorExpression=" + operatorExpression : "") +
                (asType != null ? ", asType=" + asType : "") +
                "}";
    }
}
