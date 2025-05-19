package Classes;

import gen.GrammarParser;
import gen.GrammarParserBaseVisitor;


public class ASTBuilder extends GrammarParserBaseVisitor<ASTNode> {


    @Override
    public ASTNode visitProgram(GrammarParser.ProgramContext ctx) {
        ProgramNode programNode = new ProgramNode();
        for (var statementCtx : ctx.statement()) {
            programNode.statements.add(visit(statementCtx));
        }
        return programNode;
    }

    @Override
    public ASTNode visitStatement(GrammarParser.StatementContext ctx) {
        if (ctx.functionDeclaration() != null) {
            return visit(ctx.functionDeclaration());
        } else if (ctx.functionCall() != null) {
            return visit(ctx.functionCall());
        } else if (ctx.variableDeclaration() != null) {
            return visit(ctx.variableDeclaration());
        } else if (ctx.return_() != null) {
            return visit(ctx.return_());
        } else if (ctx.ifStatement() != null) {
            return visit(ctx.ifStatement());
        } else if (ctx.importStatement() != null) {
            return visit(ctx.importStatement());
        } else if (ctx.iterationStatement() != null) {
            return visit(ctx.iterationStatement());
        } else if (ctx.html() != null) {
            return visit(ctx.html());
        } else if (ctx.value() != null) {
            return visit(ctx.value());
        } else if (ctx.componentStatement() != null) {
            return visit(ctx.componentStatement());
        }

        return new EmptyNode(); // Default fallback
    }

    @Override
    public ASTNode visitComponentStatement(GrammarParser.ComponentStatementContext ctx) {
        ComponentNode componentNode = new ComponentNode();

        // معالجة الخصائص مثل `selector` و `template`
        if (ctx.SELECTOR() != null) {
            componentNode.selector = ctx.STRING().getText();
        }
        if (ctx.TEMPLATE() != null) {
            componentNode.template = ctx.STRING().getText();
        }

        // معالجة الخصائص الإضافية داخل القاعدة
        for (int i = 2; i < ctx.ID().size(); i++) {
            String propertyName = ctx.ID(i).getText();
            String propertyValue = ctx.value(i - 2).getText();
            componentNode.properties.put(propertyName, propertyValue);
        }

        return componentNode;
    }


    @Override
    public ASTNode visitFunctionDeclaration(GrammarParser.FunctionDeclarationContext ctx) {
        FunctionDeclarationNode functionNode = new FunctionDeclarationNode();
        functionNode.functionName = ctx.ID(0).getText();
        if (ctx.ID() != null && ctx.ID().size() > 1) {
            for (int i = 1; i < ctx.ID().size(); i++) {
                functionNode.parameters.add(ctx.ID(i).getText());
            }
        }
        functionNode.body = visit(ctx.functionBody());
        return functionNode;
    }

    @Override
    public ASTNode visitFunctionBody(GrammarParser.FunctionBodyContext ctx) {
        if (ctx.ARROW() != null) {
            // Arrow function
            // Assuming visit(ctx.value()) returns a ValueNode
            ValueNode valueNode = (ValueNode) visit(ctx.value()); // Cast it to ValueNode
            return valueNode;
        } else {
            // Block body
            ProgramNode bodyNode = new ProgramNode();
            for (var statementCtx : ctx.statement()) {
                bodyNode.statements.add(visit(statementCtx));  // Add the visited statement
            }
            return bodyNode;
        }
    }


    @Override
    public ASTNode visitFunctionCall(GrammarParser.FunctionCallContext ctx) {
        FunctionCallNode callNode = new FunctionCallNode();
        callNode.functionName = ctx.ID().getText();
        if (ctx.value() != null) {
            for (var valueCtx : ctx.value()) {
                callNode.arguments.add(visit(valueCtx));
            }
        }
        return callNode;
    }

    @Override
    public ASTNode visitVariableDeclaration(GrammarParser.VariableDeclarationContext ctx) {
        // Extract the declaration type (CONST, LET, VAR)
        String declarationType = ctx.getStart().getText();

        // Access the variableAssign rule
        GrammarParser.VariableAssignContext assignCtx = ctx.variableAssign();

        // Extract the variable name (ID)
        String variableName = assignCtx.ID().getText();

        // Handle optional typeDefine
        String type = (assignCtx.typeDefine() != null) ? assignCtx.typeDefine().getText() : null;

        // Handle optional value assignment
        ASTNode value = (assignCtx.value() != null) ? visit(assignCtx.value()) : null;

        // Create a new VariableDeclarationNode
        VariableDeclarationNode varNode = new VariableDeclarationNode(declarationType, variableName, type, value);

        return varNode;
    }



