package Classes;

import java.util.*;

public class ImportNode extends ASTNode {
    public String source;  // The source module/file being imported from
    public List<String> imports;  // A list of specific items being imported

    public ImportNode() {
        super("ImportNode");
        this.imports = new ArrayList<String>();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ImportNode{source=");
        sb.append(source);
        sb.append(", imports=");
        sb.append(imports);
        sb.append("}");
        return sb.toString();
    }
}

class ImportItemNode {
    public String name;   // Name of the imported item
    public boolean isDefault;  // Whether the item is a default import
    public boolean isWildcard;  // Whether it is a wildcard import

    public ImportItemNode(String name, boolean isDefault, boolean isWildcard) {
        this.name = name;
        this.isDefault = isDefault;
        this.isWildcard = isWildcard;
    }

    @Override
    public String toString() {
        if (isWildcard) {
            return "*";  // Representing wildcard imports
        }
        return isDefault ? "default " + name : name;
    }
}
