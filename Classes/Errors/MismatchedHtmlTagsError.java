package Classes.Errors;

public class MismatchedHtmlTagsError extends SemanticError {
    private String openTag;
    private String closeTag;

    public MismatchedHtmlTagsError(String openTag, String closeTag, int line, int column) {
        super("Mismatched HTML tags: opened with '" + openTag + "' but closed with '" + closeTag + "'",
                line, column, "SE023", "ERROR");
        this.openTag = openTag;
        this.closeTag = closeTag;
    }

    @Override
    public String getDetailedMessage() {
        return "HTML tag '" + openTag + "' is not properly closed with matching tag.";
    }

    @Override
    public String getSuggestion() {
        return "Close the tag with </" + openTag + "> instead of </" + closeTag + ">";
    }
}
