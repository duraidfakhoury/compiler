package Classes.Errors;

public class BreakOutsideLoopError extends SemanticError {
    public BreakOutsideLoopError(int line, int column) {
        super("Break statement must be inside a loop",
                line, column, "SE028", "ERROR");
    }

    @Override
    public String getDetailedMessage() {
        return "Break statements can only be used inside loops or switch statements.";
    }

    @Override
    public String getSuggestion() {
        return "Move the break statement inside a loop or remove it.";
    }
}
