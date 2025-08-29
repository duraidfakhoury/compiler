package Classes.Errors;

public class UnusedVariableError extends SemanticError {
    private String variableName;

    public UnusedVariableError(String variableName, int line, int column) {
        super("Unused variable '" + variableName + "'",
                line, column, "SE006", "WARNING");
        this.variableName = variableName;
    }

    @Override
    public String getDetailedMessage() {
        return "Variable '" + variableName + "' is declared but never used.";
    }

    @Override
    public String getSuggestion() {
        return "Remove the unused variable or use it in your code.";
    }
}
