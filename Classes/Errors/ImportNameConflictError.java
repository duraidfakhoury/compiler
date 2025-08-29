package Classes.Errors;

public class ImportNameConflictError extends SemanticError {
    private String importName;

    public ImportNameConflictError(String importName, int line, int column) {
        super("Import name '" + importName + "' conflicts with existing declaration",
                line, column, "SE021", "ERROR");
        this.importName = importName;
    }

    @Override
    public String getDetailedMessage() {
        return "The imported name conflicts with a variable or function already declared in this scope.";
    }

    @Override
    public String getSuggestion() {
        return "Use an alias for the import: import { " + importName + " as newName } from '...';";
    }
}
