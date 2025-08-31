package Classes;

import java.util.Map;
import java.util.Set;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import Classes.FunctionCallNode;
import Classes.FunctionBodyNode;
import Classes.BooleanNode;
import Classes.PropertyAccessNode;
import Classes.ArrayNode;
import Classes.ArrayAccessNode;
import Classes.ObjectNode;
import Classes.ParenthesizedValueNode;
import Classes.IncrementNode;
import Classes.DecrementNode;
import Classes.IncDecNode;
import Classes.OperatorExpressionNode;
import Classes.NestedTemplateInterpolationNode;
import Classes.TypeDeclarationValueNode;
import Classes.TypeDefineNode;
import Classes.TypeNode;
import Classes.VariableDeclarationNode;
import Classes.VariableAssignNode;
import Classes.FunctionDeclarationNode;
import Classes.ReturnNode;
import Classes.IfStatementNode;
import Classes.IfBodyNode;
import Classes.ForStatementNode;
import Classes.WhileStatementNode;
import Classes.DoWhileStatementNode;
import Classes.ForInStatementNode;
import Classes.BlockNode;
import Classes.ClassNode;
import Classes.ImportNode;
import Classes.ExportNode;
import Classes.TypeDeclarationNode;
import Classes.TypeObjectNode;
import Classes.TypeMemberNode;
import Classes.ProgramNode;
import Classes.ComponentStatementNode;
import Classes.ArrowFunctionValueNode;
import Classes.HtmlNode;
import Classes.IdentifierNode;
import Classes.MethodCallValueNode;
import Classes.NumberNode;
import Classes.PrimaryValueNode;
import Classes.PropertyAccessValueNode;
import Classes.StringNode;
import Classes.TemplateLiteralNode;
import Classes.ValueNode;

public class CodeGenerator {
    private StringBuilder output;
    private int indentLevel;
    private static final String INDENT = "    ";
    private final Set<String> declaredProperties = new HashSet<>();
    private final Set<String> usedProperties = new HashSet<>();

    public CodeGenerator() {
        this.output = new StringBuilder();
        this.indentLevel = 0;
    }

    /**
     * Generate code for a component statement
     */
    public String generateComponent(ComponentStatementNode component) {
        output.setLength(0); // Clear previous output
        declaredProperties.clear();
        usedProperties.clear();
        
        // Generate component class
        generateComponentClass(component);
        
        return output.toString();
    }

    /**
     * Generate HTML template from various template types
     */
    private void generateTemplate(ValueNode template) {
        if (template == null) {
            appendLine("<!-- No template provided -->");
            return;
        }
        
        // Handle different types of template values
        if (template.getPrimaryValue() instanceof TemplateLiteralNode) {
            generateTemplateLiteral((TemplateLiteralNode) template.getPrimaryValue());
        } else if (template.getPrimaryValue() instanceof StringNode) {
            // Simple string template
            String content = ((StringNode) template.getPrimaryValue()).getValue();
            appendLine(transformInterpolationsForMainTemplate(content));
        } else if (template.getPrimaryValue() instanceof IdentifierNode) {
            // Handle variable references
            String varName = ((IdentifierNode) template.getPrimaryValue()).getName();
            appendLine("${" + varName + "}");
            usedProperties.add(varName);
        } else {
            appendLine("<!-- Template not supported: " + template.getPrimaryValue().getClass().getSimpleName() + " -->");
        }
    }

    private void generateComponentClass(ComponentStatementNode component) {
        String selector = component.getSelector();
        String className = selectorToClassName(selector);
        
        // Generate class declaration
        appendLine("class " + className + " extends HTMLElement {");
        indentLevel++;
        
        // Generate constructor
        appendLine("constructor() {");
        indentLevel++;
        appendLine("super();");
        
        // Initialize component properties with default values
        Map<String, ValueNode> properties = component.getProperties();
        for (Map.Entry<String, ValueNode> prop : properties.entrySet()) {
            String propName = prop.getKey();
            ValueNode propValue = prop.getValue();
            if (propValue != null) {
                String defaultValue = generatePropertyDefaultValue(propValue);
                appendLine("this._" + propName + " = " + defaultValue + ";");
            }
        }
        
        appendLine("this.render();");
        indentLevel--;
        appendLine("}");
        
        // Generate render method
        appendLine("render() {");
        indentLevel++;
        appendLine("// Clear existing content");
        appendLine("this.innerHTML = '';");
        appendLine("");
        appendLine("// Create template element for parsing");
        appendLine("const template = document.createElement('template');");
        appendLine("template.innerHTML = `");
        indentLevel++;
        
        // Generate HTML template
        generateTemplate(component.getTemplate());
        
        indentLevel--;
        appendLine("`;");
        appendLine("const frag = template.content.cloneNode(true);");
        appendLine("this.replaceWith(frag);");
        indentLevel--;
        appendLine("}");
        
        // Generate property setters/getters
        generateComponentProperties(component);
        // Also generate accessors for any used properties in template not explicitly declared
        generateAccessorsForUsedProperties();
        
        // Generate connectedCallback
        appendLine("connectedCallback() {");
        indentLevel++;
        appendLine("// Component connected to DOM");
        appendLine("this.render();");
        indentLevel--;
        appendLine("}");
        
        // Generate disconnectedCallback
        appendLine("disconnectedCallback() {");
        indentLevel++;
        appendLine("// Component disconnected from DOM");
        appendLine("// Clean up any event listeners or timers here");
        indentLevel--;
        appendLine("}");
        
        // Generate attributeChangedCallback for reactive updates
        appendLine("attributeChangedCallback(name, oldValue, newValue) {");
        indentLevel++;
        appendLine("if (oldValue !== newValue) {");
        indentLevel++;
        appendLine("this.render();");
        indentLevel--;
        appendLine("}");
        indentLevel--;
        appendLine("}");
        
        // Generate static observedAttributes
        appendLine("static get observedAttributes() {");
        indentLevel++;
        appendLine("return [");
        indentLevel++;
        // Add all property names as observed attributes
        for (String propName : properties.keySet()) {
            appendLine("'" + propName + "',");
        }
        indentLevel--;
        appendLine("];");
        indentLevel--;
        appendLine("}");
        
        indentLevel--;
        appendLine("}");
        
        // Register custom element
        appendLine("");
        appendLine("// Register custom element");
        appendLine("customElements.define('" + selector + "', " + className + ");");
    }



    private void generateHtmlNode(HtmlNode htmlNode) {
        switch (htmlNode.getType()) {
            case ELEMENT:
                generateHtmlElement(htmlNode);
                break;
            case SELF_CLOSING:
                generateSelfClosingElement(htmlNode);
                break;
            case TEXT:
                generateTextNode(htmlNode);
                break;
            case STYLE:
                generateStyleNode(htmlNode);
                break;
            case EMBEDDED_STATEMENTS:
                generateEmbeddedStatements(htmlNode);
                break;
        }
    }



    private void generateHtmlElement(HtmlNode element) {
        // Check for Angular structural directives
        boolean hasNgFor = false;
        boolean hasNgIf = false;
        String ngForValue = null;
        String ngIfValue = null;
        
        for (HtmlNode.HtmlAttribute attr : element.getAttributes()) {
            if ("*ngFor".equals(attr.getName())) {
                hasNgFor = true;
                ngForValue = attr.getValue();
            } else if ("*ngIf".equals(attr.getName())) {
                hasNgIf = true;
                ngIfValue = attr.getValue();
            }
        }
        
        if (hasNgFor) {
            generateNgForElement(element, ngForValue);
        } else if (hasNgIf) {
            generateNgIfElement(element, ngIfValue);
        } else {
            // Generate normal HTML element
            generateNormalHtmlElement(element);
        }
    }
    
    private void generateNormalHtmlElement(HtmlNode element) {
        // Start tag
        StringBuilder tag = new StringBuilder();
        tag.append("<").append(element.getTagName());
        
        // Add attributes
        generateHtmlAttributesForMain(element, tag);
        tag.append(">");
        
        appendLine(tag.toString());
        
        // Add children
        for (HtmlNode child : element.getChildren()) {
            generateHtmlNode(child);
        }
        
        // End tag
        appendLine("</" + element.getTagName() + ">");
    }
    
    private void generateNgForElement(HtmlNode element, String ngForValue) {
        // Parse ngFor value: "let item of items"
        String[] parts = ngForValue.split(" of ");
        if (parts.length == 2) {
            String variablePart = parts[0].trim();
            String collectionPart = parts[1].trim();
            
            // Extract variable name from "let item"
            String variableName = variablePart.replace("let ", "").trim();
            
            appendLine("// Generate elements for " + ngForValue);
            appendLine("if (Array.isArray(" + collectionPart + ")) {");
            appendLine("    " + collectionPart + ".forEach((" + variableName + ") => {");
            
            // Generate the element content
            appendLine("        const element = document.createElement('" + element.getTagName() + "');");
            
            // Add attributes (excluding Angular directives)
            for (HtmlNode.HtmlAttribute attr : element.getAttributes()) {
                if (!"*ngFor".equals(attr.getName()) && !"*ngIf".equals(attr.getName())) {
                    if ("[click]".equals(attr.getName())) {
                        // Transform [click] to onclick for standard HTML
                        appendLine("        element.setAttribute('onclick', '" + attr.getValue() + "');");
                    } else {
                        appendLine("        element.setAttribute('" + attr.getName() + "', '" + attr.getValue() + "');");
                    }
                }
            }
            
            // Add children
            for (HtmlNode child : element.getChildren()) {
                generateHtmlNode(child);
            }
            
            appendLine("        // Add element to parent or document");
            appendLine("    });");
            appendLine("}");
        } else {
            // Fallback for malformed ngFor
            appendLine("// Error: Invalid ngFor syntax: " + ngForValue);
            generateNormalHtmlElement(element);
        }
    }
    
    private void generateNgIfElement(HtmlNode element, String ngIfValue) {
        appendLine("// Generate element conditionally for " + ngIfValue);
        appendLine("if (" + ngIfValue + ") {");
        
        // Generate the element content
        appendLine("    const element = document.createElement('" + element.getTagName() + "');");
        
        // Add attributes (excluding Angular directives)
        for (HtmlNode.HtmlAttribute attr : element.getAttributes()) {
            if (!"*ngFor".equals(attr.getName()) && !"*ngIf".equals(attr.getName())) {
                if ("[click]".equals(attr.getName())) {
                    // Transform [click] to onclick for standard HTML
                    appendLine("        element.setAttribute('onclick', '" + attr.getValue() + "');");
                } else {
                    appendLine("        element.setAttribute('" + attr.getName() + "', '" + attr.getValue() + "');");
                }
            }
        }
        
        // Add children
        for (HtmlNode child : element.getChildren()) {
            generateHtmlNode(child);
        }
        
        appendLine("    // Add element to parent or document");
        appendLine("}");
    }

    private void generateSelfClosingElement(HtmlNode element) {
        // Check for Angular structural directives
        boolean hasNgFor = false;
        boolean hasNgIf = false;
        String ngForValue = null;
        String ngIfValue = null;
        
        for (HtmlNode.HtmlAttribute attr : element.getAttributes()) {
            if ("*ngFor".equals(attr.getName())) {
                hasNgFor = true;
                ngForValue = attr.getValue();
            } else if ("*ngIf".equals(attr.getName())) {
                hasNgIf = true;
                ngIfValue = attr.getValue();
            }
        }
        
        if (hasNgFor) {
            generateNgForSelfClosingElement(element, ngForValue);
        } else if (hasNgIf) {
            generateNgIfSelfClosingElement(element, ngIfValue);
        } else {
            // Generate normal self-closing element
            generateNormalSelfClosingElement(element);
        }
    }
    
    private void generateNormalSelfClosingElement(HtmlNode element) {
        StringBuilder tag = new StringBuilder();
        tag.append("<").append(element.getTagName());
        
        // Add attributes
        generateHtmlAttributesForMain(element, tag);
        tag.append(" />");
        
        appendLine(tag.toString());
    }
    
