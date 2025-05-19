package Classes;

import java.util.*;

class HtmlNode extends ASTNode {
    public String tagName;
    public Map<String, String> attributes = new HashMap<>();
    public List<ASTNode> children = new ArrayList<>();
    public boolean isSelfClosing;
    public String textContent;  // Optional: for text nodes inside HTML tags

    // Constructor
    public HtmlNode(String tagName) {
        super("HtmlNode");
        this.tagName = tagName;
        this.textContent = null; // By default, no text content
    }

    // Constructor with attributes and children
    public HtmlNode(String tagName, Map<String, String> attributes, boolean isSelfClosing) {
        super("HtmlNode");
        this.tagName = tagName;
        this.attributes = attributes;
        this.isSelfClosing = isSelfClosing;
        this.textContent = null;
    }

    // Add a child node
    public void addChild(ASTNode child) {
        children.add(child);
    }

    // Set text content
    public void setTextContent(String textContent) {
        this.textContent = textContent;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HtmlNode{tagName=").append(tagName);
        if (!attributes.isEmpty()) {
            sb.append(", attributes=").append(attributes);
        }
        if (textContent != null && !textContent.isEmpty()) {
            sb.append(", textContent='").append(textContent).append("'");
        }
        sb.append(", children=").append(children);
        sb.append(", isSelfClosing=").append(isSelfClosing);
        sb.append("}");
        return sb.toString();
    }
}
