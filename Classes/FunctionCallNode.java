package Classes;

import java.util.ArrayList;
import java.util.List;

public class FunctionCallNode extends PrimaryValueNode {
    private String functionName;
    private List<ValueNode> arguments = new ArrayList<>();
    public FunctionCallNode(String name) { this.functionName = name; }
    public void addArgument(ValueNode arg) { arguments.add(arg); }

    @Override
    public String toString() {
        return "\nFunctionCallNode{" +
                "functionName='" + functionName + '\'' +
                ", arguments=" + arguments +
                '}';
    }
}
