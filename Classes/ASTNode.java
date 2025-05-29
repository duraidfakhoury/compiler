package Classes;

public abstract class ASTNode {
    private int line ;
    private int column ;

    public int getColumn() {
        return column;
    }
    public void setColumn(int column) {
        this.column = column;
    }
    public int getLine() {
        return line;
    }
    public void setLine(int line) {
        this.line = line;
    }
    public abstract String toString();
}
