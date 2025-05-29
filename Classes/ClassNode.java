package Classes;

import java.util.ArrayList;
import java.util.List;

public class ClassNode extends ASTNode {
    private String className;
    private List<VariableDeclarationNode> fields;
    private List<FunctionDeclarationNode> methods;
    private List<ASTNode> otherMembers; // لأعضاء إضافيين (مثل ديكورات)

    public ClassNode(String className) {
        this.className = className;
        this.fields = new ArrayList<>();
        this.methods = new ArrayList<>();
        this.otherMembers = new ArrayList<>();
    }

    // ------ Getters & Setters ------
    public String getClassName() {
        return className;
    }

    public List<VariableDeclarationNode> getFields() {
        return fields;
    }

    public List<FunctionDeclarationNode> getMethods() {
        return methods;
    }

    public List<ASTNode> getOtherMembers() {
        return otherMembers;
    }

    // ------ Methods لإضافة الأعضاء ------
    public void addField(VariableDeclarationNode field) {
        this.fields.add(field);
    }

    public void addMethod(FunctionDeclarationNode method) {
        this.methods.add(method);
    }

    public void addOtherMember(ASTNode member) {
        this.otherMembers.add(member);
    }

    // ------ تمثيل نصي للكلاس (لأغراض التصحيح) ------
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Class: ").append(className).append("\n");

        sb.append("Fields:\n");
        for (var field : fields) {
            sb.append("  ").append(field).append("\n");
        }

        sb.append("Methods:\n");
        for (var method : methods) {
            sb.append("  ").append(method).append("\n");
        }

        return sb.toString();
    }
}