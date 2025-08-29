package Classes.Errors;

public class InvalidComparisonError extends SemanticError {
    private String leftType;
    private String rightType;
    private String operator;

    public InvalidComparisonError(String leftType, String rightType, String operator, int line, int column) {
        super("Invalid comparison: " + leftType + " " + operator + " " + rightType,
                line, column, "SE010", "ERROR");
        this.leftType = leftType;
        this.rightType = rightType;
        this.operator = operator;
    }

    @Override
    public String getDetailedMessage() {
        return "Cannot compare " + leftType + " with " + rightType + " using " + operator;
    }

    @Override
    public String getSuggestion() {
        return "Ensure both values are of comparable types or use type conversion.";
    }
}
