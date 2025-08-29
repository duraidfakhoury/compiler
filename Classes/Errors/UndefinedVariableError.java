package Classes.Errors;


public class UndefinedVariableError extends SemanticError {
    private String variableName;

    public UndefinedVariableError(String variableName, int line, int column) {
        super("Undefined variable '" + variableName + "'",
                line, column, "SE002", "ERROR");
        this.variableName = variableName;
    }

    @Override
    public String getDetailedMessage() {
        return "Variable '" + variableName + "' is used but not declared in any accessible scope.";
    }

    @Override
    public String getSuggestion() {
        return "Declare the variable before using it: let " + variableName + " = <value>;";
    }
}
