import Classes.ASTNode;
import Classes.BaseVisitor;
import Classes.SymbolTable;
import Classes.Symbol;
import Classes.CodeGenerator;
import Classes.ComponentStatementNode;
import Classes.ProgramNode;
import gen.GrammarParser;
import gen.MyLexer;
import org.antlr.v4.runtime.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        String input = "test/angular_directives_test.txt";

        try {
            // Read the source file first to extract CSS content
            String sourceCode = readSourceFile(input);
            if (sourceCode == null) {
                System.err.println("Could not read source file");
                return;
            }

            // Extract CSS content before parsing to avoid lexer issues with curly braces
            CodeGenerator tempCodeGenerator = new CodeGenerator();
            String rootStyles = tempCodeGenerator.extractRootStyles(sourceCode);
            
            // Set up lexer and parser with the cleaned code
            CharStream inputStream = CharStreams.fromString(sourceCode);
            MyLexer lexer = new MyLexer(inputStream);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            GrammarParser parser = new GrammarParser(tokens);

            // Add error listener for syntax errors
            parser.removeErrorListeners();
            parser.addErrorListener(new BaseErrorListener() {
                @Override
                public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol,
                                        int line, int charPositionInLine, String msg, RecognitionException e) {
                    String rule = "";
                    if (recognizer instanceof Parser) {
                        Parser parser = (Parser) recognizer;
                        int ruleIndex = parser.getContext() != null ? parser.getContext().getRuleIndex() : -1;
                        if (ruleIndex >= 0) {
                            rule = parser.getRuleNames()[ruleIndex];
                        }
                    }
                    System.err.println("Syntax Error at line " + line + ":" + charPositionInLine + " - " + msg +
                        (rule.isEmpty() ? "" : " (in rule: " + rule + ")"));
                }
            });

            GrammarParser.ProgramContext tree = parser.program();

            if (parser.getNumberOfSyntaxErrors() > 0) {
                System.out.println("\n✗ Compilation failed due to syntax errors.");
                return;
            }

            System.out.println("\n" + "=".repeat(60));
            System.out.println("ABSTRACT SYNTAX TREE:");
            System.out.println("=".repeat(60));

            BaseVisitor visitor = new BaseVisitor();
            ASTNode ast = visitor.visit(tree);
            System.out.println(ast.toString());
            System.out.println("\n✓ AST Generated Successfully!");

            System.out.println("\n" + "=".repeat(60));
            System.out.println("SYMBOL TABLE (BASIC):");
            System.out.println("=".repeat(60));


            try {
                visitor.getSymbolTable().print();
            } catch (Exception e) {
                System.out.println("Could not print basic symbol table: " + e.getMessage());
            }

            System.out.println("\n" + "=".repeat(60));
            System.out.println("SEMANTIC ANALYSIS:");
            System.out.println("=".repeat(60));

            System.out.println("\nSymbols By Scope:");
            System.out.println("-".repeat(30));
            visitor.getSymbolTable().printByScope();

            if (!visitor.getSymbolTable().hasErrors()) {
                System.out.println("\n✓ Semantic analysis passed! No errors found.");
                
                // Code Generation
                System.out.println("\n" + "=".repeat(60));
                System.out.println("CODE GENERATION:");
                System.out.println("=".repeat(60));
                
                generateCode(ast, rootStyles);
                
            } else {
                System.out.println("\n✗ Compilation failed due to semantic errors.");
                visitor.getSymbolTable().printErrors();

            }

        } catch (Exception e) {
            System.err.println("\nError processing file: " + e.getMessage());
            e.printStackTrace();
        }
    }
    
    private static void generateCode(ASTNode ast, String rootStyles) {
        try {
            CodeGenerator codeGenerator = new CodeGenerator();
            
            if (ast instanceof ProgramNode) {
                ProgramNode program = (ProgramNode) ast;
                
                // Look for component statements
                for (ASTNode statement : program.getStatements()) {
                    if (statement instanceof ComponentStatementNode) {
                        ComponentStatementNode component = (ComponentStatementNode) statement;
                        
                        System.out.println("\nGenerating code for component: " + component.getSelector());
                        System.out.println("-".repeat(40));

                        // Use the already extracted root styles
                        if (rootStyles != null) {
                            System.out.println("\nRoot styles found:");
                            System.out.println(rootStyles);
                        }
                        
                        // Generate complete HTML page with root styles
                        String htmlPage = codeGenerator.generateHtmlPage(component, rootStyles);
                        System.out.println("\nComplete HTML Page:");
                        System.out.println(htmlPage);
                        
                        System.out.println("\n✓ Code generation completed successfully!");
                    }
                }
                
                // If no components found
                if (program.getStatements().stream().noneMatch(stmt -> stmt instanceof ComponentStatementNode)) {
                    System.out.println("No components found in the program.");
                }
            }
            
        } catch (Exception e) {
            System.err.println("Error during code generation: " + e.getMessage());
            e.printStackTrace();
        }
    }
    
    /**
     * Read source file content
     */
    private static String readSourceFile(String filename) {
        try {
            java.nio.file.Path path = java.nio.file.Paths.get(filename);
            return java.nio.file.Files.readString(path);
        } catch (Exception e) {
            System.err.println("Could not read source file: " + e.getMessage());
            return null;
        }
    }
}