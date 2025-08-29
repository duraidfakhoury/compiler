package Classes.Errors;

public class ContinueOutsideLoopError extends SemanticError {
    public ContinueOutsideLoopError(int line, int column) {
        super("Continue statement must be inside a loop",
                line, column, "SE029", "ERROR");
    }

    @Override
    public String getDetailedMessage() {
        return "Continue statements can only be used inside loops.";
    }

    @Override
    public String getSuggestion() {
        return "Move the continue statement inside a loop or remove it.";
    }
}
