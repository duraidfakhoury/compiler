package Classes.Errors;

public class ThisOutsideContextError extends SemanticError {
    public ThisOutsideContextError(int line, int column) {
        super("'this' keyword used outside class or function context",
                line, column, "SE030", "ERROR");
    }

    @Override
    public String getDetailedMessage() {
        return "The 'this' keyword can only be used inside class methods or functions.";
    }

    @Override
    public String getSuggestion() {
        return "Use 'this' only within class methods or bound functions.";
    }
}
