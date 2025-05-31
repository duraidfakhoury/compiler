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

    // Getters and setters
    public String getName() { return name; }
    public String getType() { return type; }
    public String getKind() { return kind; }
    public int getLine() { return line; }
    public int getColumn() { return column; }
    public boolean isInitialized() { return isInitialized; }
    public boolean isUsed() { return isUsed; }
    public String getScope() { return scope; }

    public void setInitialized(boolean initialized) { this.isInitialized = initialized; }
    public void setUsed(boolean used) { this.isUsed = used; }
    public void setType(String type) { this.type = type; }
}