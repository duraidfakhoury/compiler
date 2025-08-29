package Classes.Errors;

public class InvalidBinaryOperationError extends SemanticError {
    private String leftType;
    private String rightType;
    private String operator;

    public InvalidBinaryOperationError(String leftType, String rightType, String operator, int line, int column) {
        super("Invalid binary operation: " + leftType + " " + operator + " " + rightType,
                line, column, "SE009", "ERROR");
        this.leftType = leftType;
        this.rightType = rightType;
        this.operator = operator;
    }

    @Override
    public String getDetailedMessage() {
        return "Operator '" + operator + "' cannot be applied to operands of types '" +
                leftType + "' and '" + rightType + "'.";
    }

    @Override
    public String getSuggestion() {
        return "Ensure both operands are compatible with the '" + operator + "' operator.";
    }
}
