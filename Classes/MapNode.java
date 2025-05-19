package Classes;

public class MapNode extends ASTNode {
    public ASTNode array;          // مصفوفة البيانات (مثل `products`)
    public ASTNode mapFunction;    // الدالة المطبقة على كل عنصر في المصفوفة

    public MapNode(ASTNode array, ASTNode mapFunction) {
        super("MapNode");
        this.array = array;
        this.mapFunction = mapFunction;
    }

    @Override
    public String toString() {
        return super.toString() + " [array=" + array + ", mapFunction=" + mapFunction + "]";
    }
}

