package Classes;

public class ExportNode extends ASTNode {
    private String exportType;  // "class", "function", "value", "default"
    private ASTNode exportValue; // ClassNode, FunctionNode, ValueNode, etc.
    private boolean isDefault;

    public ExportNode() {
        this.isDefault = false;
    }

    // ------ Getters & Setters ------
    public String getExportType() {
        return exportType;
    }

    public void setExportType(String exportType) {
        this.exportType = exportType;
    }

    public ASTNode getExportValue() {
        return exportValue;
    }

    public void setExportValue(ASTNode exportValue) {
        this.exportValue = exportValue;

        // تحديد النوع تلقائياً بناءً على العقدة
        if (exportValue instanceof ClassNode) {
            this.exportType = "class";
        } else if (exportValue instanceof ValueNode) {
            this.exportType = "value";
        }
    }

    public boolean isDefault() {
        return isDefault;
    }

    public void setDefault(boolean isDefault) {
        this.isDefault = isDefault;
    }

    // ------ تمثيل نصي ------
    @Override
    public String toString() {
        String type = isDefault ? "default " + exportType : exportType;
        return "Export[" + type + "] " + exportValue;
    }
}