package Classes.Errors;

public class InconsistentArrayTypesError extends SemanticError {
    private String expectedType;
    private String foundType;

    public InconsistentArrayTypesError(String expectedType, String foundType, int line, int column) {
        super("Array contains inconsistent types: expected " + expectedType + " but found " + foundType,
                line, column, "SE011", "WARNING");
        this.expectedType = expectedType;
        this.foundType = foundType;
    }

    @Override
    public String getDetailedMessage() {
        return "Array elements should have consistent types for better type safety.";
    }

    @Override
    public String getSuggestion() {
        return "Use union types or ensure all elements have the same type.";
    }
}
