package Classes.Errors;

public class MissingReturnError extends SemanticError {
    private String functionName;
    private String returnType;

    public MissingReturnError(String functionName, String returnType, int line, int column) {
        super("Function '" + functionName + "' with return type '" + returnType + "' must return a value",
                line, column, "SE017", "ERROR");
        this.functionName = functionName;
        this.returnType = returnType;
    }

    @Override
    public String getDetailedMessage() {
        return "Function declared to return " + returnType + " but has no return statement.";
    }

    @Override
    public String getSuggestion() {
        return "Add a return statement or change the return type to void.";
    }
}
