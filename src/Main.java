import Classes.ASTBuilder;
import Classes.ASTNode;
import gen.GrammarParser;
import gen.MyLexer;
import org.antlr.v4.runtime.*;

public class Main {
    public static void main(String[] args) {
        String input = "test/test.txt";

        try {
            // Use CharStreams.fromFileName() to read the file
            CharStream inputStream = CharStreams.fromFileName(input);
            MyLexer lexer = new MyLexer(inputStream);

            CommonTokenStream tokens = new CommonTokenStream(lexer);
            GrammarParser parser = new GrammarParser(tokens);

            // Parse the program
            GrammarParser.ProgramContext tree = parser.program();

            // Build the AST using the ASTBuilder
            ASTBuilder builder = new ASTBuilder();
            ASTNode ast = builder.visit(tree);
            System.out.println(ast.toString());  // This will print the AST in a tree-like format

            // Use the AST for further processing
            System.out.println("AST Generated Successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
