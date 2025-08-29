package Classes.Errors;
public class ConstWithoutInitializationError extends SemanticError {
    private String variableName;

    public ConstWithoutInitializationError(String variableName, int line, int column) {
        super("Const variable '" + variableName + "' must be initialized",
                line, column, "SE001", "ERROR");
        this.variableName = variableName;
    }

    @Override
    public String getDetailedMessage() {
        return "Constants must be assigned a value when they are declared. " +
                "Variable '" + variableName + "' was declared as const but not initialized.";
    }

    @Override
    public String getSuggestion() {
        return "Add an initial value: const " + variableName + " = <value>;";
    }
}