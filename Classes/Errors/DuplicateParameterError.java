package Classes.Errors;

public class DuplicateParameterError extends SemanticError {
    private String parameterName;
    private String functionName;

    public DuplicateParameterError(String parameterName, String functionName, int line, int column) {
        super("Duplicate parameter '" + parameterName + "' in function '" + functionName + "'",
                line, column, "SE016", "ERROR");
        this.parameterName = parameterName;
        this.functionName = functionName;
    }

    @Override
    public String getDetailedMessage() {
        return "Parameter names must be unique within a function declaration.";
    }

    @Override
    public String getSuggestion() {
        return "Use different parameter names in function " + functionName;
    }
}
