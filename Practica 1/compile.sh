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
echo -e "\ [compile.sh] probando ejemplos ... \n\n"
echo -e "\ [compile.sh] probando ejemplo 1 ... \n"
java -cp ../../CUP:../class Main ./ejemplos/Ejem1/Ejem1.stm
echo "\n"
echo -e "\ [compile.sh] probando ejemplo 2 ... \n"
java -cp ../../CUP:../class Main ./ejemplos/Ejem2/Ejem2.stm
echo "\n"
echo -e "\ [compile.sh] probando ejemplo 3 ... \n"
java -cp ../../CUP:../class Main ./ejemplos/Ejem3/Ejem3.stm
echo "\n"
echo -e "\ [compile.sh] probando ejemplo 4 ... \n"
java -cp ../../CUP:../class Main ./ejemplos/Ejem4/Ejem4.stm
echo "\n"
echo -e "\ [compile.sh] probando ejemplo 5 ... \n"
java -cp ../../CUP:../class Main ./ejemplos/Ejem5/Ejem5.stm
echo "\n"
echo -e "\ [compile.sh] probando ejemplo 6 ... \n"
java -cp ../../CUP:../class Main ./ejemplos/Ejem6/Ejem6.stm
echo "\n"
echo -e "\ [compile.sh] probando ejemplo 7 ... \n"
java -cp ../../CUP:../class Main ./ejemplos/Ejem7/Ejem7.stm
echo "\n"
echo -e "\ [compile.sh] probando ejemplo 8 ... \n"
java -cp ../../CUP:../class Main ./ejemplos/Ejem8/Ejem8.stm
echo "\n"
echo -e "\ [compile.sh] probando ejemplo 9 ... \n"
java -cp ../../CUP:../class Main ./ejemplos/Ejem9/Ejem9.stm
echo "\n"
echo -e "\ [compile.sh] probando ejemplo 10 ... \n"
java -cp ../../CUP:../class Main ./ejemplos/Ejem10/Ejem10.stm
echo "\n\n"
echo -e "\ [compile.sh] probando Errores Sintacticos ... \n\n"
echo -e "\ [compile.sh] probando Error Sintactico 1 ... \n"
java -cp ../../CUP:../class Main ./ejemplos/ErrSint1/errSint1.stm
echo "\n Es normal la captura de excepcion\n\n"
echo -e "\ [compile.sh] probando Error Sintactico 2 ... \n"
java -cp ../../CUP:../class Main ./ejemplos/ErrSint2/errSint2.stm
echo "\n Es normal la captura de excepion\n\n"
echo -e "\ [compile.sh] probando Error Sintactico 3 ... \n"
java -cp ../../CUP:../class Main ./ejemplos/ErrSint3/errSint3.stm
echo "\n Es normal la captura de excepion\n\n"
echo "\n\n"
echo -e "\ [compile.sh] probando Errores Lexicos ... \n\n"
echo -e "\ [compile.sh] probando Error Lexico 1 ... \n"
java -cp ../../CUP:../class Main ./ejemplos/ErrLex1/errLex1.stm
echo "\n Es normal la captura de excepcion\n\n"
