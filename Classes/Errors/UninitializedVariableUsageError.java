package Classes.Errors;

public class UninitializedVariableUsageError extends SemanticError {
    private String variableName;

    public UninitializedVariableUsageError(String variableName, int line, int column) {
        super("Variable '" + variableName + "' used before initialization",
                line, column, "SE003", "ERROR");
        this.variableName = variableName;
    }

    @Override
    public String getDetailedMessage() {
        return "Variable '" + variableName + "' is declared but used before being assigned a value.";
    }

    @Override
    public String getSuggestion() {
        return "Initialize the variable before using it or check the execution order.";
    }
}
