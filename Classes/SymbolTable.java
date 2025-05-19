package Classes;

import java.util.HashMap;
import java.util.Map;

public class SymbolTable {

    // A map to store symbols by their names
    private Map<String, Symbol> symbols = new HashMap<>();

    // Add a symbol to the table
    public void addSymbol(String name, Symbol symbol) {
        symbols.put(name, symbol);
    }

    // Lookup a symbol by its name
    public Symbol lookup(String name) {
        return symbols.get(name);
    }

    // Print out all symbols in the symbol table
    public void printSymbols() {
        symbols.forEach((name, symbol) -> {
            System.out.println("Symbol: " + name + ", Type: " + symbol.getType());
        });
    }
}
