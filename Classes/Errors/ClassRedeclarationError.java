package Classes.Errors;

public class ClassRedeclarationError extends SemanticError {
    private String className;
    private int originalLine;

    public ClassRedeclarationError(String className, int line, int column, int originalLine) {
        super("Class '" + className + "' conflicts with existing declaration",
                line, column, "SE019", "ERROR");
        this.className = className;
        this.originalLine = originalLine;
    }

    @Override
    public String getDetailedMessage() {
        return "Class '" + className + "' was already declared at line " + originalLine;
    }

    @Override
    public String getSuggestion() {
        return "Use a different class name or remove the duplicate declaration.";
    }
}