    @Override
    public ASTNode visitIfStatement(GrammarParser.IfStatementContext ctx) {
        IfStatementNode ifNode = new IfStatementNode();

        // Process main "if" block
        GrammarParser.IfBodyContext ifBodyCtx = ctx.ifBody(0);
        if (ifBodyCtx != null && ifBodyCtx.value() != null) {
            ifNode.condition = visit(ifBodyCtx.value(0)); // Visit the first value in the list
        }
        ifNode.thenBranch = new ProgramNode();
        for (GrammarParser.StatementContext stmtCtx : ifBodyCtx.statement()) {
            ifNode.thenBranch.statements.add(visit(stmtCtx)); // Add each statement
        }

        // Process "else if" blocks
        for (int i = 1; i < ctx.ifBody().size(); i++) {
            GrammarParser.IfBodyContext elseIfBodyCtx = ctx.ifBody(i);
            IfStatementNode elseIfNode = new IfStatementNode();
            if (elseIfBodyCtx.value() != null) {
                elseIfNode.condition = visit(elseIfBodyCtx.value(0)); // Visit the first value
            }
            elseIfNode.thenBranch = new ProgramNode();
            for (GrammarParser.StatementContext stmtCtx : elseIfBodyCtx.statement()) {
                elseIfNode.thenBranch.statements.add(visit(stmtCtx));
            }
            ifNode.elseBranch = elseIfNode; // Link to elseBranch
        }

        // Process "else" block
        if (ctx.ELSE() != null && ctx.statement() != null) {
            ProgramNode elseBranch = new ProgramNode();
            for (GrammarParser.StatementContext stmtCtx : ctx.statement()) {
                elseBranch.statements.add(visit(stmtCtx));
            }
            ifNode.elseBranch = elseBranch;
        }

        return ifNode;
    }





    @Override
    public ASTNode visitReturn(GrammarParser.ReturnContext ctx) {
        ReturnNode returnNode = new ReturnNode();
        returnNode.value = visit(ctx.value());
        return returnNode;
    }

    @Override
    public ASTNode visitImportStatement(GrammarParser.ImportStatementContext ctx) {
        ImportNode importNode = new ImportNode();
        if (ctx.STRING() != null) {
            importNode.source = ctx.STRING().getText();
        }
        if (ctx.LBRACE() != null) {
            for (var idCtx : ctx.ID()) {
                importNode.imports.add(idCtx.getText());
            }
        }
        return importNode;
    }


    @Override
    public ASTNode visitIterationStatement(GrammarParser.IterationStatementContext ctx) {
        if (ctx.FOR() != null) {
            ForLoopNode forNode = new ForLoopNode();

            // Handle initializer (variable declaration in the 'for' loop)
            if (ctx.variableDeclaration() != null) {
                forNode.initializer = visit(ctx.variableDeclaration());
            }

            // Handle condition (value(0) for the 'for' loop condition)
            if (ctx.value(0) != null) {
                forNode.condition = visit(ctx.value(0));
            }

            // Handle update (value(1) for the loop update)
            if (ctx.value(1) != null) {
                forNode.update = visit(ctx.value(1));
            }

            // Handle the body (loop body statements)
            if (ctx.statement() != null) {
                for (GrammarParser.StatementContext statementContext : ctx.statement()) {
                    forNode.body.add(visit(statementContext));
                }
            }

            return forNode;

        } else if (ctx.WHILE() != null) {
            WhileLoopNode whileNode = new WhileLoopNode();

            // Handle condition
            if (ctx.value(0) != null) {
                whileNode.condition = visit(ctx.value(0));
            }

            // Handle the body
            if (ctx.statement() != null) {
                for (GrammarParser.StatementContext statementContext : ctx.statement()) {
                    whileNode.body.add(visit(statementContext));
                }
            }

            return whileNode;

        } else if (ctx.DO() != null) {
            DoWhileLoopNode doWhileNode = new DoWhileLoopNode();

            // Handle the body first, as it's executed at least once
            if (ctx.statement() != null) {
                for (GrammarParser.StatementContext statementContext : ctx.statement()) {
                    doWhileNode.addStatementToBody(visit(statementContext)); // Use addStatementToBody
                }
            }

            // Handle the condition
            if (ctx.value(0) != null) {
                doWhileNode.condition = visit(ctx.value(0));
            }

            return doWhileNode;
        }

        return new EmptyNode();  // In case no iteration statement is matched
    }

