package Classes.Errors;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SemanticErrorManager {
    private List<SemanticError> errors;

    public SemanticErrorManager() {
        this.errors = new ArrayList<>();
    }

    public void addError(SemanticError error) {
        errors.add(error);
    }

    public List<SemanticError> getErrors() {
        return new ArrayList<>(errors);
    }

    public List<SemanticError> getErrorsBySeverity(String severity) {
        return errors.stream()
                .filter(error -> error.getSeverity().equals(severity))
                .collect(Collectors.toList());
    }

    public boolean hasErrors() {
        return errors.stream().anyMatch(error -> error.getSeverity().equals("ERROR"));
    }

    public boolean hasWarnings() {
        return errors.stream().anyMatch(error -> error.getSeverity().equals("WARNING"));
    }

    public void printAllErrors() {
        errors.forEach(System.out::println);
    }

    public void printErrorsSummary() {
        long errorCount = errors.stream().filter(e -> e.getSeverity().equals("ERROR")).count();
        long warningCount = errors.stream().filter(e -> e.getSeverity().equals("WARNING")).count();

        System.out.println("Compilation Summary:");
        System.out.println("Errors: " + errorCount);
        System.out.println("Warnings: " + warningCount);
    }

    public void clear() {
        errors.clear();
    }
}
