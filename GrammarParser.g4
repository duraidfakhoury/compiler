parser grammar GrammarParser;

options { tokenVocab=MyLexer; }

program
    : statements+=statement+                        #programRule
    ;

statement
    : decl=functionDeclaration SEMICOLON?           #stmtFunctionDecl
    | call=functionCall SEMICOLON?                  #stmtFunctionCall
    | vardecl=variableDeclaration SEMICOLON?        #stmtVarDecl
    | varassign=variableAssign SEMICOLON?           #stmtVarAssign
    | val=value SEMICOLON?                          #stmtValue
    | h=html SEMICOLON?                             #stmtHtml
    | ret=return SEMICOLON?                         #stmtReturn
    | ifstmt=ifStatement                            #stmtIf
    | imp=importStatement                           #stmtImport
    | loop=iterationStatement                       #stmtIteration
    | comp=componentStatement                       #stmtComponent
    | classDecl=classDeclaration                    #stmtClass
    | exp=exportStatement                           #stmtExport
    | typeDecl=typeDeclaration SEMICOLON?           #stmtTypeDecl
    ;

return
    : RETURN expr=value                             #returnRule
    ;

ifBody
    : IF LPAREN left=value (condOps+=(DOUBLE_ASSIGN_ID|NOT_EQUAL|DOUBLE_ASSIGN) right+=value)* RPAREN
      LBRACE stmts+=statement* RBRACE               #ifBodyRule
    ;

ifStatement
    : ifBlocks+=ifBody
      (ELSE elseIfs+=ifBody)*
      (ELSE elseBlock=LBRACE elseStmts+=statement* RBRACE)?  #ifStatementRule
    ;

iterationStatement
    : DO LBRACE body+=statement* RBRACE WHILE LPAREN cond=value RPAREN   #doWhileLoop
    | WHILE LPAREN cond=value RPAREN
        (block=(LBRACE|LBRACE_HTML) stmts+=statement* (RBRACE|RBRACE_HTML) | single=statement)  #whileLoop
    | FOR LPAREN initVal=variableAssign? SEMICOLON cond=value? SEMICOLON step=value? RPAREN
        LBRACE body+=statement* RBRACE                                   #forLoopAssign
    | FOR LPAREN initDecl=variableDeclaration SEMICOLON cond=value? SEMICOLON step=value? RPAREN
        LBRACE body+=statement* RBRACE                                   #forLoopDecl
    | FOR LPAREN iterVal=value IN iterable=value RPAREN
        LBRACE body+=statement* RBRACE                                   #forInLoopVal
    | FOR LPAREN iterDecl=variableDeclaration IN iterable=value RPAREN
        LBRACE body+=statement* RBRACE                                   #forInLoopDecl
    ;

functionDeclaration
    : FUNCTION funcName=ID LPAREN (params+=ID (COMMA params+=ID)*)? RPAREN body=functionBody   #functionDeclarationRule
    ;

functionBody
    : type=typeDefine? LBRACE stmts+=statement* RBRACE         #functionBlock
    | ((LPAREN (params+=ID (COMMA params+=ID)*)? RPAREN) | singleParam=ID) type=typeDefine? ARROW expr=value  #functionArrow
    ;

functionCall
    : funcName=ID LPAREN (args+=value (COMMA args+=value)*)? RPAREN   #functionCallRule
    ;

variableDeclaration
    : kind=(CONST | LET | VAR) assign=variableAssign          #varDeclarationRule
    ;

variableAssign
    : varName=ID type=typeDefine? (ASSIGN expr=value)?        #varAssignRule
    ;

importStatement
    : IMPORT (def=defaultImport | named=namedImports) FROM path=STRING   #importRule
    ;

defaultImport
    : id=ID                                                  #defaultImportRule
    ;

namedImports
    : (LBRACE | LBRACE_HTML) imports+=importSpecifier (COMMA imports+=importSpecifier)* (RBRACE | RBRACE_HTML ) #namedImportsRule
    ;

importSpecifier
    : name=ID (AS alias=ID)?                                 #importSpecifierRule
    ;

exportStatement
    : EXPORT (cls=classDeclaration | val=value | func=functionBody) #exportRule
    ;

classDeclaration
    : CLASS name=ID body=classBody                           #classDeclarationRule
    ;

classBody
    : LBRACE stmts+=classBodyStatement* RBRACE               #classBodyRule
    ;

classBodyStatement
    : var=variableDeclaration                                #classVarDecl
    | func=functionDeclaration                               #classFuncDecl
    ;

componentStatement
    : COMPONENT LPAREN LBRACE
        (SELECTOR COLON selector=STRING COMMA)?
        TEMPLATE COLON template=value
        (COMMA keys+=ID COLON vals+=value)*
      RBRACE RPAREN                                          #componentRule
    ;



