package Classes.Errors;

public class TypeMismatchError extends SemanticError {
    private String expectedType;
    private String actualType;

    public TypeMismatchError(String expectedType, String actualType, int line, int column) {
        super("Type mismatch: cannot assign " + actualType + " to " + expectedType,
                line, column, "SE007", "ERROR");
        this.expectedType = expectedType;
        this.actualType = actualType;
    }

    @Override
    public String getDetailedMessage() {
        return "Expected type '" + expectedType + "' but got '" + actualType + "'.";
    }

    @Override
    public String getSuggestion() {
        return "Convert the value to " + expectedType + " or change the variable type.";
    }
}
