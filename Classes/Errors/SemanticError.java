package Classes.Errors;

public abstract class SemanticError {
    protected String message;
    protected int line;
    protected int column;
    protected String errorCode;
    protected String severity; // ERROR, WARNING, INFO

    public SemanticError(String message, int line, int column, String errorCode, String severity) {
        this.message = message;
        this.line = line;
        this.column = column;
        this.errorCode = errorCode;
        this.severity = severity;
    }

    public abstract String getDetailedMessage();
    public abstract String getSuggestion();

    // Getters
    public String getMessage() { return message; }
    public int getLine() { return line; }
    public int getColumn() { return column; }
    public String getErrorCode() { return errorCode; }
    public String getSeverity() { return severity; }

    @Override
    public String toString() {
        return String.format("[%s:%s] %s at line %d:%d - %s",
                severity, errorCode, message, line, column, getSuggestion());
    }
}
