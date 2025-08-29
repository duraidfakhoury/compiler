package Classes.Errors;

public class InvalidAngularDirectiveError extends SemanticError {
    private String directiveName;

    public InvalidAngularDirectiveError(String directiveName, int line, int column) {
        super("Unknown Angular directive '" + directiveName + "'",
                line, column, "SE025", "WARNING");
        this.directiveName = directiveName;
    }

    @Override
    public String getDetailedMessage() {
        return "Directive '" + directiveName + "' is not a recognized Angular directive.";
    }

    @Override
    public String getSuggestion() {
        return "Check the directive name spelling or import the required module.";
    }
}
