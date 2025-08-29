package Classes.Errors;

public class DuplicateClassMemberError extends SemanticError {
    private String memberName;
    private String className;

    public DuplicateClassMemberError(String memberName, String className, int line, int column) {
        super("Duplicate member '" + memberName + "' in class '" + className + "'",
                line, column, "SE020", "ERROR");
        this.memberName = memberName;
        this.className = className;
    }

    @Override
    public String getDetailedMessage() {
        return "Class members must have unique names within the same class.";
    }

    @Override
    public String getSuggestion() {
        return "Use a different name for the member or remove the duplicate.";
    }
}
