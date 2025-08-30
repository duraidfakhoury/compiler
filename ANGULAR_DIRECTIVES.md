# Angular Structural Directives Support

This compiler now supports Angular-style structural directives `*ngFor` and `*ngIf` for dynamic HTML generation.

## Supported Directives

### *ngFor Directive

The `*ngFor` directive allows you to iterate over arrays and create HTML elements for each item.

**Syntax:**
```html
<element *ngFor="let variable of collection">
    <!-- content to repeat -->
</element>
```

**Example:**
```html
<div *ngFor="let product of products" class="product-item">
    <h3>{{product.name}}</h3>
    <p>Price: ${{product.price}}</p>
</div>
```

**Generated JavaScript:**
```javascript
// ngFor directive for div
if (this.products && Array.isArray(this.products)) {
    this.products.forEach((product, index) => {
        const divElement = document.createElement('div');
        divElement.className = 'product-item';
        
        const h3Element = document.createElement('h3');
        h3Element.textContent = this.product.name;
        divElement.appendChild(h3Element);
        
        const pElement = document.createElement('p');
        pElement.textContent = 'Price: $' + this.product.price;
        divElement.appendChild(pElement);
        
        this.shadowRoot.appendChild(divElement);
    });
}
```

### *ngIf Directive

The `*ngIf` directive conditionally renders HTML elements based on a boolean expression.

**Syntax:**
```html
<element *ngIf="condition">
    <!-- content to show if condition is true -->
</element>
```

**Example:**
```html
<div *ngIf="showEmptyMessage" class="empty-message">
    <p>No products available</p>
</div>

<button *ngIf="isAdmin">Add Product</button>
```

**Generated JavaScript:**
```javascript
// ngIf directive for div
if (this.showEmptyMessage) {
    const divElement = document.createElement('div');
    divElement.className = 'empty-message';
    
    const pElement = document.createElement('p');
    pElement.textContent = 'No products available';
    divElement.appendChild(pElement);
    
    this.shadowRoot.appendChild(divElement);
}

// ngIf directive for button
if (this.isAdmin) {
    const buttonElement = document.createElement('button');
    buttonElement.textContent = 'Add Product';
    this.shadowRoot.appendChild(buttonElement);
}
```

## Semantic Analysis

The compiler performs semantic analysis on Angular directives:

### *ngFor Semantic Checks:
- Verifies that the collection is an array type
- Validates the variable name syntax
- Ensures proper `let variable of collection` syntax

### *ngIf Semantic Checks:
- Validates the condition expression
- Ensures boolean-compatible conditions
- Supports string literals "true"/"false"

## Error Handling

The compiler provides semantic errors for:
- Invalid collection types in ngFor (non-array)
- Malformed variable names in ngFor
- Invalid condition expressions in ngIf
- Syntax errors in directive attributes

## Implementation Details

### Lexer Tokens
- `NG_FOR: '*ngFor'`
- `NG_IF: '*ngIf'`
- `OF: 'of'`

### Parser Rules
- `ngForDirective` - handles both element and self-closing tags
- `ngIfDirective` - handles both element and self-closing tags
- `ngForExpression` - parses `let variable of collection`
- `ngForAttribute` - parses `*ngFor="expression"`
- `ngIfAttribute` - parses `*ngIf="condition"`

### AST Nodes
- `NgForNode` - represents ngFor directive with element name, variable, collection, and children
- `NgIfNode` - represents ngIf directive with element name, condition, and children

### Code Generation
- Generates JavaScript forEach loops for ngFor
- Generates JavaScript if statements for ngIf
- Creates DOM elements dynamically
- Handles nested content within directives

## Usage Examples

### Complete Component Example
```typescript
@component({
    selector: "user-list",
    template: `
        <div class="users">
            <h1>Users</h1>
            
            <!-- Loop through users -->
            <div *ngFor="let user of users" class="user-card">
                <h3>{{user.name}}</h3>
                <p>Email: {{user.email}}</p>
                <span *ngIf="user.isActive" class="status active">Active</span>
                <span *ngIf="!user.isActive" class="status inactive">Inactive</span>
            </div>
            
            <!-- Conditional message -->
            <p *ngIf="users.length === 0">No users found</p>
            
            <!-- Conditional button -->
            <button *ngIf="canAddUsers">Add User</button>
        </div>
    `
})
```

### Self-closing Tags
```html
<img *ngFor="let image of images" src="{{image.url}}" alt="{{image.alt}}" />
<input *ngIf="showInput" type="text" placeholder="Enter text" />
```

## Limitations

- Currently supports only `let variable of collection` syntax for ngFor
- ngIf conditions must be simple expressions or component properties
- Nested directives are supported but complex expressions may need manual handling
- Template interpolation within directive content follows existing rules

## Future Enhancements

- Support for `trackBy` function in ngFor
- Support for `else` clause in ngIf
- Support for `*ngSwitch` directive
- Enhanced expression parsing for complex conditions
- Performance optimizations for large collections
