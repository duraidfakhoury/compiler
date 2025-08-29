package Classes.Errors;

public class NotAFunctionError extends SemanticError {
    private String variableName;

    public NotAFunctionError(String variableName, int line, int column) {
        super("'" + variableName + "' is not a function",
                line, column, "SE014", "ERROR");
        this.variableName = variableName;
    }

    @Override
    public String getDetailedMessage() {
        return "Attempting to call '" + variableName + "' as a function, but it's not a function.";
    }

    @Override
    public String getSuggestion() {
        return "Check if " + variableName + " is declared as a function or method.";
    }
}
