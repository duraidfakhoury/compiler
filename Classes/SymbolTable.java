package Classes;

import java.util.*;

public class SymbolTable {
    private Map<String, List<Symbol>> symbols; // Changed to Map<String, List<Symbol>>
    private Stack<String> scopeStack;
    private int scopeCounter;
    private List<CompilerError> errors;

    public SymbolTable() {
        this.symbols = new HashMap<>(); // Initialize as HashMap
        this.scopeStack = new Stack<>();
        this.scopeCounter = 0;
        this.errors = new ArrayList<>();
        enterScope("global");
    }

    /**
     * Basic print method that prints all symbols in the symbol table
     */
    public void print() {
        int totalSymbols = 0;

        // Count total symbols
        for (List<Symbol> scopeSymbols : symbols.values()) {
            totalSymbols += scopeSymbols.size();
        }

        if (totalSymbols == 0) {
            System.out.println("Symbol table is empty.");
            return;
        }

        int maxNameLength = 4; // "NAME"
        int maxTypeLength = 4; // "TYPE"
        int maxKindLength = 4; // "KIND"
        int maxScopeLength = 5; // "SCOPE"

        for (List<Symbol> scopeSymbols : symbols.values()) {
            for (Symbol symbol : scopeSymbols) {
                if (symbol.getName() != null && symbol.getName().length() > maxNameLength) {
                    maxNameLength = symbol.getName().length();
                }
                if (symbol.getType() != null && symbol.getType().length() > maxTypeLength) {
                    maxTypeLength = symbol.getType().length();
                }
                if (symbol.getKind() != null && symbol.getKind().length() > maxKindLength) {
                    maxKindLength = symbol.getKind().length();
                }
                if (symbol.getScope() != null && symbol.getScope().length() > maxScopeLength) {
                    maxScopeLength = symbol.getScope().length();
                }
            }
        }

        maxNameLength = Math.max(maxNameLength, 10);
        maxTypeLength = Math.max(maxTypeLength, 10);
        maxKindLength = Math.max(maxKindLength, 10);
        maxScopeLength = Math.max(maxScopeLength, 10);

        // Print header
        String format = "| %-" + maxNameLength + "s | %-" + maxTypeLength + "s | %-" + maxKindLength + "s | %-" + maxScopeLength + "s | %-5s | %-4s |";
        String separator = "+" + repeatString("-", maxNameLength + 2) + "+" + repeatString("-", maxTypeLength + 2) + "+" +
                repeatString("-", maxKindLength + 2) + "+" + repeatString("-", maxScopeLength + 2) + "+" +
                repeatString("-", 7) + "+" + repeatString("-", 6) + "+";

        System.out.println(separator);
        System.out.printf(format + "%n", "NAME", "TYPE", "KIND", "SCOPE", "LINE", "INIT");
        System.out.println(separator);

        // Print all symbols from all scopes
        for (String scope : symbols.keySet()) {
            List<Symbol> scopeSymbols = symbols.get(scope);
            for (Symbol symbol : scopeSymbols) {
                System.out.printf(format + "%n",
                        symbol.getName() != null ? symbol.getName() : "",
                        symbol.getType() != null ? symbol.getType() : "",
                        symbol.getKind() != null ? symbol.getKind() : "",
                        symbol.getScope() != null ? symbol.getScope() : "",
                        symbol.getLine(),
                        symbol.isInitialized() ? "Yes" : "No");
            }
        }

        System.out.println(separator);
        System.out.println("Total entries: " + totalSymbols);
    }

    public void enterScope(String scopeName) {
        if (scopeName.equals("global")) {
            scopeStack.push("global");
        } else {
            String newScope = getCurrentScope() + "." + scopeName + "_" + (++scopeCounter);
            scopeStack.push(newScope);
        }

        // Initialize the list for this scope if it doesn't exist
        if (!symbols.containsKey(getCurrentScope())) {
            symbols.put(getCurrentScope(), new ArrayList<>());
        }
    }

    public void exitScope() {
        if (scopeStack.size() > 1) {
            scopeStack.pop();
        }
    }

    public String getCurrentScope() {
        return scopeStack.peek();
    }

    public boolean declareSymbol(String name, String type, String kind, int line, int column) {
        String currentScope = getCurrentScope();

        // Make sure the scope exists in the map
        if (!symbols.containsKey(currentScope)) {
            symbols.put(currentScope, new ArrayList<>());
        }

        List<Symbol> scopeSymbols = symbols.get(currentScope);

        // Check for duplicate declaration in current scope
        for (Symbol symbol : scopeSymbols) {
            if (symbol.getName().equals(name)) {
                addSemanticError("Duplicate declaration of '" + name + "' at line " + line +
                        ". Previously declared at line " + symbol.getLine());
                return false;
            }
        }

        Symbol symbol = new Symbol(name, type, kind, line, column, currentScope);
        scopeSymbols.add(symbol);
        return true;
    }

    public boolean declareSymbolInScope(String name, String type, String kind, int line, int column, String scope) {
        // Make sure the scope exists in the map
        if (!symbols.containsKey(scope)) {
            symbols.put(scope, new ArrayList<>());
        }

        List<Symbol> scopeSymbols = symbols.get(scope);

        // Check for duplicate declaration in the specified scope
        for (Symbol symbol : scopeSymbols) {
            if (symbol.getName().equals(name)) {
                addSemanticError("Duplicate declaration of '" + name + "' at line " + line +
                        ". Previously declared at line " + symbol.getLine());
                return false;
            }
        }

        Symbol symbol = new Symbol(name, type, kind, line, column, scope);
        scopeSymbols.add(symbol);
        return true;
    }

