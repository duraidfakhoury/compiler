lexer grammar MyLexer;

IMPORT: 'import';
CLASS: 'class';
CONST: 'const';
LET: 'let';
VAR: 'var';
FUNCTION: 'function';
RETURN: 'return';
IF: 'if';
ELSE: 'else';
FOR: 'for';
WHILE: 'while';
ARROW: '=>';
FROM: 'from';
DO: 'do';
IN: 'in';
EXPORT: 'export';
SELECTOR: 'selector';
COMPONENT: '@component';
TEMPLATE: 'template';
AS: 'as';

fragment ESC
    : '\\'[nt"]
    ;

ID: [a-zA-Z_][a-zA-Z0-9_]*;
NUMBER: [0-9]+ ('.' [0-9]+)?;
STRING: ('"' (ESC | ~["\\])* '"' | '\'' (ESC | ~['\\])* '\'');
ASSIGN: '=';
PLUS:'+';
MINUS:'-';
MULT:'*';
DIVID:'/';
DOUBLE_ASSIGN: '==';
NOT_EQUAL: '!==';
DOUBLE_ASSIGN_ID: '===';
LBRACE: '{';
RBRACE: '}';
LBRACKET: '[';
RBRACKET: ']';
COLON: ':';
COMMA: ',';
SEMICOLON: ';';
DOT: '.';
WHITESPACE: [ \t\r\n]+ -> skip;
COMMENT: '//' (~[\n\t]*)->skip;
LPAREN: '(';
RPAREN: ')';
LTAG: '<';
RTAG: '>'->pushMode(TEXT_HTML_MODE);
SLASH: '/';
PLUSPLUS: '++';
MINUSMINUS: '--';
QMARK: '?';
EMARK: '!';
DOUBLE_QMARK: '??';
OR: '||';
AND: '&&';
BACKTICK: '`';

mode TEXT_HTML_MODE;
LTAG_HTML: '<'->popMode;
LBRACE_HTML: '{{'->popMode;
RBRACE_HTML: '}}'->popMode;
BACKTICK_HTML: '`'->popMode;
TEXT_HTML: (ESC | ~[`<>{}\t\r\n]+);
WS: [ \n\t\r]->skip;

// HTML keywords
DIV: 'div';
P: 'p';
H1: 'h1';
H2: 'h2';
H3: 'h3';
H4: 'h4';
H5: 'h5';
H6: 'h6';
BUTTON: 'button';
SPAN: 'span';
A: 'a';
IMG: 'img';
INPUT: 'input';
FORM: 'form';
// ... أضف ما تريد من
