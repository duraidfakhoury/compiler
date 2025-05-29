package Classes;

class ReturnNode extends ASTNode {
    public ASTNode value;  // The value being returned (optional)


    public ASTNode getValue() {
        return value;
    }

    public void setValue(ASTNode value) {
        this.value = value;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("\nReturnNode{");
        if (value != null) {
            sb.append("value=").append(value.toString());
        }
        sb.append("}");
        return sb.toString();
    }
}
