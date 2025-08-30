package Classes;

import java.util.ArrayList;
import java.util.List;

public class HtmlNode extends ASTNode {

    public enum HtmlType {
        ELEMENT, SELF_CLOSING, TEXT, EMBEDDED_STATEMENTS, STYLE
    }

    private HtmlType type;

    private String tagName;
    private final List<HtmlAttribute> attributes = new ArrayList<>();
    private final List<HtmlNode> children = new ArrayList<>();
    private String textContent; // for TEXT node
    private final List<ASTNode> embeddedStatements = new ArrayList<>();

    public HtmlNode(HtmlType type) {
        this.type = type;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    public String getTagName() {
        return tagName;
    }

    public void addAttribute(String name, String value) {
        this.attributes.add(new HtmlAttribute(name, value));
    }

    public void addChild(HtmlNode child) {
        this.children.add(child);
    }

    public void setTextContent(String textContent) {
        this.textContent = textContent;
    }

    public void addEmbeddedStatement(ASTNode statement) {
        this.embeddedStatements.add(statement);
    }

    public HtmlType getType() {
        return type;
    }

    public List<HtmlAttribute> getAttributes() {
        return attributes;
    }

    public List<HtmlNode> getChildren() {
        return children;
    }

    public String getTextContent() {
        return textContent;
    }

    public List<ASTNode> getEmbeddedStatements() {
        return embeddedStatements;
    }

    @Override
    public String toString() {
        return "HtmlNode{" +
                "type=" + type +
                ", tagName='" + tagName + '\'' +
                ", attributes=" + attributes +
                ", children=" + children +
                ", textContent='" + textContent + '\'' +
                ", embeddedStatements=" + embeddedStatements +
                '}';
    }

    public static class HtmlAttribute {
        private final String name;
        private final String value;

        public HtmlAttribute(String name, String value) {
            this.name = name;
            this.value = value;
        }

        public String getName() {
            return name;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return name + "=\"" + value + "\"";
        }
    }
}
