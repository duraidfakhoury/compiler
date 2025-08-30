package Classes;

public class TypeError extends CompilerError {
    public TypeError(String message, int line, int column) {
        super(message, line, column, ErrorType.TYPE, ErrorSeverity.ERROR);
    }

    public TypeError(String message, int line, int column, ErrorSeverity severity) {
        super(message, line, column, ErrorType.TYPE, severity);
    }
}
