package Classes;

class IdentifierNode extends ASTNode {
    public String name;
    public String type; // Type of the identifier (e.g., 'variable', 'function', etc.)
    public String scope; // Scope information (e.g., 'local', 'global')

    public IdentifierNode(String name) {
        super("IdentifierNode");
        this.name = name;
        this.type = null;  // Default: unknown type
        this.scope = null; // Default: unknown scope
    }

    // Optional: Constructor to set type and scope
    public IdentifierNode(String name, String type, String scope) {
        super("IdentifierNode");
        this.name = name;
        this.type = type;
        this.scope = scope;
    }


    @Override
    public String toString() {
        return "IdentifierNode{ name=" + name + ", type=" + type + ", scope=" + scope + " }";
    }
}
