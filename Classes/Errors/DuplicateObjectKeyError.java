package Classes.Errors;

public class DuplicateObjectKeyError extends SemanticError {
    private String keyName;

    public DuplicateObjectKeyError(String keyName, int line, int column) {
        super("Duplicate key '" + keyName + "' in object literal",
                line, column, "SE022", "WARNING");
        this.keyName = keyName;
    }

    @Override
    public String getDetailedMessage() {
        return "Object literal contains duplicate property key '" + keyName + "'.";
    }

    @Override
    public String getSuggestion() {
        return "Remove one of the duplicate keys or use different key names.";
    }
}
