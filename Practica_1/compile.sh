clear
echo -e "\n [compile.sh] Eliminado contenido class/ ... \n"
cd class
rm -rf *
read -n 1 -p "Pulsa una tecla ... "
echo -e "\n [compile.sh] Compilando Errors/ ... \n"
cd ../java/Errors
javac -d ../../class *.java
read -n 1 -p "Pulsa una tecla ... "
echo -e "\n [compile.sh] Compilando AST/ ... \n"
cd ../AST
javac -d ../../class -cp .. *.java
read -n 1 -p "Pulsa una tecla ... "
echo -e "\n [compile.sh] Ejecutando Parser/ ... \n"
cd ../Parser
java -cp ../../../CUP java_cup.Main Parser
read -n 1 -p "Pulsa una tecla ... "
echo -e "\n [compile.sh] Ejecutando Lexer/ ... \n"
cd ../Lexer
java -cp ../../../ JLex.Main Yylex
read -n 1 -p "Pulsa una tecla ... "
echo -e "\n [compile.sh] Compilando Main.java ... \n"
cd ..
javac -d ../class -cp ../../CUP:../class:. Main.java
