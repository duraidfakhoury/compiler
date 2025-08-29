package Classes.Errors;

public class DuplicateHtmlAttributeError extends SemanticError {
    private String attributeName;

    public DuplicateHtmlAttributeError(String attributeName, int line, int column) {
        super("Duplicate attribute '" + attributeName + "' in HTML tag",
                line, column, "SE024", "WARNING");
        this.attributeName = attributeName;
    }

    @Override
    public String getDetailedMessage() {
        return "HTML attribute '" + attributeName + "' is specified multiple times.";
    }

    @Override
    public String getSuggestion() {
        return "Remove the duplicate attribute or combine their values if appropriate.";
    }
}
