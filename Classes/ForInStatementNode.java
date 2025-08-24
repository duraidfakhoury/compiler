package Classes;

public class ForInStatementNode extends ASTNode {
    public final ASTNode iterator;
    public final ASTNode iterable;
    public final ASTNode body;

    public ForInStatementNode(ASTNode iterator, ASTNode iterable, ASTNode body) {
        this.iterator = iterator;
        this.iterable = iterable;
        this.body = body;
    }

    public ASTNode getIterator() {
        return iterator;
    }

    public ASTNode getIterable() {
        return iterable;
    }

    public ASTNode getBody() {
        return body;
    }

    @Override
    public String toString() {
        return "ForInStatement(\n  iterator=" + iterator + ",\n  iterable=" + iterable + ",\n  body=" + body + "\n)";
    }
}
