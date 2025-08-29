package Classes.Errors;

public class FunctionRedeclarationError extends SemanticError {
    private String functionName;
    private int originalLine;

    public FunctionRedeclarationError(String functionName, int line, int column, int originalLine) {
        super("Function '" + functionName + "' conflicts with existing declaration",
                line, column, "SE015", "ERROR");
        this.functionName = functionName;
        this.originalLine = originalLine;
    }

    @Override
    public String getDetailedMessage() {
        return "Function '" + functionName + "' was already declared at line " + originalLine;
    }

    @Override
    public String getSuggestion() {
        return "Use a different function name or remove the duplicate declaration.";
    }
}
