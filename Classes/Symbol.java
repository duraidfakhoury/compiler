package Classes;
public class Symbol {

    private final String name;
    private final String type;  // "variable", "function", etc.
    private final Object value;

    public Symbol(String name, String type, Object value) {
        this.name = name;
        this.type = type;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public Object getValue() {
        return value;
    }
}
