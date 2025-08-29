package Classes.Errors;

public class ReturnTypeMismatchError extends SemanticError {
    private String expectedType;
    private String actualType;

    public ReturnTypeMismatchError(String expectedType, String actualType, int line, int column) {
        super("Return type mismatch: expected " + expectedType + " but got " + actualType,
                line, column, "SE018", "ERROR");
        this.expectedType = expectedType;
        this.actualType = actualType;
    }

    @Override
    public String getDetailedMessage() {
        return "The returned value type doesn't match the function's declared return type.";
    }

    @Override
    public String getSuggestion() {
        return "Return a value of type " + expectedType + " or change the function's return type.";
    }
}
