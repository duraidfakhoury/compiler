# Code Generation Feature

## Overview

The compiler now includes a code generation phase that transforms the AST into executable JavaScript/HTML code. The current implementation focuses on generating Web Components from `@component` declarations.

## Component Code Generation

### Input Syntax

```typescript
@component({
    selector: "my-button",
    template: `
        <button class="btn" style="background-color: ${color}; color: white;">
            ${text}
        </button>
    `
})
export class MyButton {
    const color = "blue"
    const text = "Click me!"
}
```

### Generated Output

The code generator produces a Web Component that extends `HTMLElement`:

```javascript
class MyButtonComponent extends HTMLElement {
    constructor() {
        super();
        this.attachShadow({ mode: 'open' });
        this.render();
    }
    
    render() {
        const template = document.createElement('template');
        template.innerHTML = `
            <button class="btn" style="background-color: ${this.color}; color: white;">
                ${this.text}
            </button>
        `;
        this.shadowRoot.appendChild(template.content.cloneNode(true));
    }
    
    // Component properties
    get color() {
        return this.getAttribute('color');
    }
    
    set color(value) {
        if (value === null || value === undefined) {
            this.removeAttribute('color');
        } else {
            this.setAttribute('color', value);
        }
        this.render();
    }
    
    get text() {
        return this.getAttribute('text');
    }
    
    set text(value) {
        if (value === null || value === undefined) {
            this.removeAttribute('text');
        } else {
            this.setAttribute('text', value);
        }
        this.render();
    }
    
    connectedCallback() {
        // Component connected to DOM
    }
    
    disconnectedCallback() {
        // Component disconnected from DOM
    }
}

// Register custom element
customElements.define('my-button', MyButtonComponent);
```

## Features

### 1. Template Generation
- Supports HTML elements with attributes
- Handles embedded expressions using `${variable}` syntax
- Generates proper template literals for dynamic content

### 2. Property Management
- Automatically generates getters and setters for component properties
- Handles attribute binding and removal
- Triggers re-rendering when properties change

### 3. Shadow DOM
- Uses Shadow DOM for component encapsulation
- Prevents style conflicts between components

### 4. Lifecycle Hooks
- `connectedCallback()` - Called when component is added to DOM
- `disconnectedCallback()` - Called when component is removed from DOM

## Usage

### Running the Compiler

```bash
# Compile the project
javac -cp "antlr-4.13.2-complete.jar" -d out/production/compilerV3 Classes/*.java src/*.java

# Run with a component test file
java -cp "out/production/compilerV3;antlr-4.13.2-complete.jar" Main
```

### Test Files

- `test/component_test.txt` - Complex component with template literals
- `test/simple_component_test.txt` - Simple component with basic HTML
- `examples/component_demo.html` - Working example of generated code

## Code Generator Architecture

### Main Classes

1. **CodeGenerator** - Main code generation engine
   - `generateComponent()` - Generate component JavaScript
   - `generateHtmlPage()` - Generate complete HTML page
   - `generateComponentScript()` - Generate only component script

2. **ComponentStatementNode** - AST node for component declarations
   - Stores selector, template, and properties
   - Used by the visitor pattern

### Generation Process

1. **Parse** - ANTLR parser creates parse tree
2. **Visit** - BaseVisitor creates AST with ComponentStatementNode
3. **Analyze** - Semantic analysis validates the component
4. **Generate** - CodeGenerator transforms AST to JavaScript/HTML

### Template Processing

The code generator handles different template types:

- **HTML Elements** - `<div>`, `<button>`, etc.
- **Self-closing Elements** - `<img />`, `<input />`
- **Text Nodes** - Plain text content
- **Embedded Statements** - JavaScript expressions in templates
- **Template Literals** - Complex templates with variables

## Future Enhancements

1. **Event Handling** - Generate event listeners for component interactions
2. **Styling** - Support for component-specific CSS
3. **Dependency Management** - Handle imports and component dependencies
4. **Optimization** - Code minification and optimization
5. **TypeScript Support** - Generate TypeScript interfaces and types
6. **Framework Integration** - Support for Angular, React, or Vue-like syntax

## Example Output

When you run the compiler with a component file, you'll see:

```
============================================================
CODE GENERATION:
============================================================

Generating code for component: my-button
----------------------------------------
Component JavaScript:
class MyButtonComponent extends HTMLElement {
    constructor() {
        super();
        this.attachShadow({ mode: 'open' });
        this.render();
    }
    
    render() {
        const template = document.createElement('template');
        template.innerHTML = `
            <button class="btn" style="background-color: ${this.color}; color: white;">
                ${this.text}
            </button>
        `;
        this.shadowRoot.appendChild(template.content.cloneNode(true));
    }
    
    // ... more generated code ...
}

Complete HTML Page:
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Component Demo</title>
    <script>
        // ... component JavaScript ...
    </script>
</head>
<body>
    <my-button></my-button>
</body>
</html>

✓ Code generation completed successfully!
```

This demonstrates the complete pipeline from source code to executable Web Components.
