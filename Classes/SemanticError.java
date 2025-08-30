package Classes;

public class SemanticError extends CompilerError {
    public SemanticError(String message, int line, int column) {
        super(message, line, column, ErrorType.SEMANTIC, ErrorSeverity.ERROR);
    }

    public SemanticError(String message, int line, int column, ErrorSeverity severity) {
        super(message, line, column, ErrorType.SEMANTIC, severity);
    }
}
