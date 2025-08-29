package Classes.Errors;

public class UndefinedTypeError extends SemanticError {
    private String typeName;

    public UndefinedTypeError(String typeName, int line, int column) {
        super("Undefined type '" + typeName + "'",
                line, column, "SE008", "ERROR");
        this.typeName = typeName;
    }

    @Override
    public String getDetailedMessage() {
        return "Type '" + typeName + "' is not defined or imported.";
    }

    @Override
    public String getSuggestion() {
        return "Import the type or check for typos in the type name.";
    }
}
