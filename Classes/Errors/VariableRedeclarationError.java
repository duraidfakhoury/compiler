package Classes.Errors;

public class VariableRedeclarationError extends SemanticError {
    private String variableName;
    private int originalLine;

    public VariableRedeclarationError(String variableName, int line, int column, int originalLine) {
        super("Variable '" + variableName + "' is already declared in this scope",
                line, column, "SE004", "ERROR");
        this.variableName = variableName;
        this.originalLine = originalLine;
    }

    @Override
    public String getDetailedMessage() {
        return "Variable '" + variableName + "' was already declared at line " + originalLine +
                ". Cannot redeclare in the same scope.";
    }

    @Override
    public String getSuggestion() {
        return "Use a different variable name or assign to the existing variable.";
    }
}
