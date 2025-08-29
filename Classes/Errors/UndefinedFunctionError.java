package Classes.Errors;

public class UndefinedFunctionError extends SemanticError {
    private String functionName;

    public UndefinedFunctionError(String functionName, int line, int column) {
        super("Undefined function '" + functionName + "'",
                line, column, "SE013", "ERROR");
        this.functionName = functionName;
    }

    @Override
    public String getDetailedMessage() {
        return "Function '" + functionName + "' is called but not declared.";
    }

    @Override
    public String getSuggestion() {
        return "Declare the function or import it if it's from another module.";
    }
}
