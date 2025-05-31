import Classes.ASTNode;
import Classes.BaseVisitor;
import Classes.SymbolTable;
import Classes.Symbol;
import gen.GrammarParser;
import gen.MyLexer;
import org.antlr.v4.runtime.*;

public class Main {
    public static void main(String[] args) {
        String input = "test/test.txt";

        try {
            // Set up lexer and parser
            CharStream inputStream = CharStreams.fromFileName(input);
            MyLexer lexer = new MyLexer(inputStream);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            GrammarParser parser = new GrammarParser(tokens);

            // Add error listener for syntax errors
            parser.removeErrorListeners();
            parser.addErrorListener(new BaseErrorListener() {
                @Override
                public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol,
                                        int line, int charPositionInLine, String msg, RecognitionException e) {
                    System.err.println("Syntax Error at line " + line + ":" + charPositionInLine + " - " + msg);
                }
            });

            // Parse the input
            GrammarParser.ProgramContext tree = parser.program();

            // Check for syntax errors
            if (parser.getNumberOfSyntaxErrors() > 0) {
                System.out.println("\n✗ Compilation failed due to syntax errors.");
                return;
            }

            // Generate AST
            System.out.println("\n" + "=".repeat(60));
            System.out.println("ABSTRACT SYNTAX TREE:");
            System.out.println("=".repeat(60));

            BaseVisitor visitor = new BaseVisitor();
            ASTNode ast = visitor.visit(tree);
            System.out.println(ast.toString());
            System.out.println("\n✓ AST Generated Successfully!");

            // Print symbol table from BaseVisitor
            System.out.println("\n" + "=".repeat(60));
            System.out.println("SYMBOL TABLE (BASIC):");
            System.out.println("=".repeat(60));

            // If your BaseVisitor has a getSymbolTable method, use it
            // Otherwise, access the symbolTable field directly if it's public
            try {
                visitor.getSymbolTable().print();
            } catch (Exception e) {
                System.out.println("Could not print basic symbol table: " + e.getMessage());
            }

            // Perform semantic analysis
            System.out.println("\n" + "=".repeat(60));
            System.out.println("SEMANTIC ANALYSIS:");
            System.out.println("=".repeat(60));

            // Print symbols grouped by scope
            System.out.println("\nSymbols By Scope:");
            System.out.println("-".repeat(30));
            visitor.getSymbolTable().printByScope();

            if (!visitor.getSymbolTable().hasErrors()) {
                System.out.println("\n✓ Semantic analysis passed! No errors found.");
            } else {
                System.out.println("\n✗ Compilation failed due to semantic errors.");
                visitor.getSymbolTable().printErrors();
            }

        } catch (Exception e) {
            System.err.println("\nError processing file: " + e.getMessage());
            e.printStackTrace();
        }
    }
}