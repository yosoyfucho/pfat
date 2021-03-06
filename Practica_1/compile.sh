# Script compilar/ejecutar Practica_1

clear

echo -e "\n [compile.sh] Compilando package Errors/ ... \n"
javac -d class/ java/Errors/*.java
echo ""
read -n 1 -s -p ">>> Pulsa una tecla..."

clear

echo -e "\n [compile.sh] Compilando package AST/ ... \n"
javac -d class/ -cp java/ java/AST/*.java
echo ""
read -n 1 -s -p ">>> Pulsa una tecla..."

clear

echo -e "\n [compile.sh] Ejecutando java_cup.Main parser ... \n"
cd java/Parser
java -cp ../../../CUP/ java_cup.Main parser
echo ""
read -n 1 -s -p ">>> Pulsa una tecla..."

clear

cd ../..
echo -e "\n [compile.sh] Ejecutando JLex.Main Yylex ... \n"
cd java/Lexer
java -cp ../../../ JLex.Main Yylex
echo ""
read -n 1 -s -p ">>> Pulsa una tecla..."

clear

cd ../..
echo -e "\n [compile.sh] Compilando Main.java ... \n"
# Genera los .class de java/Parser | java/Lexer | Main.java
javac -d class/ -cp ../CUP/:java java/Main.java

clear
