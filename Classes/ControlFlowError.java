package Classes;

public class ControlFlowError extends CompilerError {
    public ControlFlowError(String message, int line, int column) {
        super(message, line, column, ErrorType.CONTROL_FLOW, ErrorSeverity.WARNING);
    }

    public ControlFlowError(String message, int line, int column, ErrorSeverity severity) {
        super(message, line, column, ErrorType.CONTROL_FLOW, severity);
    }
}
