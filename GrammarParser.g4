parser grammar GrammarParser;

options { tokenVocab=MyLexer; }


program: (statement)+ ;

statement
    : (
        functionDeclaration
        | functionCall
        | variableDeclaration
        | variableAssign
        | value
        | html
        | return
        | ifStatement
        | importStatement
        | iterationStatement
        | componentStatement
        | classDeclaration
        | exportStatement
    )
    SEMICOLON?
    ;

return
    : RETURN value
    ;

ifBody
    : IF LPAREN (value ((DOUBLE_ASSIGN_ID|NOT_EQUAL|DOUBLE_ASSIGN) value)*)? RPAREN
    LBRACE (statement)* RBRACE
    ;

ifStatement
    : ifBody
    (ELSE ifBody)*
    (ELSE LBRACE (statement)* RBRACE)?
    ;

iterationStatement: DO statement WHILE LPAREN value RPAREN
    | WHILE LPAREN value RPAREN (((LBRACE|LBRACE_HTML) (statement)* (RBRACE|RBRACE_HTML)) | statement)
    | FOR LPAREN (value | variableDeclaration)?
    SEMICOLON value? SEMICOLON value? RPAREN statement
    | FOR LPAREN (value | variableDeclaration)
    IN value RPAREN statement
    ;

functionDeclaration
    : FUNCTION ID LPAREN (ID (COMMA ID)*)? RPAREN functionBody
    ;

functionBody
    : typeDefine? LBRACE statement* RBRACE
    | ((LPAREN (ID (COMMA ID)*)? RPAREN) | ID) typeDefine? ARROW value
    ;

functionCall
    : ID LPAREN (value (COMMA value)*)? RPAREN
    ;

variableDeclaration
    : (CONST | LET | VAR) variableAssign
    ;

variableAssign
    : ID typeDefine? (ASSIGN value)? ;

importStatement
    : IMPORT (defaultImport | namedImports) FROM STRING
    ;

defaultImport
    : ID
    ;

namedImports
    : (LBRACE | LBRACE_HTML ) importSpecifier (COMMA importSpecifier)* (RBRACE | RBRACE_HTML )
    ;

importSpecifier
    : ID (AS ID)?
    ;

exportStatement
    : EXPORT (classDeclaration|value|functionBody)
    ;

classDeclaration
    : CLASS ID classBody
    ;
classBody : (LBRACE) classBodyStatement* (RBRACE) ;

classBodyStatement
    : variableDeclaration
    | functionDeclaration
    ;

componentStatement
    : COMPONENT LPAREN LBRACE (SELECTOR COLON STRING COMMA)?
    TEMPLATE COLON (value)
    (COMMA ID COLON value)* RBRACE RPAREN
    ;

typeDefine
    : COLON ID (LBRACKET RBRACKET)?
    ;

asType
    : AS ID (LBRACKET RBRACKET)?
    ;

value
    : value binaryOp value
    | primaryValue (QMARK|EMARK)? asType?
    ;

primaryValue
    : NUMBER
    | STRING
    | functionCall
    | ID
    | LPAREN value RPAREN
    | object
    | array
    | arrayAccess
    | functionBody
    | increase_variable
    | decrease_variable
    | (BACKTICK|BACKTICK_HTML) html* (BACKTICK|BACKTICK_HTML)
    ;
binaryOp
    : DOUBLE_ASSIGN
    | DOUBLE_ASSIGN_ID
    | NOT_EQUAL
    | OR
    | AND
    | DOUBLE_QMARK
    | (RTAG (ASSIGN|DOUBLE_ASSIGN)?)
    | ((LTAG|LTAG_HTML) (ASSIGN|DOUBLE_ASSIGN)?)
    ;
operatorExpression
    : DOT value
    | comparison
    | DOUBLE_QMARK value
    | OR value
    | AND value
    ;

increase_variable
    : (ID PLUSPLUS) | (PLUSPLUS ID)
    ;

decrease_variable
    : (ID MINUSMINUS) | (MINUSMINUS ID)
    ;

comparison
    : (DOUBLE_ASSIGN_ID | DOUBLE_ASSIGN | NOT_EQUAL | (RTAG (ASSIGN|DOUBLE_ASSIGN)?) | ((LTAG|LTAG_HTML) (ASSIGN|DOUBLE_ASSIGN)?)) primaryValue
    ;

object
    : (LBRACE) ( pair (COMMA pair)*)? (RBRACE)
    ;
pair
    : ID COLON value
    ;

array
    : LBRACKET (value (COMMA value)*)? RBRACKET
    ;

arrayAccess
    : ID LBRACKET value RBRACKET
    ;

// html:
attribute
    : ID ASSIGN STRING
    ;

open_tag
    : (LTAG|LTAG_HTML) ID (attribute)* RTAG
    ;

close_tag
    : (LTAG|LTAG_HTML) SLASH ID RTAG
    ;

single_tag
    : (LTAG|LTAG_HTML) ID (attribute)* SLASH RTAG
    ;

html
    : open_tag (html)* close_tag
    | single_tag
    | (LBRACE_HTML statement* (RBRACE_HTML|(RBRACE RBRACE)))
    | TEXT_HTML
    ;