    private void generateNgForSelfClosingElement(HtmlNode element, String ngForValue) {
        // Parse ngFor value: "let item of items"
        String[] parts = ngForValue.split(" of ");
        if (parts.length == 2) {
            String variablePart = parts[0].trim();
            String collectionPart = parts[1].trim();
            
            // Extract variable name from "let item"
            String variableName = variablePart.replace("let ", "").trim();
            
            appendLine("// Generate self-closing elements for " + ngForValue);
            appendLine("if (Array.isArray(" + collectionPart + ")) {");
            appendLine("    " + collectionPart + ".forEach((" + variableName + ") => {");
            
            // Generate the element content
            appendLine("        const element = document.createElement('" + element.getTagName() + "');");
            
            // Add attributes (excluding Angular directives)
            for (HtmlNode.HtmlAttribute attr : element.getAttributes()) {
                if (!"*ngFor".equals(attr.getName()) && !"*ngIf".equals(attr.getName())) {
                    if ("[click]".equals(attr.getName())) {
                        // Transform [click] to onclick for standard HTML
                        appendLine("        element.setAttribute('onclick', '" + attr.getValue() + "');");
                    } else {
                        appendLine("        element.setAttribute('" + attr.getName() + "', '" + attr.getValue() + "');");
                    }
                }
            }
            
            appendLine("        // Add element to parent or document");
            appendLine("    });");
            appendLine("}");
        } else {
            // Fallback for malformed ngFor
            appendLine("// Error: Invalid ngFor syntax: " + ngForValue);
            generateNormalSelfClosingElement(element);
        }
    }
    
    private void generateNgIfSelfClosingElement(HtmlNode element, String ngIfValue) {
        appendLine("// Generate self-closing element conditionally for " + ngIfValue);
        appendLine("if (" + ngIfValue + ") {");
        
        // Generate the element content
        appendLine("    const element = document.createElement('" + element.getTagName() + "');");
        
        // Add attributes (excluding Angular directives)
        for (HtmlNode.HtmlAttribute attr : element.getAttributes()) {
            if (!"*ngFor".equals(attr.getName()) && !"*ngIf".equals(attr.getName())) {
                if ("[click]".equals(attr.getName())) {
                    // Transform [click] to onclick for standard HTML
                    appendLine("        element.setAttribute('onclick', '" + attr.getValue() + "');");
                } else {
                    appendLine("        element.setAttribute('" + attr.getName() + "', '" + attr.getValue() + "');");
                }
            }
        }
        
        appendLine("    // Add element to parent or document");
        appendLine("}");
    }

    private void generateTextNode(HtmlNode textNode) {
        String text = textNode.getTextContent();
        if (text != null && !text.trim().isEmpty()) {
            appendLine(transformInterpolationsForMainTemplate(text));
        }
    }

    private void generateEmbeddedStatements(HtmlNode node) {
        for (ASTNode stmt : node.getEmbeddedStatements()) {
            if (stmt instanceof ValueNode) {
                generateEmbeddedValue((ValueNode) stmt);
            } else if (stmt instanceof VariableAssignNode) {
                String name = ((VariableAssignNode) stmt).getIdentifier();
                if (name != null && !name.isEmpty()) {
                    usedProperties.add(name);
                    appendLine("${this." + name + "}");
                }
            } else if (stmt instanceof IdentifierNode) {
                String varName = ((IdentifierNode) stmt).getName();
                appendLine("${" + varName + "}");
                usedProperties.add(varName);
            } else if (stmt instanceof StringNode) {
                String content = ((StringNode) stmt).getValue();
                appendLine(transformInterpolationsForMainTemplate(content));
            } else if (stmt instanceof NumberNode) {
                String number = ((NumberNode) stmt).getValue();
                appendLine("${" + number + "}");
            } else if (stmt instanceof HtmlNode) {
                generateHtmlNode((HtmlNode) stmt);
            } else if (stmt instanceof TemplateLiteralNode) {
                generateTemplateLiteral((TemplateLiteralNode) stmt);
            } else if (stmt instanceof ComponentStatementNode) {
                // Optionally, generate component code or placeholder
                appendLine("<!-- Embedded component: " + ((ComponentStatementNode) stmt).getSelector() + " -->");
            }
        }
    }

    private void generateEmbeddedValue(ValueNode value) {
        if (value.getPrimaryValue() instanceof IdentifierNode) {
            String varName = ((IdentifierNode) value.getPrimaryValue()).getName();
            appendLine("${this." + varName + "}");
            // Don't add to usedProperties for nested templates - they're local variables
        } else if (value.getPrimaryValue() instanceof StringNode) {
            String content = ((StringNode) value.getPrimaryValue()).getValue();
            appendLine(transformInterpolationsForMainTemplate(content));
        } else if (value.getPrimaryValue() instanceof NumberNode) {
            String number = ((NumberNode) value.getPrimaryValue()).getValue();
            appendLine("${" + number + "}");
        } else if (value.getPrimaryValue() instanceof PropertyAccessValueNode) {
            // TODO: handle issue here
            String expr = generateExpressionForNested(value.getPrimaryValue(), true);
            appendLine("${" + expr + "}");
        } else if (value.getPrimaryValue() instanceof MethodCallValueNode) {
            String expr = generateExpressionForNested(value.getPrimaryValue());
            appendLine("${" + expr + "}");
        } else if (value.getPrimaryValue() instanceof ArrowFunctionValueNode) {
            String expr = generateExpressionForNested(value.getPrimaryValue());
            appendLine("${" + expr + "}");
        } else {
            appendLine("<!-- Embedded value not supported: " + value.getPrimaryValue().getClass().getSimpleName() + " -->");
        }
    }

    /**
     * Generate embedded values for the main component template
     * This method handles the distinction between component properties and local variables
     */
    private void generateEmbeddedValueForMainTemplate(ValueNode value) {
        if (value.getPrimaryValue() instanceof IdentifierNode) {
            String varName = ((IdentifierNode) value.getPrimaryValue()).getName();
            // In main component template, identifiers are component properties
            appendLine("${this." + varName + "}");
            usedProperties.add(varName);
        } else if (value.getPrimaryValue() instanceof StringNode) {
            String content = ((StringNode) value.getPrimaryValue()).getValue();
            appendLine(transformInterpolationsForMainTemplate(content));
        } else if (value.getPrimaryValue() instanceof NumberNode) {
            String number = ((NumberNode) value.getPrimaryValue()).getValue();
            appendLine("${" + number + "}");
        } else if (value.getPrimaryValue() instanceof PropertyAccessValueNode) {
            // For property access in main template, we need to check if it's a component property
            String expr = generateExpressionForMainTemplate(value.getPrimaryValue());
            appendLine("${" + expr + "}");
        } else if (value.getPrimaryValue() instanceof MethodCallValueNode) {
            // For method calls in main template, we need to check if the base is a component property
            MethodCallValueNode methodNode = (MethodCallValueNode) value.getPrimaryValue();
            String expr = generateMethodCallForMainTemplate(methodNode);
            appendLine("${" + expr + "}");
        } else if (value.getPrimaryValue() instanceof ArrowFunctionValueNode) {
            // For arrow functions in main template, we need to handle nested contexts
            String expr = generateArrowFunctionForMainTemplate((ArrowFunctionValueNode) value.getPrimaryValue());
            appendLine("${" + expr + "}");
        } else {
            appendLine("<!-- Embedded value not supported: " + value.getPrimaryValue().getClass().getSimpleName() + " -->");
        }
    }

    private void generateTemplateLiteral(TemplateLiteralNode template) {
        for (ASTNode part : template.getParts()) {
            if (part instanceof HtmlNode) {
                generateHtmlNodeForTemplate((HtmlNode) part, output, true);
            } else if (part instanceof StringNode) {
                // Handle string parts directly
                String content = ((StringNode) part).getValue();
                appendLine(content);
            } else if (part instanceof ValueNode) {
                // For the main component template, we need to distinguish between:
                // 1. Component properties (should get 'this.' prefix)
                // 2. Local variables in nested contexts (should NOT get 'this.' prefix)
                ValueNode valueNode = (ValueNode) part;
                // Use generateExpressionForMainTemplate for main template to ensure proper 'this.' prefix
                String expr = generateExpressionForMainTemplate(valueNode);
                appendLine("${" + expr + "}");
            } else if (part instanceof IdentifierNode) {
                // Handle variable references directly - these are local variables in nested templates
                String varName = ((IdentifierNode) part).getName();
                appendLine("${" + varName + "}");
                // Don't add to usedProperties for nested templates - they're local variables
            } else {
                appendLine("<!-- Template part not supported: " + part.getClass().getSimpleName() + " -->");
            }
        }
    }

    private void generateComponentProperties(ComponentStatementNode component) {
        Map<String, ValueNode> properties = component.getProperties();
        if (properties.isEmpty()) {
            return;
        }
        
        appendLine("");
        appendLine("// Component properties");
        
        for (Map.Entry<String, ValueNode> prop : properties.entrySet()) {
            String propName = prop.getKey();
            ValueNode propValue = prop.getValue();
            declaredProperties.add(propName);
            
            // Generate getter
            appendLine("get " + propName + "() {");
            indentLevel++;
            appendLine("return this.getAttribute('" + propName + "') || this._" + propName + ";");
            indentLevel--;
            appendLine("}");
            
            // Generate setter
            appendLine("set " + propName + "(value) {");
            indentLevel++;
            appendLine("if (value === null || value === undefined) {");
            indentLevel++;
            appendLine("this.removeAttribute('" + propName + "');");
            indentLevel--;
            appendLine("} else {");
            indentLevel++;
            appendLine("this.setAttribute('" + propName + "', value);");
            indentLevel--;
            appendLine("}");
            appendLine("this.render();");
            indentLevel--;
            appendLine("}");
        }
    }

    private void generateAccessorsForUsedProperties() {
        // Determine missing properties (used in template but not declared in annotation)
        Set<String> missing = new HashSet<>(usedProperties);
        missing.removeAll(declaredProperties);
        if (missing.isEmpty()) {
            return;
        }
        appendLine("");
        appendLine("// Inferred properties from template usage");
        for (String propName : missing) {
            // getter
            appendLine("get " + propName + "() {");
            indentLevel++;
            appendLine("return this.getAttribute('" + propName + "');");
            indentLevel--;
            appendLine("}");
            // setter
            appendLine("set " + propName + "(value) {");
            indentLevel++;
            appendLine("if (value === null || value === undefined) {");
            indentLevel++;
            appendLine("this.removeAttribute('" + propName + "');");
            indentLevel--;
            appendLine("} else {");
            indentLevel++;
            appendLine("this.setAttribute('" + propName + "', value);");
            indentLevel--;
            appendLine("}");
            appendLine("this.render();");
            indentLevel--;
            appendLine("}");
        }
    }

    private String transformInterpolations(String text) {
        if (text == null || text.isEmpty()) return "";
        // Replace Angular-like {{ expr }} with JS template ${expr} (without 'this.' prefix for nested templates)
        Pattern pattern = Pattern.compile("\\{\\{\\s*(.+?)\\s*\\}}");
        Matcher matcher = pattern.matcher(text);
        StringBuffer sb = new StringBuffer();
        while (matcher.find()) {
            String expr = matcher.group(1);
            // Don't collect identifiers for nested templates - they should be local variables
            String replacement = "${" + expr + "}";
            // Escape $ for appendReplacement
            replacement = replacement.replace("$", "\\$");
            matcher.appendReplacement(sb, replacement);
        }
        matcher.appendTail(sb);
        return sb.toString();
    }
    
    /**
     * Transform Angular-like interpolations {{...}} to JavaScript template literals ${this...} for main component template
     * This is used for the main component template, not nested templates
     */
    private String transformInterpolationsForMainTemplate(String content) {
        // Replace {{...}} with ${this...} for main component template
        if (content == null) return "";
        Pattern pattern = Pattern.compile("\\{\\{\\s*(.+?)\\s*\\}\\}");
        Matcher matcher = pattern.matcher(content);
        StringBuffer result = new StringBuffer();
        
        while (matcher.find()) {
            String expression = matcher.group(1).trim();
            // Add 'this.' prefix to make it a property access
            if (!expression.startsWith("this.")) {
                expression = "this." + expression;
            }
            matcher.appendReplacement(result, "\\${" + expression + "}");
        }
        matcher.appendTail(result);
        return result.toString();
    }