    @Override
    public ASTNode visitArray(GrammarParser.ArrayContext ctx) {
        // Create a node for the array
        ArrayNode arrayNode = new ArrayNode();

        // Iterate through all values in the array
        for (GrammarParser.ValueContext valueCtx : ctx.value()) {
            ASTNode childNode = visit(valueCtx); // Visit each value
            arrayNode.addElement(childNode);    // Add it to the ArrayNode
        }

        return arrayNode;
    }



    @Override
    public ASTNode visitValue(GrammarParser.ValueContext ctx) {
        if (ctx.primaryValue() != null) {
            return visit(ctx.primaryValue());
        } else if (ctx.operatorExpression() != null) {
            BinaryExpressionNode binaryNode = new BinaryExpressionNode();
            binaryNode.left = visit(ctx.primaryValue());
            binaryNode.operator = ctx.operatorExpression().getStart().getText();
            binaryNode.right = visit(ctx.operatorExpression().value());
            return binaryNode;
        }
        return new EmptyNode();
    }

    @Override
    public ASTNode visitOperatorExpression(GrammarParser.OperatorExpressionContext ctx) {
        if (ctx.DOT() != null) {
            // This means we're accessing a property or method like .map
            ASTNode leftOperand = visit(ctx.value());  // This will be the object (e.g., `products`)
            ASTNode rightOperand = visit(ctx.value()); // This will be the function call (e.g., `map`)

            // If the function is map, handle it specifically
            if (rightOperand instanceof FunctionCallNode) {
                FunctionCallNode functionCall = (FunctionCallNode) rightOperand;
                if ("map".equals(functionCall.functionName)) {
                    // Create MapNode to represent the map operation
                    return new MapNode(leftOperand, functionCall);
                }
            }

            // Handle other operators (like AND, OR, etc.)
            // You can extend this with other logic as needed
        }
        return super.visitOperatorExpression(ctx);
    }


    @Override
    public ASTNode visitPrimaryValue(GrammarParser.PrimaryValueContext ctx) {
        if (ctx.NUMBER() != null) {
            // Create a ValueNode for a number
            return new ValueNode(Double.parseDouble(ctx.NUMBER().getText()));
        } else if (ctx.STRING() != null) {
            // Create a ValueNode for a string
            return new ValueNode(ctx.STRING().getText());
        } else if (ctx.ID() != null) {
            // Create an IdentifierNode for an identifier
            return new IdentifierNode(ctx.ID().getText()); // Pass the name to the constructor
        } else if (ctx.LPAREN() != null) {
            // Handle parentheses and visit the inner value
            return visit(ctx.value());
        } else if (ctx.object() != null) {
            // Handle object and visit it
            return visit(ctx.object());
        } else if (ctx.array() != null) {
            return visitArray(ctx.array());
        } else if (ctx.functionCall() != null) {
            // Handle function call and visit it
            return visit(ctx.functionCall());
        }
        return new EmptyNode();
    }

    @Override
    public ASTNode visitObject(GrammarParser.ObjectContext ctx) {
        ObjectNode objectNode = new ObjectNode();  // Create a new ObjectNode

        // Loop through each pair in the object
        for (GrammarParser.PairContext pairCtx : ctx.pair()) {
            String key = pairCtx.ID().getText();  // Extract the key (String)
            ASTNode valueNode = visit(pairCtx.value());  // Visit the value and create the corresponding ASTNode

            PropertyNode propertyNode = new PropertyNode(key, valueNode);  // Create a PropertyNode
            objectNode.properties.add(propertyNode);  // Add the property to the ObjectNode
        }

        return objectNode;  // Return the complete ObjectNode
    }





    @Override
    public ASTNode visitHtml(GrammarParser.HtmlContext ctx) {
        // Create an HtmlNode with the tagName from the open tag
        HtmlNode htmlNode = new HtmlNode(ctx.open_tag().ID().getText());

        // If there are attributes in the open tag, process them
        if (ctx.open_tag().attribute() != null) {
            for (var attr : ctx.open_tag().attribute()) {
                String attributeName = attr.ID().getText();
                String attributeValue = attr.STRING().getText();
                htmlNode.attributes.put(attributeName, attributeValue);  // Store the attributes in the map
            }
        }

        // If there are child elements (nested HTML elements), visit them
        if (ctx.html() != null) {
            for (var child : ctx.html()) {
                htmlNode.children.add(visit(child));  // Add the visited child HTML node
            }
        }

        // Check if the tag is self-closing (single tag) and set the flag
        htmlNode.isSelfClosing = ctx.single_tag() != null;

        // If there's text content inside the HTML tag, set it
        if (ctx.TEXT_HTML() != null) {
            htmlNode.setTextContent(ctx.TEXT_HTML().getText());
        }

        return htmlNode;
    }

}

