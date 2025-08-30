package Classes;

public class TypeDeclarationValueNode extends ASTNode {
    private String type;
    private boolean isArray;
    private TypeObjectNode typeObject;

    // Constructor for simple type (e.g., string, number, etc.)
    public TypeDeclarationValueNode(String type, boolean isArray) {
        this.type = type;
        this.isArray = isArray;
        this.typeObject = null;
    }

    // Constructor for object type
    public TypeDeclarationValueNode(TypeObjectNode typeObject) {
        this.type = null;
        this.isArray = false;
        this.typeObject = typeObject;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isArray() {
        return isArray;
    }

    public void setArray(boolean array) {
        isArray = array;
    }

    public TypeObjectNode getTypeObject() {
        return typeObject;
    }

    public void setTypeObject(TypeObjectNode typeObject) {
        this.typeObject = typeObject;
    }

    public boolean isSimpleType() {
        return type != null;
    }

    public boolean isObjectType() {
        return typeObject != null;
    }
    
    public String getName() {
        if (isSimpleType()) {
            return type;
        } else if (isObjectType()) {
            return "object";
        }
        return "unknown";
    }

    public ValueNode getValue() {
        if (isSimpleType()) {
            // For simple types, we need to create a ValueNode
            // This is a placeholder - you might need to adjust based on your AST structure
            return null;
        } else if (isObjectType()) {
            // For object types, we need to create a ValueNode
            // This is a placeholder - you might need to adjust based on your AST structure
            return null;
        }
        return null;
    }

    @Override
    public String toString() {
        if (isSimpleType()) {
            return "\nTypeDeclarationValueNode{" +
                    "type='" + type + '\'' +
                    ", isArray=" + isArray +
                    "}";
        } else {
            return "\nTypeDeclarationValueNode{" +
                    "typeObject=" + typeObject +
                    "}";
        }
    }
}
