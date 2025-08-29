package Classes.Errors;

public class NonNullAssertionError extends SemanticError {
    public NonNullAssertionError(int line, int column) {
        super("Non-null assertion on potentially null/undefined value",
                line, column, "SE031", "WARNING");
    }

    @Override
    public String getDetailedMessage() {
        return "Using non-null assertion (!) on a value that might be null or undefined.";
    }

    @Override
    public String getSuggestion() {
        return "Check if the value is null/undefined before using the assertion.";
    }
}