    public Symbol lookupSymbol(String name) {
        // Always search from current scope up to global scope
        for (int i = scopeStack.size() - 1; i >= 0; i--) {
            String scope = scopeStack.get(i);
            List<Symbol> scopeSymbols = symbols.get(scope);
            if (scopeSymbols != null) {
                for (Symbol symbol : scopeSymbols) {
                    if (symbol.getName().equals(name)) {
                        return symbol;
                    }
                }
            }
        }
        
        // Also explicitly search in global scope to ensure we don't miss anything
        List<Symbol> globalSymbols = symbols.get("global");
        if (globalSymbols != null) {
            for (Symbol symbol : globalSymbols) {
                if (symbol.getName().equals(name)) {
                    return symbol;
                }
            }
        }
        
        return null;
    }

    /**
     * Returns a list of all symbols in the symbol table, across all scopes.
     */
    public List<Symbol> getAllSymbols() {
        List<Symbol> all = new ArrayList<>();
        for (List<Symbol> scopeSymbols : symbols.values()) {
            all.addAll(scopeSymbols);
        }
        return all;
    }

    /**
     * Checks if a symbol with the given name is declared in the current scope.
     */
    public boolean isDeclaredInCurrentScope(String name) {
        String currentScope = getCurrentScope();
        List<Symbol> scopeSymbols = symbols.get(currentScope);
        if (scopeSymbols != null) {
            for (Symbol symbol : scopeSymbols) {
                if (symbol.getName().equals(name)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void addError(CompilerError error) {
        errors.add(error);
    }

    public void addSemanticError(String message) {
        // For backward compatibility, create a SemanticError without line/column
        errors.add(new SemanticError(message, 0, 0));
    }

    public void addSemanticError(String message, int line, int column) {
        errors.add(new SemanticError(message, line, column));
    }

    public void addControlFlowError(String message, int line, int column) {
        // Treat control-flow issues as warnings by default
        errors.add(new ControlFlowError(message, line, column, CompilerError.ErrorSeverity.WARNING));
    }

    public void addTypeError(String message, int line, int column) {
        errors.add(new TypeError(message, line, column));
    }

    public List<CompilerError> getErrors() {
        return errors;
    }

    public List<CompilerError> getErrorsByType(CompilerError.ErrorType type) {
        List<CompilerError> filteredErrors = new ArrayList<>();
        for (CompilerError error : errors) {
            if (error.getType() == type) {
                filteredErrors.add(error);
            }
        }
        return filteredErrors;
    }

    public boolean hasErrors() {
        return !errors.isEmpty();
    }

    public boolean hasErrorsByType(CompilerError.ErrorType type) {
        for (CompilerError error : errors) {
            if (error.getType() == type) {
                return true;
            }
        }
        return false;
    }

    public void printErrors() {
        if (hasErrors()) {
            System.out.println("\nCOMPILER ERRORS FOUND:");
            System.out.println(repeatString("=", 50));
            
            // Group errors by type
            Map<CompilerError.ErrorType, List<CompilerError>> errorsByType = new HashMap<>();
            for (CompilerError error : errors) {
                errorsByType.computeIfAbsent(error.getType(), k -> new ArrayList<>()).add(error);
            }
            
            int errorCount = 1;
            for (CompilerError.ErrorType type : errorsByType.keySet()) {
                List<CompilerError> typeErrors = errorsByType.get(type);
                System.out.println("\n" + type.toString().toUpperCase() + " ERRORS:");
                for (CompilerError error : typeErrors) {
                    System.out.println(errorCount++ + ". " + error.getMessage() + 
                        (error.getLine() > 0 ? " at line " + error.getLine() : ""));
                }
            }
        } else {
            System.out.println("\nNo compiler errors found.");
        }
    }

    /**
     * Print symbols grouped by scope
     */
    public void printByScope() {
        int totalSymbols = 0;

        // Count total symbols
        for (List<Symbol> scopeSymbols : symbols.values()) {
            totalSymbols += scopeSymbols.size();
        }

        if (totalSymbols == 0) {
            System.out.println("Symbol table is empty.");
            return;
        }

        System.out.println("SYMBOL TABLE BY SCOPE");
        System.out.println(repeatString("=", 50));

        for (String scope : symbols.keySet()) {
            List<Symbol> scopeSymbols = symbols.get(scope);

            System.out.println("\nSCOPE: " + scope + " (" + scopeSymbols.size() + " symbols)");
            System.out.println(repeatString("-", 30));

            if (scopeSymbols.isEmpty()) {
                System.out.println("  No symbols in this scope.");
                continue;
            }

            // Print symbols in this scope
            for (Symbol symbol : scopeSymbols) {
                System.out.printf("  • %-15s : %-10s (%-10s) line %-4d %s%n",
                        symbol.getName(),
                        symbol.getType(),
                        symbol.getKind(),
                        symbol.getLine(),
                        symbol.isInitialized() ? "[initialized]" : "[uninitialized]");
            }
        }

        System.out.println("\n" + repeatString("=", 50));
        System.out.println("Total scopes: " + symbols.size());
        System.out.println("Total symbols: " + totalSymbols);
    }

    /**
     * Helper method to repeat a string n times (since String.repeat() is Java 11+)
     */
    private String repeatString(String str, int times) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < times; i++) {
            sb.append(str);
        }
        return sb.toString();
    }
    
    /**
     * Get all scopes in the symbol table
     */
    public Set<String> getAllScopes() {
        return new HashSet<>(symbols.keySet());
    }
    
    /**
     * Get all symbols in a specific scope
     */
    public List<Symbol> getSymbolsInScope(String scope) {
        return symbols.get(scope);
    }
}