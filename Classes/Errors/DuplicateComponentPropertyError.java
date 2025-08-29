package Classes.Errors;

public class DuplicateComponentPropertyError extends SemanticError {
    private String propertyName;

    public DuplicateComponentPropertyError(String propertyName, int line, int column) {
        super("Duplicate property '" + propertyName + "' in component",
                line, column, "SE026", "ERROR");
        this.propertyName = propertyName;
    }

    @Override
    public String getDetailedMessage() {
        return "Component property '" + propertyName + "' is defined multiple times.";
    }

    @Override
    public String getSuggestion() {
        return "Remove the duplicate property definition.";
    }
}
