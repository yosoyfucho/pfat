# Script compilar/ejecutar Practica_2

clear

echo -e "\n [compile.sh] Eliminando class/ ... \n"
cd class
pwd
echo -e "\n va a borrar los siguientes archivos \n"
echo ""
ls -al

read -n 1 -s -p ">>> Pulsa una tecla para borrar o ctrl+c para salir..."
rm -r -f *
cd ..
clear

echo -e "\n [compile.sh] Compilando package Errors/ ... \n"
javac -d class/ java/Errors/*.java
echo ""
read -n 1 -s -p ">>> Pulsa una tecla..."

clear

echo -e "\n [compile.sh] Compilando package Compiler/ ... \n"
javac -d class/ -cp java/ java/Compiler/*.java
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
echo -e "\n [compile.sh] Compilando package GeneratedCodeLib/ ... \n"
javac -d class/ -cp ../CUP/:java java/GeneratedCodeLib/*.java
echo ""
read -n 1 -s -p ">>> Pulsa una tecla..."

clear

echo -e "\n [compile.sh] Compilando Main.java ... \n"
# Genera los .class de java/Parser | java/Lexer | Main.java
javac -d class/ -cp ../CUP/:java java/Main.java
echo ""
read -n 1 -s -p ">>> Pulsa una tecla..."

clear
