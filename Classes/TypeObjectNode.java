package Classes;

import java.util.ArrayList;
import java.util.List;

public class TypeObjectNode extends ASTNode {
    private List<TypeMemberNode> typeMembers;

    public TypeObjectNode() {
        this.typeMembers = new ArrayList<>();
    }

    public void addTypeMember(TypeMemberNode typeMember) {
        this.typeMembers.add(typeMember);
    }

    public List<TypeMemberNode> getTypeMembers() {
        return typeMembers;
    }

    public void setTypeMembers(List<TypeMemberNode> typeMembers) {
        this.typeMembers = typeMembers;
    }

    @Override
    public String toString() {
        return "\nTypeObjectNode{" +
                "typeMembers=" + typeMembers +
                "}";
    }
}
