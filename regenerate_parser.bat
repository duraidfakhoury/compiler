@echo off
echo Regenerating ANTLR parser files...
java -jar antlr-4.13.2-complete.jar -Dlanguage=Java GrammarParser.g4 MyLexer.g4 -o gen
echo Parser files regenerated!
pause