typeDefine
    : COLON type=ID (LBRACKET RBRACKET)?                     #typeDefineRule
    ;

typeDeclaration
    : TYPE name=ID ASSIGN typeValue=typeDeclarationValue     #typeDeclarationRule
    ;

typeDeclarationValue
    : type=ID (LBRACKET RBRACKET)?                          #typeSimple
    | obj=typeObject                                        #typeObjectAssign
    ;

typeObject
    : LBRACE typeMembers+=typeMember (typeMembers+=typeMember)* RBRACE #typeObjectRule
    ;

typeMember
    : name=ID COLON type=typeDeclarationValue               #typeMemberRule
    ;

asType
    : AS type=ID (LBRACKET RBRACKET)?                        #asTypeRule
    ;

value
    : left=value op=binaryOp right=value                     #binaryValue
    | pv=primaryValue (qm=(QMARK|EMARK))? type=asType?       #primaryValueExpr
    | left=value DOT right=value                             #propertyAccessValue
    | left=value LPAREN args+=value (COMMA args+=value)* RPAREN #methodCallValue
    | params+=ID (COMMA params+=ID)* ARROW body=value        #arrowFunctionValue
    ;

primaryValue
    : num=NUMBER                                             #numberValue
    | str=STRING                                             #stringValue
    | call=functionCall                                      #callValue
    | TRUE                                                   #trueValue
    | FALSE                                                  #falseValue
    | id=ID                                                  #idValue
    | LPAREN inner=value RPAREN                              #parenValue
    | obj=object                                             #objectValue
    | arr=array                                              #arrayValue
    | access=arrayAccess                                     #arrayAccessValue
    | body=functionBody                                      #functionValue
    | inc=increase_variable                                  #incValue
    | dec=decrease_variable                                  #decValue
    | EMARK right=value                                      #negationValue
    | bt=(BACKTICK|BACKTICK_HTML) content+=html* (BACKTICK|BACKTICK_HTML) #templateValue
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
    | PLUS
    | MINUS
    | MULT
    | SLASH
    ;



increase_variable
    : id=ID PLUSPLUS
    | PLUSPLUS id=ID
    ;

decrease_variable
    : id=ID MINUSMINUS
    | MINUSMINUS id=ID
    ;

comparison
    : DOUBLE_ASSIGN_ID   right=value   #idEqComparison
    | DOUBLE_ASSIGN      right=value   #eqComparison
    | NOT_EQUAL          right=value   #neqComparison
    | RTAG (ASSIGN|DOUBLE_ASSIGN)? right=value   #rtagComparison
    | (LTAG|LTAG_HTML) (ASSIGN|DOUBLE_ASSIGN)? right=value  #ltagComparison
    ;


object
    : LBRACE pairs+=pair (COMMA pairs+=pair)*? RBRACE         #objectRule
    ;

pair
    : key=ID COLON val=value                                 #pairRule
    ;

array
    : LBRACKET (elems+=value (COMMA elems+=value)*)? RBRACKET   #arrayRule
    ;

arrayAccess
    : arr=ID LBRACKET idx=value RBRACKET                      #arrayAccessRule
    ;

htmlElementName
    : DIV
    | P
    | H1 | H2 | H3 | H4 | H5 | H6
    | BUTTON
    | SPAN
    | A
    | IMG
    | INPUT
    | FORM
    | ID
    ;

open_tag
    : (LTAG|LTAG_HTML) name=htmlElementName attributes* RTAG              #openTagRule
    ;

attributes
    : attribute+
    ;

attribute
    : NG_FOR ASSIGN BACKTICK LET varName=ID OF collection=ID BACKTICK                #ngForAttributeRule
    | NG_IF ASSIGN BACKTICK condition=value BACKTICK                                 #ngIfAttributeRule
    | name=ID ASSIGN val=attributeValue                                               #regularAttribute
    ;

attributeValue
    : STRING
    | interpolation
    ;

interpolation
    : (LBRACE_HTML | (LBRACE LBRACE)) expr=value (RBRACE_HTML | (RBRACE RBRACE))                           #simpleInterpolation
    | (LBRACE_HTML | (LBRACE LBRACE)) LBRACE_HTML nested+=html* (RBRACE_HTML | (RBRACE RBRACE)) #nestedTemplateInterpolation
    ;

close_tag
    : (LTAG|LTAG_HTML) SLASH name=htmlElementName RTAG        #closeTagRule
    ;

single_tag
    : (LTAG|LTAG_HTML) name=htmlElementName SLASH RTAG        #singleTagRule
    ;

html
    : open=open_tag inner+=html* close=close_tag              #htmlElement
    | single=single_tag                                       #htmlSingle
    | block=LBRACE_HTML stmts+=statement* (RBRACE_HTML|(RBRACE RBRACE)) #htmlBlock
    | text=TEXT_HTML                                          #htmlText
    ;