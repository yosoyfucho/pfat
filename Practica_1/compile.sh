clear
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
cd ..
echo -e "\n [compile.sh] probando ejemplos ... \n\n"
echo -e "\n [compile.sh] probando ejemplo 1 ... \n"
java -cp ../CUP:class Main ../Ejemplos/Ejem1/ejem1.stm
echo -e "\n"
echo -e "\n [compile.sh] probando ejemplo 2 ... \n"
java -cp ../CUP:class Main ../Ejemplos/Ejem2/ejem2.stm
echo -e "\n"
echo -e "\n [compile.sh] probando ejemplo 3 ... \n"
java -cp ../CUP:class Main ../Ejemplos/Ejem3/ejem3.stm
echo -e "\n"
echo -e "\n [compile.sh] probando ejemplo 4 ... \n"
java -cp ../CUP:class Main ../Ejemplos/Ejem4/ejem4.stm
echo -e "\n"
echo -e "\n [compile.sh] probando ejemplo 5 ... \n"
java -cp ../CUP:class Main ../Ejemplos/Ejem5/ejem5.stm
echo -e "\n"
echo -e "\n [compile.sh] probando ejemplo 6 ... \n"
java -cp ../CUP:class Main ../Ejemplos/Ejem6/ejem6.stm
echo -e "\n"
echo -e "\n [compile.sh] probando ejemplo 7 ... \n"
java -cp ../CUP:class Main ../Ejemplos/Ejem7/ejem7.stm
echo -e "\n"
echo -e "\n [compile.sh] probando ejemplo 8 ... \n"
java -cp ../CUP:class Main ../Ejemplos/Ejem8/ejem8.stm
echo -e "\n"
echo -e "\n [compile.sh] probando ejemplo 9 ... \n"
java -cp ../CUP:class Main ../Ejemplos/Ejem9/ejem9.stm
echo -e "\n"
echo -e "\n [compile.sh] probando ejemplo 10 ... \n"
java -cp ../CUP:class Main ../Ejemplos/Ejem10/ejem10.stm
echo -e "\n\n"
echo -e "\n [compile.sh] probando Errores Sintacticos ... \n\n"
echo -e "\n [compile.sh] probando Error Sintactico 1 ... \n"
java -cp ../CUP:class Main ../Ejemplos/ErrSint1/errSint1.stm
echo -e "\n Es normal la captura de excepcion\n\n"
echo -e "\n [compile.sh] probando Error Sintactico 2 ... \n"
java -cp ../CUP:class Main ../Ejemplos/ErrSint2/errSint2.stm
echo -e "\n Es normal la captura de excepion\n\n"
echo -e "\n [compile.sh] probando Error Sintactico 3 ... \n"
java -cp ../CUP:class Main ../Ejemplos/ErrSint3/errSint3.stm
echo -e "\n Es normal la captura de excepion\n\n"
echo -e "\n\n"
echo -e "\n [compile.sh] probando Errores Lexicos ... \n\n"
echo -e "\n [compile.sh] probando Error Lexico 1 ... \n"
java -cp ../CUP:class Main ../Ejemplos/ErrLex1/errLex1.stm
echo -e "\n Es normal la captura de excepcion\n\n"
