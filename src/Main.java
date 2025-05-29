import Classes.ASTNode;
import Classes.BaseVisitor;
import gen.GrammarParser;
import gen.MyLexer;
import org.antlr.v4.runtime.*;

public class Main {
    public static void main(String[] args) {
        String input = "test/test.txt";

        try {
            CharStream inputStream = CharStreams.fromFileName(input);
            MyLexer lexer = new MyLexer(inputStream);

            CommonTokenStream tokens = new CommonTokenStream(lexer);
            GrammarParser parser = new GrammarParser(tokens);

            GrammarParser.ProgramContext tree = parser.program();

            BaseVisitor visitor = new BaseVisitor();
            ASTNode ast = visitor.visit(tree);
            System.out.println(ast.toString());

            System.out.println("AST Generated Successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
