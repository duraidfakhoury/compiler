package Classes;

public abstract class CompilerError {
    protected String message;
    protected int line;
    protected int column;
    protected ErrorType type;
    protected ErrorSeverity severity;

    public enum ErrorType {
        SEMANTIC,
        SYNTAX,
        TYPE,
        CONTROL_FLOW,
        PERFORMANCE,
        BEST_PRACTICE
    }

    public enum ErrorSeverity {
        ERROR,
        WARNING,
        INFO
    }

    public CompilerError(String message, int line, int column, ErrorType type, ErrorSeverity severity) {
        this.message = message;
        this.line = line;
        this.column = column;
        this.type = type;
        this.severity = severity;
    }

    public String getMessage() {
        return message;
    }

    public int getLine() {
        return line;
    }

    public int getColumn() {
        return column;
    }

    public ErrorType getType() {
        return type;
    }

    public ErrorSeverity getSeverity() {
        return severity;
    }

    @Override
    public String toString() {
        return String.format("%s: %s at line %d, column %d", 
            severity.toString(), message, line, column);
    }
}
