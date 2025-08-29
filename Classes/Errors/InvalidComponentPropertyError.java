package Classes.Errors;


public class InvalidComponentPropertyError extends SemanticError {
    private String propertyName;

    public InvalidComponentPropertyError(String propertyName, int line, int column) {
        super("Invalid component property '" + propertyName + "'",
                line, column, "SE027", "WARNING");
        this.propertyName = propertyName;
    }

    @Override
    public String getDetailedMessage() {
        return "Property '" + propertyName + "' is not a valid Angular component property.";
    }

    @Override
    public String getSuggestion() {
        return "Check Angular documentation for valid component properties.";
    }
}
