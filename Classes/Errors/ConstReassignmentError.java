package Classes.Errors;

public class ConstReassignmentError extends SemanticError {
    private String variableName;

    public ConstReassignmentError(String variableName, int line, int column) {
        super("Cannot assign to const variable '" + variableName + "'",
                line, column, "SE005", "ERROR");
        this.variableName = variableName;
    }

    @Override
    public String getDetailedMessage() {
        return "Constant variables cannot be reassigned after declaration.";
    }

    @Override
    public String getSuggestion() {
        return "Use 'let' or 'var' if you need to reassign, or use a different variable name.";
    }
}
