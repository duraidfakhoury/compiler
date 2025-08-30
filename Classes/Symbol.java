package Classes;

public class Symbol {
    private String name;
    private String type;
    private String kind; // variable, function, class, parameter
    private int line;
    private int column;
    private boolean isInitialized;
    private boolean isUsed;
    private String scope;
    private int parameterCount = 0; // For functions, number of parameters

    public Symbol(String name, String type, String kind, int line, int column, String scope) {
        this.name = name;
        this.type = type;
        this.kind = kind;
        this.line = line;
        this.column = column;
        this.scope = scope;
        this.isInitialized = false;
        this.isUsed = false;
    }

    // Overloaded constructor for functions with parameter count
    public Symbol(String name, String type, String kind, int line, int column, String scope, int parameterCount) {
        this.name = name;
        this.type = type;
        this.kind = kind;
        this.line = line;
        this.column = column;
        this.scope = scope;
        this.isInitialized = false;
        this.isUsed = false;
        this.parameterCount = parameterCount;
    }

    // Getters and setters
    public String getName() { return name; }
    public String getType() { return type; }
    public String getKind() { return kind; }
    public int getLine() { return line; }
    public int getColumn() { return column; }
    public boolean isInitialized() { return isInitialized; }
    public boolean isUsed() { return isUsed; }
    public String getScope() { return scope; }
    public int getParameterCount() { return parameterCount; }

    public void setInitialized(boolean initialized) { this.isInitialized = initialized; }
    public void setUsed(boolean used) { this.isUsed = used; }
    public void setType(String type) { this.type = type; }
    public void setParameterCount(int parameterCount) { this.parameterCount = parameterCount; }
    
    // For storing AST nodes for type declarations
    private ASTNode astNode;
    
    public void setAstNode(ASTNode astNode) { this.astNode = astNode; }
    public ASTNode getAstNode() { return astNode; }
}