package Classes.Errors;

public class ReturnOutsideFunctionError extends SemanticError {
    public ReturnOutsideFunctionError(int line, int column) {
        super("Return statement outside function",
                line, column, "SE012", "ERROR");
    }

    @Override
    public String getDetailedMessage() {
        return "Return statements can only be used inside functions or methods.";
    }

    @Override
    public String getSuggestion() {
        return "Move the return statement inside a function or remove it.";
    }
}