    private void collectIdentifiers(String expr) {
        if (expr == null) return;
        Pattern id = Pattern.compile("[A-Za-z_][A-Za-z0-9_]*");
        Matcher m = id.matcher(expr);
        while (m.find()) {
            String name = m.group();
            if (!"this".equals(name)) {
                usedProperties.add(name);
            }
        }
    }

    private String selectorToClassName(String selector) {
        if (selector == null || selector.isEmpty()) {
            return "CustomComponent";
        }
        
        // Convert kebab-case to PascalCase
        String[] parts = selector.split("-");
        StringBuilder className = new StringBuilder();
        
        for (String part : parts) {
            if (!part.isEmpty()) {
                className.append(Character.toUpperCase(part.charAt(0)));
                if (part.length() > 1) {
                    className.append(part.substring(1));
                }
            }
        }
        
        return className.toString() + "Component";
    }

    private void appendLine(String line) {
        for (int i = 0; i < indentLevel; i++) {
            output.append(INDENT);
        }
        output.append(line).append("\n");
    }

    /**
     * Generate complete HTML page with component
     * Writes the generated HTML to output/index.html and returns the HTML as a string.
     */
    public String generateHtmlPage(ComponentStatementNode component) {
        return generateHtmlPage(component, null);
    }
    
    /**
     * Generate complete HTML page with component and root styles
     * Writes the generated HTML to output/index.html and returns the HTML as a string.
     */
    public String generateHtmlPage(ComponentStatementNode component, String rootStyles) {
        output.setLength(0);
        
        String selector = component.getSelector();
        String className = selectorToClassName(selector);
        
        appendLine("<!DOCTYPE html>");
        appendLine("<html lang=\"en\">");
        appendLine("<head>");
        indentLevel++;
        appendLine("<meta charset=\"UTF-8\">");
        appendLine("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">");
        appendLine("<title>Component Demo</title>");
        
        // Add root styles if provided
        if (rootStyles != null && !rootStyles.trim().isEmpty()) {
            appendLine("<style>");
            appendLine(rootStyles);
            appendLine("</style>");
        }
        
        appendLine("<script>");
        indentLevel++;
        
        // Generate component JavaScript
        generateComponentClass(component);
        
        indentLevel--;
        appendLine("</script>");
        indentLevel--;
        appendLine("</head>");
        appendLine("<body>");
        indentLevel++;
        appendLine("<" + selector + "></" + selector + ">");
        indentLevel--;
        appendLine("</body>");
        appendLine("</html>");
        
        // Write to output/index.html
        String html = output.toString();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("output/index.html"))) {
            writer.write(html);
        } catch (IOException e) {
            System.err.println("Failed to write output/index.html: " + e.getMessage());
        }
        
