package Classes;

import java.util.ArrayList;
import java.util.List;

public class ImportNode extends ASTNode {
    private final List<String> imports = new ArrayList<>();
    private final String source;
    private boolean isDefaultImport;
    private boolean isHtmlImport; // للتمييز بين LBRACE و LBRACE_HTML

    public ImportNode(String source) {
        this.source = source;
    }

    public void addImport(String importName) {
        imports.add(importName);
    }

    public void setDefaultImport(boolean isDefault) {
        this.isDefaultImport = isDefault;
    }

    public void setHtmlImport(boolean isHtml) {
        this.isHtmlImport = isHtml;
    }

    public List<String> getImports() {
        return imports;
    }

    public String getSource() {
        return source;
    }

    public boolean isDefaultImport() {
        return isDefaultImport;
    }

    public boolean isHtmlImport() {
        return isHtmlImport;
    }

    @Override
    public String toString() {
        return "\nImportNode{" +
                "imports=" + imports +
                ", source='" + source +
                '}';
    }
}
