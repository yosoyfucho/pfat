echo -e "\n [compile.sh] eliminado contenido class/ ... \n"
cd class
rm -r *
echo -e "\n [compile.sh] compilando Errors/ ... \n"
cd ../java/Errors
javac -d ../../class *.java
echo -e "\n [compile.sh] compilando AST/ ... \n"
cd ../AST
javac -d ../../class -cp .. *.java
echo -e "\n [compile.sh] ejecutando Parser/ ... \n"
cd ../Parser
java -cp ../../../CUP java_cup.Main Parser
echo -e "\n [compile.sh] ejecutando Lexer/ ... \n"
cd ../Lexer
java -cp ../../../ JLex.Main Yylex
echo -e "\n [compile.sh] compilando Main.java ... \n"
cd ..
javac -d ../class -cp ../../CUP:../class:. Main.java