        return html;
    }

    /**
     * Generate default value for a component property
     * Handles all node types for default value generation.
     */
    private String generatePropertyDefaultValue(ValueNode valueNode) {
        if (valueNode == null) return "null";

        // Special handling: if the ValueNode itself is an ArrowFunctionValueNode, handle as function
        if (valueNode.getPrimaryValue() instanceof ArrowFunctionValueNode) {
            ArrowFunctionValueNode arrowNode = (ArrowFunctionValueNode) valueNode.getPrimaryValue();
            // Generate the arrow function as a string (not quoted, so it's a real function)
            return generateExpression(arrowNode);
        }

        Object primary = valueNode.getPrimaryValue();

        if (primary instanceof StringNode) {
            StringNode stringNode = (StringNode) primary;
            return "\"" + stringNode.getValue() + "\"";
        } else if (primary instanceof NumberNode) {
            NumberNode numberNode = (NumberNode) primary;
            return numberNode.getValue();
        } else if (primary instanceof BooleanNode) {
            BooleanNode booleanNode = (BooleanNode) primary;
            return String.valueOf(booleanNode.getValue());
        } else if (primary instanceof IdentifierNode) {
            IdentifierNode identifierNode = (IdentifierNode) primary;
            // For default value, treat as string literal
            return "\"" + identifierNode.getName() + "\"";
        } else if (primary instanceof ArrayNode) {
            ArrayNode arrayNode = (ArrayNode) primary;
            StringBuilder arr = new StringBuilder();
            arr.append("[");
            for (int i = 0; i < arrayNode.getElements().size(); i++) {
                if (i > 0) arr.append(", ");
                arr.append(generatePropertyDefaultValue((ValueNode) arrayNode.getElements().get(i)));
            }
            arr.append("]");
            return arr.toString();
        } else if (primary instanceof ObjectNode) {
            ObjectNode objectNode = (ObjectNode) primary;
            StringBuilder obj = new StringBuilder();
            obj.append("{");
            for (int i = 0; i < objectNode.getProperties().size(); i++) {
                if (i > 0) obj.append(", ");
                PropertyNode prop = objectNode.getProperties().get(i);
                obj.append("\"").append(prop.getKey()).append("\": ");
                obj.append(generatePropertyDefaultValue(prop.getValue()));
            }
            obj.append("}");
            return obj.toString();
        } else if (primary instanceof PropertyAccessValueNode) {
            // For property access, just return as string (could be improved)
            PropertyAccessValueNode propNode = (PropertyAccessValueNode) primary;
            return "\"" + generateExpression(propNode) + "\"";
        } else if (primary instanceof MethodCallValueNode) {
            // For method call, just return as string (could be improved)
            MethodCallValueNode methodNode = (MethodCallValueNode) primary;
            return "\"" + generateExpression(methodNode) + "\"";
        } else if (primary instanceof ArrowFunctionValueNode) {
            // For arrow function, just return as function (not quoted)
            ArrowFunctionValueNode arrowNode = (ArrowFunctionValueNode) primary;
            return generateExpression(arrowNode);
        } else if (primary instanceof ParenthesizedValueNode) {
            ParenthesizedValueNode parenNode = (ParenthesizedValueNode) primary;
            return generatePropertyDefaultValue(parenNode.getInnerValue());
        } else if (primary instanceof TemplateLiteralNode) {
            TemplateLiteralNode templateNode = (TemplateLiteralNode) primary;
            StringBuilder template = new StringBuilder();
            template.append("`");
            for (ASTNode part : templateNode.getParts()) {
                if (part instanceof StringNode) {
                    template.append(((StringNode) part).getValue());
                } else if (part instanceof ValueNode) {
                    template.append("${").append(generateExpressionForNested(part)).append("}");
                } else if (part instanceof IdentifierNode) {
                    template.append("${").append(((IdentifierNode) part).getName()).append("}");
                } else {
                    template.append("${/* unsupported: ").append(part.getClass().getSimpleName()).append(" */}");
                }
            }
            template.append("`");
            return template.toString();
        } else if (primary instanceof IncrementNode) {
            IncrementNode incNode = (IncrementNode) primary;
            String operand = incNode.getOperand();
            return incNode.isPrefix() ? "++" + operand : operand + "++";
        } else if (primary instanceof DecrementNode) {
            DecrementNode decNode = (DecrementNode) primary;
            String operand = decNode.getOperand();
            return decNode.isPrefix() ? "--" + operand : operand + "--";
        } else if (primary instanceof IncDecNode) {
            IncDecNode incDecNode = (IncDecNode) primary;
            String operand = incDecNode.getOperand();
            return incDecNode.isIncrement() ? 
                (incDecNode.isPrefix() ? "++" + operand : operand + "++") :
                (incDecNode.isPrefix() ? "--" + operand : operand + "--");
        } else if (primary instanceof OperatorExpressionNode) {
            OperatorExpressionNode opNode = (OperatorExpressionNode) primary;
            return generateExpression(opNode);
        } else if (primary instanceof NestedTemplateInterpolationNode) {
            NestedTemplateInterpolationNode nestedNode = (NestedTemplateInterpolationNode) primary;
            return generateExpression(nestedNode);
        } else if (primary instanceof TypeDeclarationValueNode) {
            TypeDeclarationValueNode typeDeclNode = (TypeDeclarationValueNode) primary;
            return generateExpression(typeDeclNode);
        } else if (primary instanceof TypeDefineNode) {
            TypeDefineNode typeDefNode = (TypeDefineNode) primary;
            return generateExpression(typeDefNode);
        } else if (primary instanceof TypeNode) {
            TypeNode typeNode = (TypeNode) primary;
            return generateExpression(typeNode);
        } else if (primary instanceof VariableDeclarationNode) {
            VariableDeclarationNode varDeclNode = (VariableDeclarationNode) primary;
            return generateExpression(varDeclNode);
        } else if (primary instanceof VariableAssignNode) {
            VariableAssignNode varAssignNode = (VariableAssignNode) primary;
            return generateExpression(varAssignNode);
        } else if (primary instanceof FunctionDeclarationNode) {
            FunctionDeclarationNode funcDeclNode = (FunctionDeclarationNode) primary;
            return generateExpression(funcDeclNode);
        } else if (primary instanceof FunctionCallNode) {
            FunctionCallNode funcCallNode = (FunctionCallNode) primary;
            return generateExpression(funcCallNode);
        } else if (primary instanceof ReturnNode) {
            ReturnNode returnNode = (ReturnNode) primary;
            return generateExpression(returnNode);
        } else if (primary instanceof IfStatementNode) {
            IfStatementNode ifNode = (IfStatementNode) primary;
            return generateExpression(ifNode);
        } else if (primary instanceof IfBodyNode) {
            IfBodyNode ifBodyNode = (IfBodyNode) primary;
            return generateExpression(ifBodyNode);
        } else if (primary instanceof ForStatementNode) {
            ForStatementNode forNode = (ForStatementNode) primary;
            return generateExpression(forNode);
        } else if (primary instanceof WhileStatementNode) {
            WhileStatementNode whileNode = (WhileStatementNode) primary;
            return generateExpression(whileNode);
        } else if (primary instanceof DoWhileStatementNode) {
            DoWhileStatementNode doWhileNode = (DoWhileStatementNode) primary;
            return generateExpression(doWhileNode);
        } else if (primary instanceof ForInStatementNode) {
            ForInStatementNode forInNode = (ForInStatementNode) primary;
            return generateExpression(forInNode);
        } else if (primary instanceof BlockNode) {
            BlockNode blockNode = (BlockNode) primary;
            return generateExpression(blockNode);
        } else if (primary instanceof FunctionBodyNode) {
            FunctionBodyNode functionBodyNode = (FunctionBodyNode) primary;
            return generateExpression(functionBodyNode);
        }

        return "null";
    }

    /**
     * Generate only the JavaScript component code
     */
    public String generateComponentScript(ComponentStatementNode component) {
        output.setLength(0);
        generateComponentClass(component);
        return output.toString();
    }

    /**
     * Generate property access expressions like 'products.map'
     */
    private void generatePropertyAccess(PropertyAccessValueNode node) {
        String leftExpr = generateExpression(node.getLeft());
        String rightExpr = generateExpression(node.getRight());
        appendLine(leftExpr + "." + rightExpr);
    }

    /**
     * Generate method calls like 'products.map(...)'
     */
    private void generateMethodCall(MethodCallValueNode node) {
        String leftExpr = generateExpression(node.getLeft());
        StringBuilder methodCall = new StringBuilder();
        methodCall.append(leftExpr).append("(");
        
        for (int i = 0; i < node.getArgs().size(); i++) {
            if (i > 0) methodCall.append(", ");
            methodCall.append(generateExpression(node.getArgs().get(i)));
        }
        
        methodCall.append(")");
        appendLine(methodCall.toString());
    }

    /**
     * Generate arrow functions like 'product => ...'
     */
    private void generateArrowFunction(ArrowFunctionValueNode node) {
        StringBuilder arrowFunc = new StringBuilder();
        arrowFunc.append("(");
        
        for (int i = 0; i < node.getParams().size(); i++) {
            if (i > 0) arrowFunc.append(", ");
            arrowFunc.append(node.getParams().get(i));
        }
        
        arrowFunc.append(") => ");
        // Handle different body types
        if (node.getBody() == null) {
            // Handle empty arrow function
            arrowFunc.append("undefined");
        } else if (node.getBody() instanceof FunctionBodyNode) {
            FunctionBodyNode functionBody = (FunctionBodyNode) node.getBody();
            if (functionBody.arrowHasStatements()) {
                // Statement style: (params) => { statements }
                arrowFunc.append("{");
                for (ASTNode stmt : functionBody.getArrowStatements()) {
                    arrowFunc.append("\n  ").append(generateExpression(stmt));
                }
                arrowFunc.append("\n}");
            } else if (functionBody.getArrowValue() != null) {
                // Expression style: (params) => expression
                arrowFunc.append(generateExpression(functionBody.getArrowValue()));
            }
        } else {
            // Regular expression body
            arrowFunc.append(generateExpression(node.getBody()));
        }
        
        appendLine(arrowFunc.toString());
    }

    /**
     * Generate expressions for complex AST nodes
     */
    private String generateExpression(ASTNode node) {
        if (node instanceof IdentifierNode) {
            String varName = ((IdentifierNode) node).getName();
            usedProperties.add(varName);
            return "this." + varName;
        } else if (node instanceof ValueNode) {
            // ValueNode can wrap another node (e.g., IdentifierNode, NumberNode, etc.)
            ValueNode valueNode = (ValueNode) node;
            if (valueNode.getPrimaryValue() != null) {
                return generateExpression(valueNode.getPrimaryValue());
            } else {
                return "undefined";
            }
        } else if (node instanceof StringNode) {
            return "\"" + ((StringNode) node).getValue() + "\"";
        } else if (node instanceof NumberNode) {
            return ((NumberNode) node).getValue();
        } else if (node instanceof BooleanNode) {
            return String.valueOf(((BooleanNode) node).getValue());
        } else if (node instanceof PropertyAccessValueNode) {
            PropertyAccessValueNode propNode = (PropertyAccessValueNode) node;
            String left = generateExpression(propNode.getLeft());
            String right = generateExpression(propNode.getRight());
            return left + "." + right;
        } else if (node instanceof PropertyAccessNode) {
            PropertyAccessNode propNode = (PropertyAccessNode) node;
            String object = generateExpression(propNode.getObject());
            String property = generateExpression(propNode.getProperty());
            return object + "." + property;
        } else if (node instanceof MethodCallValueNode) {
            MethodCallValueNode methodNode = (MethodCallValueNode) node;
            String left = generateExpression(methodNode.getLeft());
            StringBuilder methodCall = new StringBuilder();
            methodCall.append(left).append("(");
            
            for (int i = 0; i < methodNode.getArgs().size(); i++) {
                if (i > 0) methodCall.append(", ");
                methodCall.append(generateExpression(methodNode.getArgs().get(i)));
            }
            
            methodCall.append(")");
            return methodCall.toString();
        } else if (node instanceof ArrowFunctionValueNode) {
            ArrowFunctionValueNode arrowNode = (ArrowFunctionValueNode) node;
            StringBuilder arrowFunc = new StringBuilder();
            arrowFunc.append("(");
            
            for (int i = 0; i < arrowNode.getParams().size(); i++) {
                if (i > 0) arrowFunc.append(", ");
                arrowFunc.append(arrowNode.getParams().get(i));
            }
            
            arrowFunc.append(") => ");
            // Handle different body types
            if (arrowNode.getBody() == null) {
                // Handle empty arrow function
                arrowFunc.append("undefined");
            } else if (arrowNode.getBody() instanceof FunctionBodyNode) {
                FunctionBodyNode functionBody = (FunctionBodyNode) arrowNode.getBody();
                if (functionBody.arrowHasStatements()) {
                    // Statement style: (params) => { statements }
                    arrowFunc.append("{");
                    for (ASTNode stmt : functionBody.getArrowStatements()) {
                        arrowFunc.append("\n  ").append(generateExpression(stmt));
                    }
                    arrowFunc.append("\n}");
                } else if (functionBody.getArrowValue() != null) {
                    // Expression style: (params) => expression
                    arrowFunc.append(generateExpression(functionBody.getArrowValue()));
                }
            } else {
                // Regular expression body
                arrowFunc.append(generateExpression(arrowNode.getBody()));
            }
            
            return arrowFunc.toString();
        } else if (node instanceof FunctionCallNode) {
            FunctionCallNode functionNode = (FunctionCallNode) node;
            StringBuilder functionCall = new StringBuilder();
            functionCall.append(functionNode.getFunctionName()).append("(");
            
            for (int i = 0; i < functionNode.getArguments().size(); i++) {
                if (i > 0) functionCall.append(", ");
                functionCall.append(generateExpression(functionNode.getArguments().get(i)));
            }
            
            functionCall.append(")");
            return functionCall.toString();
        } else if (node instanceof FunctionBodyNode) {
            FunctionBodyNode functionBody = (FunctionBodyNode) node;
            if (functionBody.isBlockStyle()) {
                // Handle block-style function body
                StringBuilder blockBody = new StringBuilder();
                blockBody.append("{");
                for (ASTNode stmt : functionBody.getStatements()) {
                    blockBody.append("\n").append(generateExpression(stmt));
                }
                blockBody.append("}");
                return blockBody.toString();
            } else {
                // Handle arrow function body
                StringBuilder arrowBody = new StringBuilder();
                arrowBody.append("(").append(String.join(", ", functionBody.getParams())).append(") => ");
                if (functionBody.arrowHasStatements()) {
                    // Statement style: (params) => { statements }
                    arrowBody.append("{");
                    for (ASTNode stmt : functionBody.getArrowStatements()) {
                        arrowBody.append("\n").append(generateExpression(stmt));
                    }
                    arrowBody.append("\n}");
                } else if (functionBody.getArrowValue() != null) {
                    // Expression style: (params) => expression
                    arrowBody.append(generateExpression(functionBody.getArrowValue()));
                }
                return arrowBody.toString();
            }
        } else if (node instanceof TemplateLiteralNode) {
            // Handle nested template literals
            StringBuilder nestedTemplate = new StringBuilder();
            nestedTemplate.append("`");
            
            for (ASTNode part : ((TemplateLiteralNode) node).getParts()) {
                if (part instanceof StringNode) {
                    // Transform interpolations in string content (e.g., {{ product.name }} -> ${this.product.name})
                    String content = ((StringNode) part).getValue();
                    nestedTemplate.append(transformInterpolationsForMainTemplate(content));
                } else if (part instanceof IdentifierNode) {
                    String varName = ((IdentifierNode) part).getName();
                    // Don't add to usedProperties for nested templates - they're local variables
                    nestedTemplate.append("${").append(varName).append("}");
                } else if (part instanceof HtmlNode) {
                    // For HTML nodes in nested templates, generate the HTML content
                    generateHtmlNodeForTemplate((HtmlNode) part, nestedTemplate);
                } else if (part instanceof ValueNode) {
                    // Handle interpolated values in nested templates
                    nestedTemplate.append("${");
                    nestedTemplate.append(generateExpression(part));
                    nestedTemplate.append("}");
                }
            }
            
            nestedTemplate.append("`");
            return nestedTemplate.toString();
        } else if (node instanceof ArrayNode) {
            ArrayNode arrayNode = (ArrayNode) node;
            StringBuilder array = new StringBuilder();
            array.append("[");
            for (int i = 0; i < arrayNode.getElements().size(); i++) {
                if (i > 0) array.append(", ");
                array.append(generateExpression(arrayNode.getElements().get(i)));
            }
            array.append("]");
            return array.toString();
        } else if (node instanceof ArrayAccessNode) {
            ArrayAccessNode arrayAccessNode = (ArrayAccessNode) node;
            String arrayName = arrayAccessNode.getArray();
            String index = generateExpression(arrayAccessNode.getIndex());
            return arrayName + "[" + index + "]";
        } else if (node instanceof ObjectNode) {
            ObjectNode objectNode = (ObjectNode) node;
            StringBuilder object = new StringBuilder();
            object.append("{");
            for (int i = 0; i < objectNode.getProperties().size(); i++) {
                if (i > 0) object.append(", ");
                PropertyNode prop = objectNode.getProperties().get(i);
                object.append(prop.getKey()).append(": ").append(generateExpression(prop.getValue()));
            }
            object.append("}");
            return object.toString();
        } else if (node instanceof ParenthesizedValueNode) {
            ParenthesizedValueNode parenNode = (ParenthesizedValueNode) node;
            return "(" + generateExpression(parenNode.getInnerValue()) + ")";
        } else if (node instanceof IncrementNode) {
            IncrementNode incNode = (IncrementNode) node;
            String operand = incNode.getOperand();
            return incNode.isPrefix() ? "++" + operand : operand + "++";
        } else if (node instanceof DecrementNode) {
            DecrementNode decNode = (DecrementNode) node;
            String operand = decNode.getOperand();
            return decNode.isPrefix() ? "--" + operand : operand + "--";
        } else if (node instanceof IncDecNode) {
            IncDecNode incDecNode = (IncDecNode) node;
            String operand = incDecNode.getOperand();
            return incDecNode.isIncrement() ? 
                (incDecNode.isPrefix() ? "++" + operand : operand + "++") :
                (incDecNode.isPrefix() ? "--" + operand : operand + "--");
        } else if (node instanceof OperatorExpressionNode) {
            OperatorExpressionNode opNode = (OperatorExpressionNode) node;
            String left = generateExpression(opNode.getLeft());
            String right = generateExpression(opNode.getRight());
            return left + " " + opNode.getOperator() + " " + right;
        } else if (node instanceof NestedTemplateInterpolationNode) {
            NestedTemplateInterpolationNode nestedNode = (NestedTemplateInterpolationNode) node;
            StringBuilder nested = new StringBuilder();
            nested.append("`");
            for (ASTNode part : nestedNode.getParts()) {
                if (part instanceof StringNode) {
                    nested.append(((StringNode) part).getValue());
                } else if (part instanceof ValueNode) {
                    nested.append("${").append(generateExpression(part)).append("}");
                } else {
                    nested.append(generateExpression(part));
                }
            }
            nested.append("`");
            return nested.toString();
        } else if (node instanceof TypeDeclarationValueNode) {
            TypeDeclarationValueNode typeNode = (TypeDeclarationValueNode) node;
            return generateExpression(typeNode.getValue());
        } else if (node instanceof TypeDefineNode) {
            TypeDefineNode typeDefineNode = (TypeDefineNode) node;
            return generateExpression(typeDefineNode);
        } else if (node instanceof TypeNode) {
            TypeNode typeNode = (TypeNode) node;
            return generateExpression(typeNode);
        } else if (node instanceof VariableDeclarationNode) {
            VariableDeclarationNode varDeclNode = (VariableDeclarationNode) node;
            return generateExpression(varDeclNode);
        } else if (node instanceof VariableAssignNode) {
            VariableAssignNode varAssignNode = (VariableAssignNode) node;
            return generateExpression(varAssignNode);
        } else if (node instanceof FunctionDeclarationNode) {
            FunctionDeclarationNode funcDeclNode = (FunctionDeclarationNode) node;
            return generateExpression(funcDeclNode);
        } else if (node instanceof FunctionCallNode) {
            FunctionCallNode funcCallNode = (FunctionCallNode) node;
            return generateExpression(funcCallNode);
        } else if (node instanceof ReturnNode) {
            ReturnNode returnNode = (ReturnNode) node;
            return generateExpression(returnNode);
        } else if (node instanceof IfStatementNode) {
            IfStatementNode ifNode = (IfStatementNode) node;
            return generateExpression(ifNode);
        } else if (node instanceof IfBodyNode) {
            IfBodyNode ifBodyNode = (IfBodyNode) node;
            return generateExpression(ifBodyNode);
        } else if (node instanceof ForStatementNode) {
            ForStatementNode forNode = (ForStatementNode) node;
            return generateExpression(forNode);
        } else if (node instanceof WhileStatementNode) {
            WhileStatementNode whileNode = (WhileStatementNode) node;
            return generateExpression(whileNode);
        } else if (node instanceof DoWhileStatementNode) {
            DoWhileStatementNode doWhileNode = (DoWhileStatementNode) node;
            return generateExpression(doWhileNode);
        } else if (node instanceof ForInStatementNode) {
            ForInStatementNode forInNode = (ForInStatementNode) node;
            return generateExpression(forInNode);
        } else if (node instanceof BlockNode) {
        }

        return "/* Unsupported expression: " + node.getClass().getSimpleName() + " */";
    }
    
    /**
     * Generate expressions for the main component template (with 'this.' prefix for component properties)
     */
    private String generateExpressionForMainTemplate(ASTNode node) {
        if (node instanceof ValueNode) {
            ValueNode valueNode = (ValueNode) node;
            String expression = generateExpressionForMainTemplate(valueNode.getPrimaryValue());
            
            // Handle modifiers like ! (negation)
            if (valueNode.getModifier() != null) {
                if ("!".equals(valueNode.getModifier())) {
                    expression = "!" + expression;
                }
                // Add other modifiers here if needed (e.g., "?" for optional chaining)
            }
            
            return expression;
        } else if (node instanceof IdentifierNode) {
            String varName = ((IdentifierNode) node).getName();
            // In main component template, identifiers are component properties
            usedProperties.add(varName);
            return "this." + varName;
        } else if (node instanceof StringNode) {
            return "\"" + ((StringNode) node).getValue() + "\"";
        } else if (node instanceof NumberNode) {
            return ((NumberNode) node).getValue();
        } else if (node instanceof BooleanNode) {
            return String.valueOf(((BooleanNode) node).getValue());
        } else if (node instanceof PropertyAccessValueNode) {
            PropertyAccessValueNode propNode = (PropertyAccessValueNode) node;
            String left = generateExpressionForMainTemplate(propNode.getLeft());
            String right = generateExpressionForMainTemplate(propNode.getRight());
            return left + "." + right;
        } else if (node instanceof PropertyAccessNode) {
            PropertyAccessNode propNode = (PropertyAccessNode) node;
            String object = generateExpressionForMainTemplate(propNode.getObject());
            String property = generateExpressionForMainTemplate(propNode.getProperty());
            return object + "." + property;
        } else if (node instanceof MethodCallValueNode) {
            MethodCallValueNode methodNode = (MethodCallValueNode) node;
            String left = generateExpressionForMainTemplate(methodNode.getLeft());
            StringBuilder methodCall = new StringBuilder();
            methodCall.append(left).append("(");
            
            for (int i = 0; i < methodNode.getArgs().size(); i++) {
                if (i > 0) methodCall.append(", ");
                methodCall.append(generateExpressionForMainTemplate(methodNode.getArgs().get(i)));
            }
            
            methodCall.append(")");
            return methodCall.toString();
        } else if (node instanceof ArrowFunctionValueNode) {
            ArrowFunctionValueNode arrowNode = (ArrowFunctionValueNode) node;
            StringBuilder arrowFunc = new StringBuilder();
            arrowFunc.append("(");
            
            for (int i = 0; i < arrowNode.getParams().size(); i++) {
                if (i > 0) arrowFunc.append(", ");
                arrowFunc.append(arrowNode.getParams().get(i));
            }
            
            arrowFunc.append(") => ");
            
            // Handle different body types
            if (arrowNode.getBody() == null) {
                // Handle empty arrow function
                arrowFunc.append("undefined");
            } else if (arrowNode.getBody() instanceof FunctionBodyNode) {
                FunctionBodyNode functionBody = (FunctionBodyNode) arrowNode.getBody();
                if (functionBody.arrowHasStatements()) {
                    // Statement style: (params) => { statements }
                    arrowFunc.append("{");
                    for (ASTNode stmt : functionBody.getArrowStatements()) {
                        arrowFunc.append("\n  ").append(generateExpressionForNested(stmt, false));
                    }
                    arrowFunc.append("\n}");
                } else if (functionBody.getArrowValue() != null) {
                    // Expression style: (params) => expression
                    arrowFunc.append(generateExpressionForNested(functionBody.getArrowValue(), false));
                }
            } else {
                // Regular expression body
                arrowFunc.append(generateExpressionForNested(arrowNode.getBody(), false));
            }
            
            return arrowFunc.toString();
        } else if (node instanceof FunctionCallNode) {
            FunctionCallNode functionNode = (FunctionCallNode) node;
            StringBuilder functionCall = new StringBuilder();
            functionCall.append(functionNode.getFunctionName()).append("(");
            
            for (int i = 0; i < functionNode.getArguments().size(); i++) {
                if (i > 0) functionCall.append(", ");
                functionCall.append(generateExpressionForMainTemplate(functionNode.getArguments().get(i)));
            }
            
            functionCall.append(")");
            return functionCall.toString();
        } else if (node instanceof FunctionBodyNode) {
            FunctionBodyNode functionBody = (FunctionBodyNode) node;
            if (functionBody.isBlockStyle()) {
                // Handle block-style function body
                StringBuilder blockBody = new StringBuilder();
                blockBody.append("{");
                for (ASTNode stmt : functionBody.getStatements()) {
                    blockBody.append("\n").append(generateExpressionForMainTemplate(stmt));
                }
                blockBody.append("}");
                return blockBody.toString();
            } else {
                // Handle arrow function body
                StringBuilder arrowBody = new StringBuilder();
                arrowBody.append("(").append(String.join(", ", functionBody.getParams())).append(") => ");
                if (functionBody.arrowHasStatements()) {
                    // Statement style: (params) => { statements }
                    arrowBody.append("{");
                    for (ASTNode stmt : functionBody.getArrowStatements()) {
                        arrowBody.append("\n").append(generateExpressionForMainTemplate(stmt));
                    }
                    arrowBody.append("}");
                } else if (functionBody.getArrowValue() != null) {
                    // Expression style: (params) => expression
                    arrowBody.append(generateExpressionForNested(functionBody.getArrowValue(), false)); // Use nested for arrow function body
                }
                return arrowBody.toString();
            }
        } else if (node instanceof TemplateLiteralNode) {
            // Handle nested template literals
            StringBuilder nestedTemplate = new StringBuilder();
            nestedTemplate.append("`");
            
            for (ASTNode part : ((TemplateLiteralNode) node).getParts()) {
                if (part instanceof StringNode) {
                    // Transform interpolations in string content (e.g., {{ product.name }} -> ${this.product.name})
                    String content = ((StringNode) part).getValue();
                    nestedTemplate.append(transformInterpolationsForMainTemplate(content));
                } else if (part instanceof IdentifierNode) {
                    String varName = ((IdentifierNode) part).getName();
                    // Don't add to usedProperties for nested templates - they're local variables
                    nestedTemplate.append("${").append(varName).append("}");
                } else if (part instanceof HtmlNode) {
                    // For HTML nodes in nested templates, generate the HTML content
                    generateHtmlNodeForTemplate((HtmlNode) part, nestedTemplate);
                } else if (part instanceof ValueNode) {
                    // Handle interpolated values in nested templates
                    nestedTemplate.append("${");
                    nestedTemplate.append(generateExpressionForNested(part, false));
                    nestedTemplate.append("}");
                }
            }
            
            nestedTemplate.append("`");
            return nestedTemplate.toString();
        } else if (node instanceof ArrayNode) {
            ArrayNode arrayNode = (ArrayNode) node;
            StringBuilder array = new StringBuilder();
            array.append("[");
            for (int i = 0; i < arrayNode.getElements().size(); i++) {
                if (i > 0) array.append(", ");
                array.append(generateExpressionForMainTemplate(arrayNode.getElements().get(i)));
            }
            array.append("]");
            return array.toString();
        } else if (node instanceof ArrayAccessNode) {
            ArrayAccessNode arrayAccessNode = (ArrayAccessNode) node;
            String arrayName = arrayAccessNode.getArray();
            String index = generateExpressionForMainTemplate(arrayAccessNode.getIndex());
            return arrayName + "[" + index + "]";
        } else if (node instanceof ObjectNode) {
            ObjectNode objectNode = (ObjectNode) node;
            StringBuilder object = new StringBuilder();
            object.append("{");
            for (int i = 0; i < objectNode.getProperties().size(); i++) {
                if (i > 0) object.append(", ");
                PropertyNode prop = objectNode.getProperties().get(i);
                object.append(prop.getKey()).append(": ").append(generateExpressionForMainTemplate(prop.getValue()));
            }
            object.append("}");
            return object.toString();
        } else if (node instanceof ParenthesizedValueNode) {
            ParenthesizedValueNode parenNode = (ParenthesizedValueNode) node;
            return "(" + generateExpressionForMainTemplate(parenNode.getInnerValue()) + ")";
        } else if (node instanceof IncrementNode) {
            IncrementNode incNode = (IncrementNode) node;
            String operand = incNode.getOperand();
            return incNode.isPrefix() ? "++" + operand : operand + "++";
        } else if (node instanceof DecrementNode) {
            DecrementNode decNode = (DecrementNode) node;
            String operand = decNode.getOperand();
            return decNode.isPrefix() ? "--" + operand : operand + "--";
        } else if (node instanceof IncDecNode) {
            IncDecNode incDecNode = (IncDecNode) node;
            String operand = incDecNode.getOperand();
            return incDecNode.isIncrement() ? 
                (incDecNode.isPrefix() ? "++" + operand : operand + "++") :
                (incDecNode.isPrefix() ? "--" + operand : operand + "--");
        } else if (node instanceof OperatorExpressionNode) {
            OperatorExpressionNode opNode = (OperatorExpressionNode) node;
            String left = generateExpressionForMainTemplate(opNode.getLeft());
            String right = generateExpressionForMainTemplate(opNode.getRight());
            return left + " " + opNode.getOperator() + " " + right;
        } else if (node instanceof NestedTemplateInterpolationNode) {
            NestedTemplateInterpolationNode nestedNode = (NestedTemplateInterpolationNode) node;
            StringBuilder nested = new StringBuilder();
            nested.append("`");
            for (ASTNode part : nestedNode.getParts()) {
                if (part instanceof StringNode) {
                    nested.append(((StringNode) part).getValue());
                } else if (part instanceof ValueNode) {
                    nested.append("${").append(generateExpressionForMainTemplate(part)).append("}");
                } else {
                    nested.append(generateExpressionForMainTemplate(part));
                }
            }
            nested.append("`");
            return nested.toString();
        } else if (node instanceof TypeDeclarationValueNode) {
            TypeDeclarationValueNode typeNode = (TypeDeclarationValueNode) node;
            return generateExpressionForMainTemplate(typeNode.getValue());
        } else if (node instanceof TypeDefineNode) {
            TypeDefineNode typeDefineNode = (TypeDefineNode) node;
            String typeName = typeDefineNode.getName();
            return typeDefineNode.isArray() ? typeName + "[]" : typeName;
        } else if (node instanceof TypeNode) {
            TypeNode typeNode = (TypeNode) node;
            String typeName = typeNode.getTypeName();
            return typeNode.isArray() ? typeName + "[]" : typeName;
        } else if (node instanceof HtmlNode) {
            HtmlNode htmlNode = (HtmlNode) node;
            StringBuilder html = new StringBuilder();
            generateHtmlNodeForTemplate(htmlNode, html);
            return html.toString();
        } else if (node instanceof ValueNode) {
            // Handle ValueNode by extracting its primary value
            ValueNode valueNode = (ValueNode) node;
            if (valueNode.getPrimaryValue() != null) {
                return generateExpressionForMainTemplate(valueNode.getPrimaryValue());
            }
        }
        
        return "/* Unsupported expression: " + node.getClass().getSimpleName() + " */";
    }

    /**
     * Generate expressions for nested templates (without adding 'this.' prefix to identifiers)
     */
    private String generateExpressionForNested(ASTNode node) {
        return generateExpressionForNested(node, false);
    }
    
    /**
     * Generate expressions for nested templates with context awareness
     * @param node The AST node to generate code for
     * @param isComponentProperty Whether this identifier represents a component property (true) or local variable (false)
     */
    private String generateExpressionForNested(ASTNode node, boolean isComponentProperty) {
        // Add null safety check
        if (node == null) {
            return "undefined";
        }
        
        if (node instanceof ValueNode) {
            ValueNode valueNode = (ValueNode) node;
            String expression = generateExpressionForNested(valueNode.getPrimaryValue(), isComponentProperty);
            
            // Handle modifiers like ! (negation)
            if (valueNode.getModifier() != null) {
                if ("!".equals(valueNode.getModifier())) {
                    expression = "!" + expression;
                }
                // Add other modifiers here if needed (e.g., "?" for optional chaining)
            }
            
            return expression;
        } else if (node instanceof IdentifierNode) {
            String varName = ((IdentifierNode) node).getName();
            if (isComponentProperty) {
                // This is a component property, so add 'this.' prefix
                usedProperties.add(varName);
                return "this." + varName;
            } else {
                // This is a local variable, don't add 'this.' prefix
                return varName;
            }
        } else if (node instanceof StringNode) {
            return "\"" + ((StringNode) node).getValue() + "\"";
        } else if (node instanceof NumberNode) {
            return ((NumberNode) node).getValue();
        } else if (node instanceof BooleanNode) {
            return String.valueOf(((BooleanNode) node).getValue());
        } else if (node instanceof PropertyAccessValueNode) {
            PropertyAccessValueNode propNode = (PropertyAccessValueNode) node;
            // For property access like 'products.map', the left operand should be treated as a component property
            // if isComponentProperty is true, but the right operand (like 'map') is not a component property
            String left = generateExpressionForNested(propNode.getLeft(), isComponentProperty);
            String right = generateExpressionForNested(propNode.getRight(), false);
            return left + "." + right;
        } else if (node instanceof PropertyAccessNode) {
            PropertyAccessNode propNode = (PropertyAccessNode) node;
            String object = generateExpressionForNested(propNode.getObject(), isComponentProperty);
            String property = generateExpressionForNested(propNode.getProperty(), false);
            return object + "." + property;
        } else if (node instanceof MethodCallValueNode) {
            MethodCallValueNode methodNode = (MethodCallValueNode) node;
            String left = generateExpressionForNested(methodNode.getLeft(), isComponentProperty);
            StringBuilder methodCall = new StringBuilder();
            methodCall.append(left).append("(");
            
            for (int i = 0; i < methodNode.getArgs().size(); i++) {
                if (i > 0) methodCall.append(", ");
                methodCall.append(generateExpressionForNested(methodNode.getArgs().get(i), false));
            }
            
            methodCall.append(")");
            return methodCall.toString();
        } else if (node instanceof ArrowFunctionValueNode) {
            ArrowFunctionValueNode arrowNode = (ArrowFunctionValueNode) node;
            StringBuilder arrowFunc = new StringBuilder();
            arrowFunc.append("(");
            
            for (int i = 0; i < arrowNode.getParams().size(); i++) {
                if (i > 0) arrowFunc.append(", ");
                arrowFunc.append(arrowNode.getParams().get(i));
            }
            
            arrowFunc.append(") => ");
            
            // Handle different body types
            if (arrowNode.getBody() == null) {
                // Handle empty arrow function
                arrowFunc.append("undefined");
            } else if (arrowNode.getBody() instanceof FunctionBodyNode) {
                FunctionBodyNode functionBody = (FunctionBodyNode) arrowNode.getBody();
                if (functionBody.arrowHasStatements()) {
                    // Statement style: (params) => { statements }
                    arrowFunc.append("{");
                    for (ASTNode stmt : functionBody.getArrowStatements()) {
                        if (stmt != null) {
                            arrowFunc.append("\n  ").append(generateExpressionForNested(stmt, false));
                        } else {
                            arrowFunc.append("\n  // null statement");
                        }
                    }
                    arrowFunc.append("\n}");
                } else if (functionBody.getArrowValue() != null) {
                    // Expression style: (params) => expression
                    arrowFunc.append(generateExpressionForNested(functionBody.getArrowValue(), false));
                }
            } else {
                // Regular expression body
                arrowFunc.append(generateExpressionForNested(arrowNode.getBody(), false));
            }
            
            return arrowFunc.toString();
        } else if (node instanceof FunctionCallNode) {
            FunctionCallNode functionNode = (FunctionCallNode) node;
            StringBuilder functionCall = new StringBuilder();
            functionCall.append(functionNode.getFunctionName()).append("(");
            
            for (int i = 0; i < functionNode.getArguments().size(); i++) {
                if (i > 0) functionCall.append(", ");
                functionCall.append(generateExpressionForNested(functionNode.getArguments().get(i), false));
            }
            
            functionCall.append(")");
            return functionCall.toString();
        } else if (node instanceof FunctionBodyNode) {
            FunctionBodyNode functionBody = (FunctionBodyNode) node;
            if (functionBody.isBlockStyle()) {
                // Handle block-style function body
                StringBuilder blockBody = new StringBuilder();
                blockBody.append("{");
                for (ASTNode stmt : functionBody.getStatements()) {
                    blockBody.append("\n").append(generateExpressionForNested(stmt, false));
                }
                blockBody.append("}");
                return blockBody.toString();
            } else {
                // Handle arrow function body
                StringBuilder arrowBody = new StringBuilder();
                arrowBody.append("(").append(String.join(", ", functionBody.getParams())).append(") => ");
                if (functionBody.arrowHasStatements()) {
                    // Statement style: (params) => { statements }
                    arrowBody.append("{");
                    for (ASTNode stmt : functionBody.getArrowStatements()) {
                        if (stmt != null) {
                            arrowBody.append("\n").append(generateExpressionForNested(stmt, false));
                        } else {
                            arrowBody.append("\n  // null statement");
                        }
                    }
                    arrowBody.append("}");
                } else if (functionBody.getArrowValue() != null) {
                    // Expression style: (params) => expression
                    arrowBody.append(generateExpressionForNested(functionBody.getArrowValue(), false));
                }
                return arrowBody.toString();
            }
        } else if (node instanceof TemplateLiteralNode) {
            // Handle nested template literals
            StringBuilder nestedTemplate = new StringBuilder();
            nestedTemplate.append("`");
            
            for (ASTNode part : ((TemplateLiteralNode) node).getParts()) {
                if (part instanceof StringNode) {
                    // Transform interpolations in string content (e.g., {{ product.name }} -> ${this.product.name})
                    String content = ((StringNode) part).getValue();
                    nestedTemplate.append(transformInterpolations(content));
                } else if (part instanceof IdentifierNode) {
                    String varName = ((IdentifierNode) part).getName();
                    // Don't add to usedProperties for nested templates - they're local variables
                    nestedTemplate.append("${").append(varName).append("}");
                } else if (part instanceof HtmlNode) {
                    // For HTML nodes in nested templates, generate the HTML content
                    generateHtmlNodeForTemplate((HtmlNode) part, nestedTemplate);
                } else if (part instanceof ValueNode) {
                    // Handle interpolated values in nested templates
                    nestedTemplate.append("${");
                    nestedTemplate.append(generateExpressionForNested(part, false));
                    nestedTemplate.append("}");
                }
            }
            
            nestedTemplate.append("`");
            return nestedTemplate.toString();
        } else if (node instanceof ArrayNode) {
            ArrayNode arrayNode = (ArrayNode) node;
            StringBuilder array = new StringBuilder();
            array.append("[");
            for (int i = 0; i < arrayNode.getElements().size(); i++) {
                if (i > 0) array.append(", ");
                array.append(generateExpressionForNested(arrayNode.getElements().get(i), false));
            }
            array.append("]");
            return array.toString();
        } else if (node instanceof ArrayAccessNode) {
            ArrayAccessNode arrayAccessNode = (ArrayAccessNode) node;
            String arrayName = arrayAccessNode.getArray();
            String index = generateExpressionForNested(arrayAccessNode.getIndex(), false);
            return arrayName + "[" + index + "]";
        } else if (node instanceof ObjectNode) {
            ObjectNode objectNode = (ObjectNode) node;
            StringBuilder object = new StringBuilder();
            object.append("{");
            for (int i = 0; i < objectNode.getProperties().size(); i++) {
                if (i > 0) object.append(", ");
                PropertyNode prop = objectNode.getProperties().get(i);
                object.append(prop.getKey()).append(": ").append(generateExpressionForNested(prop.getValue(), false));
            }
            object.append("}");
            return object.toString();
        } else if (node instanceof ParenthesizedValueNode) {
            ParenthesizedValueNode parenNode = (ParenthesizedValueNode) node;
            return "(" + generateExpressionForNested(parenNode.getInnerValue(), isComponentProperty) + ")";
        } else if (node instanceof IncrementNode) {
            IncrementNode incNode = (IncrementNode) node;
            String operand = incNode.getOperand();
            return incNode.isPrefix() ? "++" + operand : operand + "++";
        } else if (node instanceof DecrementNode) {
            DecrementNode decNode = (DecrementNode) node;
            String operand = decNode.getOperand();
            return decNode.isPrefix() ? "--" + operand : operand + "--";
        } else if (node instanceof IncDecNode) {
            IncDecNode incDecNode = (IncDecNode) node;
            String operand = incDecNode.getOperand();
            return incDecNode.isIncrement() ? 
                (incDecNode.isPrefix() ? "++" + operand : operand + "++") :
                (incDecNode.isPrefix() ? "--" + operand : operand + "--");
        } else if (node instanceof OperatorExpressionNode) {
            OperatorExpressionNode opNode = (OperatorExpressionNode) node;
            String left = generateExpressionForNested(opNode.getLeft(), isComponentProperty);
            String right = generateExpressionForNested(opNode.getRight(), false);
            return left + " " + opNode.getOperator() + " " + right;
        } else if (node instanceof NestedTemplateInterpolationNode) {
            NestedTemplateInterpolationNode nestedNode = (NestedTemplateInterpolationNode) node;
            StringBuilder nested = new StringBuilder();
            nested.append("`");
            for (ASTNode part : nestedNode.getParts()) {
                if (part instanceof StringNode) {
                    nested.append(((StringNode) part).getValue());
                } else if (part instanceof ValueNode) {
                    nested.append("${").append(generateExpressionForNested(part, false)).append("}");
                } else {
                    nested.append(generateExpressionForNested(part, false));
                }
            }
            nested.append("`");
            return nested.toString();
        } else if (node instanceof TypeDeclarationValueNode) {
            TypeDeclarationValueNode typeNode = (TypeDeclarationValueNode) node;
            return generateExpressionForNested(typeNode.getValue(), false);
        } else if (node instanceof TypeDefineNode) {
            TypeDefineNode typeDefineNode = (TypeDefineNode) node;
            String typeName = typeDefineNode.getName();
            return typeDefineNode.isArray() ? typeName + "[]" : typeName;
        } else if (node instanceof TypeNode) {
            TypeNode typeNode = (TypeNode) node;
            String typeName = typeNode.getTypeName();
            return typeNode.isArray() ? typeName + "[]" : typeName;
        } else if (node instanceof HtmlNode) {
            HtmlNode htmlNode = (HtmlNode) node;
            StringBuilder html = new StringBuilder();
            generateHtmlNodeForTemplate(htmlNode, html);
            return html.toString();
        } else if (node instanceof ValueNode) {
            // Handle ValueNode by extracting its primary value
            ValueNode valueNode = (ValueNode) node;
            if (valueNode.getPrimaryValue() != null) {
                return generateExpressionForNested(valueNode.getPrimaryValue(), isComponentProperty);
            }
        }
        
        return "/* Unsupported expression: " + node.getClass().getSimpleName() + " */";
    }
    
    /**
     * Generate HTML node content for nested templates
     */
    private void generateHtmlNodeForTemplate(HtmlNode htmlNode, StringBuilder template) {
        generateHtmlNodeForTemplate(htmlNode, template, false);
    }
    
    /**
     * Generate HTML node content for templates with context awareness
     */
    private void generateHtmlNodeForTemplate(HtmlNode htmlNode, StringBuilder template, boolean isMainTemplate) {
        // Check for Angular structural directives first
        boolean hasNgFor = false;
        boolean hasNgIf = false;
        String ngForValue = null;
        String ngIfValue = null;
        
        for (HtmlNode.HtmlAttribute attr : htmlNode.getAttributes()) {
            if ("*ngFor".equals(attr.getName())) {
                hasNgFor = true;
                ngForValue = attr.getValue();
            } else if ("*ngIf".equals(attr.getName())) {
                hasNgIf = true;
                ngIfValue = attr.getValue();
            }
        }
        
        if (hasNgFor) {
            generateNgForForTemplate(htmlNode, ngForValue, template, isMainTemplate);
        } else if (hasNgIf) {
            generateNgIfForTemplate(htmlNode, ngIfValue, template, isMainTemplate);
        } else {
            // Generate normal HTML element
            generateNormalHtmlForTemplate(htmlNode, template, isMainTemplate);
        }
    }
    
    private void generateNormalHtmlForTemplate(HtmlNode htmlNode, StringBuilder template, boolean isMainTemplate) {
        switch (htmlNode.getType()) {
            case ELEMENT:
                // Start tag with attributes
                template.append("<").append(htmlNode.getTagName());
                generateHtmlAttributes(htmlNode, template);
                template.append(">");
                
                // Add children
                for (HtmlNode child : htmlNode.getChildren()) {
                    generateHtmlNodeForTemplate(child, template, isMainTemplate);
                }
                
                // End tag
                template.append("</").append(htmlNode.getTagName()).append(">");
                break;
                
            case SELF_CLOSING:
                template.append("<").append(htmlNode.getTagName());
                generateHtmlAttributes(htmlNode, template);
                template.append(" />");
                break;
                
            case TEXT:
                String text = htmlNode.getTextContent();
                if (text != null && !text.trim().isEmpty()) {
                    if (isMainTemplate) {
                        template.append(transformInterpolationsForMainTemplate(text));
                    } else {
                        template.append(transformInterpolations(text));
                    }
                }
                break;
                
            case STYLE:
                // Handle style blocks
                template.append("<style>");
                if (htmlNode.getTextContent() != null && !htmlNode.getTextContent().trim().isEmpty()) {
                    template.append(htmlNode.getTextContent());
                }
                // Handle embedded statements in style blocks (for dynamic styles)
                for (ASTNode stmt : htmlNode.getEmbeddedStatements()) {
                    if (stmt instanceof ValueNode) {
                        String expr = generateExpressionForNested(stmt, false);
                        template.append("${").append(expr).append("}");
                    } else if (stmt instanceof StringNode) {
                        template.append(((StringNode) stmt).getValue());
                    } else if (stmt instanceof NumberNode) {
                        String number = ((NumberNode) stmt).getValue();
                        template.append("${").append(number).append("}");
                    }
                }
                template.append("</style>");
                break;
                
            case EMBEDDED_STATEMENTS:
                for (ASTNode stmt : htmlNode.getEmbeddedStatements()) {
                    if (stmt instanceof ValueNode) {
                        String expr = generateExpressionForNested(stmt);
                        template.append("${").append(expr).append("}");
                    } else if (stmt instanceof VariableAssignNode) {
                        String name = ((VariableAssignNode) stmt).getIdentifier();
                        if (name != null && !name.isEmpty()) {
                            // Don't add to usedProperties for nested templates - they're local variables
                            template.append("${").append(name).append("}");
                        }
                    } else if (stmt instanceof IdentifierNode) {
                        String varName = ((IdentifierNode) stmt).getName();
                        template.append("${").append(varName).append("}");
                        // Don't add to usedProperties for nested templates - they're local variables
                    } else if (stmt instanceof StringNode) {
                        String content = ((StringNode) stmt).getValue();
                        if (isMainTemplate) {
                            template.append(transformInterpolationsForMainTemplate(content));
                        } else {
                            template.append(transformInterpolations(content));
                        }
                    } else if (stmt instanceof NumberNode) {
                        String number = ((NumberNode) stmt).getValue();
                        template.append("${").append(number).append("}");
                    } else if (stmt instanceof HtmlNode) {
                        generateHtmlNodeForTemplate((HtmlNode) stmt, template, isMainTemplate);
                    } else if (stmt instanceof TemplateLiteralNode) {
                        // For nested template literals in HTML, we need to handle them specially
                        StringBuilder nestedTemplate = new StringBuilder();
                        generateTemplateLiteralForNested((TemplateLiteralNode) stmt, nestedTemplate);
                        template.append(nestedTemplate.toString());
                    }
                }
                break;
        }
    }
    
    /**
     * Generate HTML attributes for elements
     */
    private void generateHtmlAttributes(HtmlNode htmlNode, StringBuilder template) {
        for (HtmlNode.HtmlAttribute attr : htmlNode.getAttributes()) {
            String attrName = attr.getName();
            String attrValue = attr.getValue();
            
            // Handle Angular structural directives
            if ("*ngFor".equals(attrName)) {
                // Skip *ngFor attribute - it will be handled during element generation
                continue;
            } else if ("*ngIf".equals(attrName)) {
                // Skip *ngIf attribute - it will be handled during element generation
                continue;
            } else if ("[click]".equals(attrName)) {
                // Transform [click] to onclick for standard HTML
                template.append(" onclick=\"").append(attrValue).append("\"");
                continue;
            }
            
            // Handle special attributes
            if ("class".equals(attrName)) {
                // Class attributes are preserved as-is
                template.append(" ").append(attrName).append("=\"").append(attrValue).append("\"");
            } else if ("style".equals(attrName)) {
                // Style attributes are preserved as-is
                template.append(" ").append(attrName).append("=\"").append(attrValue).append("\"");
            } else {
                // Other attributes are preserved as-is
                template.append(" ").append(attrName).append("=\"").append(attrValue).append("\"");
            }
        }
    }
    
    /**
     * Generate HTML attributes for main template generation
     */
    private void generateHtmlAttributesForMain(HtmlNode htmlNode, StringBuilder template) {
        for (HtmlNode.HtmlAttribute attr : htmlNode.getAttributes()) {
            String attrName = attr.getName();
            String attrValue = attr.getValue();

            // Handle Angular structural directives
            if ("*ngFor".equals(attrName)) {
                // Skip *ngFor attribute - it will be handled during element generation
                continue;
            } else if ("*ngIf".equals(attrName)) {
                // Skip *ngIf attribute - it will be handled during element generation
                continue;
            } else if ("[click]".equals(attrName)) {
                // Transform [click] to onclick for standard HTML
                template.append(" onclick=\"").append(attrValue).append("\"");
                continue;
            }

            // Handle special attributes
            if ("class".equals(attrName)) {
                // Class attributes are preserved as-is
                template.append(" ").append(attrName).append("=\"").append(attrValue).append("\"");
            } else if ("style".equals(attrName)) {
                // Style attributes are preserved as-is
                template.append(" ").append(attrName).append("=\"").append(attrValue).append("\"");
            } else {
                // Other attributes are preserved as-is
                template.append(" ").append(attrName).append("=\"").append(attrValue).append("\"");
            }
        }
    }
    
    /**
     * Generate style nodes for main template generation
     */
    private void generateStyleNode(HtmlNode styleNode) {
        appendLine("<style>");
        if (styleNode.getTextContent() != null && !styleNode.getTextContent().trim().isEmpty()) {
            appendLine(styleNode.getTextContent());
        }
        // Handle embedded statements in style blocks (for dynamic styles)
        for (ASTNode stmt : styleNode.getEmbeddedStatements()) {
            if (stmt instanceof ValueNode) {
                String expr = generateExpressionForMainTemplate(stmt);
                appendLine("${" + expr + "}");
            } else if (stmt instanceof StringNode) {
                appendLine(((StringNode) stmt).getValue());
            } else if (stmt instanceof NumberNode) {
                String number = ((NumberNode) stmt).getValue();
                appendLine("${" + number + "}");
            }
        }
        appendLine("</style>");
    }
    
    /**
     * Generate template literal content for nested templates (without appendLine)
     */
    private void generateTemplateLiteralForNested(TemplateLiteralNode template, StringBuilder output) {
        for (ASTNode part : template.getParts()) {
            if (part instanceof HtmlNode) {
                generateHtmlNodeForTemplate((HtmlNode) part, output);
            } else if (part instanceof StringNode) {
                // Handle string parts directly
                String content = ((StringNode) part).getValue();
                output.append(content);
            } else if (part instanceof ValueNode) {
                // Handle interpolated values in nested templates
                String expr = generateExpressionForNested(part);
                output.append("${").append(expr).append("}");
            } else if (part instanceof IdentifierNode) {
                // Handle variable references directly - these are local variables in nested templates
                String varName = ((IdentifierNode) part).getName();
                output.append("${this.").append(varName).append("}");
                // Don't add to usedProperties for nested templates - they're local variables
            } else {
                output.append("<!-- Template part not supported: ").append(part.getClass().getSimpleName()).append(" -->");
            }
        }
    }
    
    /**
     * Generate arrow functions for the main component template
     * This method handles the distinction between component properties and local variables
     */
    private String generateArrowFunctionForMainTemplate(ArrowFunctionValueNode arrowNode) {
        StringBuilder arrowFunc = new StringBuilder();
        arrowFunc.append("(");
        
        // Parameters are local variables, not component properties
        for (int i = 0; i < arrowNode.getParams().size(); i++) {
            if (i > 0) arrowFunc.append(", ");
            arrowFunc.append(arrowNode.getParams().get(i));
        }
        
        arrowFunc.append(") => ");
        // The body of the arrow function is a nested context, so use generateExpressionForNested
        if (arrowNode.getBody() == null) {
            // Handle empty arrow function
            arrowFunc.append("undefined");
        } else if (arrowNode.getBody() instanceof FunctionBodyNode) {
            FunctionBodyNode functionBody = (FunctionBodyNode) arrowNode.getBody();
                            if (functionBody.arrowHasStatements()) {
                    // Statement style: (params) => { statements }
                    arrowFunc.append("{");
                    for (ASTNode stmt : functionBody.getArrowStatements()) {
                        if (stmt != null) {
                            arrowFunc.append("\n  ").append(generateExpressionForNested(stmt, false));
                        } else {
                            arrowFunc.append("\n  // null statement");
                        }
                    }
                    arrowFunc.append("\n}");
                } else if (functionBody.getArrowValue() != null) {
                // Expression style: (params) => expression
                arrowFunc.append(generateExpressionForNested(functionBody.getArrowValue(), false));
            }
        } else {
            // Regular expression body
            arrowFunc.append(generateExpressionForNested(arrowNode.getBody(), false));
        }
        
        return arrowFunc.toString();
    }

    /**
     * Generate method calls for the main component template
     * This method handles the distinction between component properties and local variables
     */
    private String generateMethodCallForMainTemplate(MethodCallValueNode methodNode) {
        StringBuilder methodCall = new StringBuilder();
        
        // Handle the left operand - this should be the full method access (e.g., 'products.map')
        // The left operand is likely a component property, so pass true for isComponentProperty
        methodCall.append(generateExpressionForNested(methodNode.getLeft(), true));
        
        // Add the method call parentheses and arguments
        methodCall.append("(");
        for (int i = 0; i < methodNode.getArgs().size(); i++) {
            if (i > 0) methodCall.append(", ");
            // Arguments are never component properties in method calls
            methodCall.append(generateExpressionForNested(methodNode.getArgs().get(i), false));
        }
        methodCall.append(")");
        
        return methodCall.toString();
    }
    
        /**
     * Extract root styles from source code
     * This method looks for <style> tags outside of component definitions
     */
    public String extractRootStyles(String sourceCode) {
        if (sourceCode == null || sourceCode.trim().isEmpty()) {
            return null;
        }

        StringBuilder rootStyles = new StringBuilder();
        
        // Simple regex to find <style> tags outside of component definitions
        // This is a basic approach - for production use, you'd want more sophisticated parsing
        String[] lines = sourceCode.split("\n");
        boolean inComponent = false;
        boolean inStyle = false;
        StringBuilder currentStyle = new StringBuilder();
        int braceCount = 0;
        boolean inComponentParams = false;
        
        for (String line : lines) {
            String trimmedLine = line.trim();
            
            // Check if we're entering a component
            if (trimmedLine.startsWith("@component(")) {
                inComponent = true;
                inComponentParams = true;
                braceCount = 0;
                continue;
            }
            
            // Count braces and parentheses to properly detect component end
            if (inComponent) {
                for (char c : line.toCharArray()) {
                    if (c == '{') {
                        braceCount++;
                    } else if (c == '}') {
                        braceCount--;
                        // If we've closed all braces and we're not in component params, we're done
                        if (braceCount == 0 && !inComponentParams) {
                            inComponent = false;
                        }
                    } else if (c == ')') {
                        // If we see a closing parenthesis and we're in component params, switch to body
                        if (inComponentParams && braceCount == 0) {
                            inComponentParams = false;
                        }
                    }
                }
                
                // Special case: if we see "})" on a line, the component is definitely done
                if (line.contains("})") && braceCount == 0) {
                    inComponent = false;
                    inComponentParams = false;
                }
            }
            
            // Check if we're entering a style tag
            if (!inComponent && trimmedLine.startsWith("<style>")) {
                inStyle = true;
                currentStyle.setLength(0);
                continue;
            }
            
            // Check if we're exiting a style tag
            if (inStyle && trimmedLine.equals("</style>")) {
                inStyle = false;
                if (currentStyle.length() > 0) {
                    if (rootStyles.length() > 0) {
                        rootStyles.append("\n");
                    }
                    rootStyles.append(currentStyle.toString().trim());
                }
                continue;
            }
            
            // Collect style content
            if (inStyle) {
                currentStyle.append(line).append("\n");
            }
        }
        
        return rootStyles.length() > 0 ? rootStyles.toString().trim() : null;
    }

    private String formatComponentProperty(String propertyName) {
        // If it's a simple identifier (not a complex expression), add 'this.' prefix
        if (propertyName.matches("^[a-zA-Z_][a-zA-Z0-9_]*$")) {
            return "this." + propertyName;
        }
        return propertyName;
    }

    /**
     * Transform Angular-like interpolations {{...}} to JavaScript template literals for ngFor contexts
     * This is used inside ngFor loops where variables are local to the loop
     */
    private String transformInterpolationsForNgFor(String content, String loopVariable) {
        if (content == null) return "";
        Pattern pattern = Pattern.compile("\\{\\{\\s*(.+?)\\s*\\}\\}");
        Matcher matcher = pattern.matcher(content);
        StringBuffer result = new StringBuffer();
        
        while (matcher.find()) {
            String expression = matcher.group(1).trim();
            // For ngFor contexts, use the loop variable directly
            // If it starts with the loop variable, use it as is
            // Otherwise, assume it's a property of the loop variable
            if (expression.startsWith(loopVariable + ".")) {
                matcher.appendReplacement(result, "\\${" + expression + "}");
            } else if (expression.equals(loopVariable)) {
                matcher.appendReplacement(result, "\\${" + expression + "}");
            } else {
                // Assume it's a property of the loop variable
                matcher.appendReplacement(result, "\\${" + loopVariable + "." + expression + "}");
            }
        }
        matcher.appendTail(result);
        return result.toString();
    }

    private void generateNgForForTemplate(HtmlNode element, String ngForValue, StringBuilder template, boolean isMainTemplate) {
        // Parse ngFor value: "let item of items"
        String[] parts = ngForValue.split(" of ");
        if (parts.length == 2) {
            String variablePart = parts[0].trim();
            String collectionPart = parts[1].trim();
            
            // Extract variable name from "let item"
            String variableName = variablePart.replace("let ", "").trim();
            
            // Format collection reference as component property
            String formattedCollection = formatComponentProperty(collectionPart);
            
            // Generate dynamic ngFor template
            template.append("<!-- ngFor directive: ").append(ngForValue).append(" -->\n");
            template.append("${").append(formattedCollection).append(".map(").append(variableName).append(" => `");
            
            // Generate the HTML structure with dynamic content
            template.append("<").append(element.getTagName());
            
            // Add attributes (excluding Angular directives)
            for (HtmlNode.HtmlAttribute attr : element.getAttributes()) {
                if (!"*ngFor".equals(attr.getName()) && !"*ngIf".equals(attr.getName())) {
                    template.append(" ").append(attr.getName()).append("=\"").append(attr.getValue()).append("\"");
                }
            }
            
            template.append(">");
            
            // Add children with dynamic content binding for ngFor context
            for (HtmlNode child : element.getChildren()) {
                generateHtmlNodeForNgFor(child, template, variableName);
            }
            
            template.append("</").append(element.getTagName()).append(">");
            
            template.append("`).join('')}");
            
        } else {
            // Fallback for malformed ngFor
            template.append("<!-- Error: Invalid ngFor syntax: ").append(ngForValue).append(" -->\n");
            generateNormalHtmlForTemplate(element, template, isMainTemplate);
        }
    }
    
    private void generateNgIfForTemplate(HtmlNode element, String ngIfValue, StringBuilder template, boolean isMainTemplate) {
        generateNgIfForTemplate(element, ngIfValue, template, isMainTemplate, null);
    }
    
    private void generateNgIfForTemplate(HtmlNode element, String ngIfValue, StringBuilder template, boolean isMainTemplate, String loopVariable) {
        // Format ngIf value as component property if it's a simple identifier
        String formattedNgIfValue;
        if (loopVariable != null && ngIfValue.startsWith(loopVariable + ".")) {
            // Inside ngFor loop, use the loop variable directly
            formattedNgIfValue = ngIfValue;
        } else {
            formattedNgIfValue = formatComponentProperty(ngIfValue);
        }
        
        // Generate conditional ngIf template
        template.append("<!-- ngIf directive: ").append(ngIfValue).append(" -->\n");
        template.append("${").append(formattedNgIfValue).append(" ? `");
        
        // Generate the HTML structure
        template.append("<").append(element.getTagName());
        
        // Add attributes (excluding Angular directives)
        for (HtmlNode.HtmlAttribute attr : element.getAttributes()) {
            if (!"*ngFor".equals(attr.getName()) && !"*ngIf".equals(attr.getName())) {
                template.append(" ").append(attr.getName()).append("=\"").append(attr.getValue()).append("\"");
            }
        }
        
        template.append(">");
        
        // Add children
        for (HtmlNode child : element.getChildren()) {
            if (loopVariable != null) {
                generateHtmlNodeForNgFor(child, template, loopVariable);
            } else {
                generateHtmlNodeForTemplate(child, template, isMainTemplate);
            }
        }
        
        template.append("</").append(element.getTagName()).append(">");
        
        template.append("` : ''}");
    }
    
    /**
     * Generate HTML node specifically for ngFor contexts
     * This method handles interpolation differently for loop variables
     */
    private void generateHtmlNodeForNgFor(HtmlNode htmlNode, StringBuilder template, String loopVariable) {
        // Check if this node has Angular directives
        boolean hasNgFor = false;
        boolean hasNgIf = false;
        String ngForValue = null;
        String ngIfValue = null;
        
        for (HtmlNode.HtmlAttribute attr : htmlNode.getAttributes()) {
            if ("*ngFor".equals(attr.getName())) {
                hasNgFor = true;
                ngForValue = attr.getValue();
            } else if ("*ngIf".equals(attr.getName())) {
                hasNgIf = true;
                ngIfValue = attr.getValue();
            }
        }
        
        if (hasNgFor) {
            generateNgForForTemplate(htmlNode, ngForValue, template, false);
        } else if (hasNgIf) {
            generateNgIfForTemplate(htmlNode, ngIfValue, template, false, loopVariable);
        } else {
            // Generate normal HTML element
            switch (htmlNode.getType()) {
                case ELEMENT:
                    // Start tag with attributes
                    template.append("<").append(htmlNode.getTagName());
                    generateHtmlAttributes(htmlNode, template);
                    template.append(">");
                    
                    // Add children
                    for (HtmlNode child : htmlNode.getChildren()) {
                        generateHtmlNodeForNgFor(child, template, loopVariable);
                    }
                    
                    // End tag
                    template.append("</").append(htmlNode.getTagName()).append(">");
                    break;
                    
                case SELF_CLOSING:
                    template.append("<").append(htmlNode.getTagName());
                    generateHtmlAttributes(htmlNode, template);
                    template.append(" />");
                    break;
                    
                case TEXT:
                    String text = htmlNode.getTextContent();
                    if (text != null && !text.trim().isEmpty()) {
                        template.append(transformInterpolationsForNgFor(text, loopVariable));
                    }
                    break;
                    
                case STYLE:
                    // Handle style blocks
                    template.append("<style>");
                    if (htmlNode.getTextContent() != null && !htmlNode.getTextContent().trim().isEmpty()) {
                        template.append(htmlNode.getTextContent());
                    }
                    template.append("</style>");
                    break;
                    
                case EMBEDDED_STATEMENTS:
                    for (ASTNode stmt : htmlNode.getEmbeddedStatements()) {
                        if (stmt instanceof ValueNode) {
                            String expr = generateExpressionForNested(stmt, false);
                            template.append("${").append(expr).append("}");
                        } else if (stmt instanceof StringNode) {
                            String content = ((StringNode) stmt).getValue();
                            template.append(transformInterpolationsForNgFor(content, loopVariable));
                        } else if (stmt instanceof NumberNode) {
                            String number = ((NumberNode) stmt).getValue();
                            template.append("${").append(number).append("}");
                        }
                    }
                    break;
            }
        }
    }

    /**
     * Get default value for a node type during code generation
     * This method handles various node types and provides appropriate default values
     */
    private String getDefaultValue(ASTNode node) {
        if (node == null) {
            return "undefined";
        }
        
        if (node instanceof FunctionBodyNode) {
            FunctionBodyNode functionBody = (FunctionBodyNode) node;
            if (functionBody.isBlockStyle()) {
                // For block-style function bodies, generate a function that returns undefined
                StringBuilder blockBody = new StringBuilder();
                blockBody.append("function() {");
                for (ASTNode stmt : functionBody.getStatements()) {
                    blockBody.append("\n  ").append(generateExpression(stmt));
                }
                blockBody.append("\n  return undefined;");
                blockBody.append("\n}");
                return blockBody.toString();
            } else {
                // For arrow functions, generate the arrow function
                StringBuilder arrowBody = new StringBuilder();
                arrowBody.append("(").append(String.join(", ", functionBody.getParams())).append(") => ");
                if (functionBody.arrowHasStatements()) {
                    // Statement style: (params) => { statements }
                    arrowBody.append("{");
                    for (ASTNode stmt : functionBody.getArrowStatements()) {
                        arrowBody.append("\n  ").append(generateExpression(stmt));
                    }
                    arrowBody.append("\n  return undefined;");
                    arrowBody.append("\n}");
                } else if (functionBody.getArrowValue() != null) {
                    // Expression style: (params) => expression
                    arrowBody.append(generateExpression(functionBody.getArrowValue()));
                } else {
                    // Fallback for empty arrow functions
                    arrowBody.append("undefined");
                }
                return arrowBody.toString();
            }
        } else if (node instanceof StringNode) {
            return ((StringNode) node).getValue();
        } else if (node instanceof NumberNode) {
            return ((NumberNode) node).getValue();
        } else if (node instanceof BooleanNode) {
            return String.valueOf(((BooleanNode) node).getValue());
        } else if (node instanceof IdentifierNode) {
            return ((IdentifierNode) node).getName();
        } else if (node instanceof ValueNode) {
            return generateExpression((ValueNode) node);
        } else {
            // For other node types, try to generate expression or return a placeholder
            try {
                return generateExpression(node);
            } catch (Exception e) {
                return "/* Default value for " + node.getClass().getSimpleName() + " */";
            }
        }
    }
}
