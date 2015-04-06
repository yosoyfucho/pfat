# script ejecucion ejemplos Practica 2 - PFAT
clear

echo -e "\n--- Pruebas Practica 1 ---\n"

for ((i=1; i<=10; i++))
do
	echo -e "\n>>> Ejecutando ejem$i.stm ... \n"
	java -cp class/:../CUP/ Main ../Ejemplos/Ejem$i/ejem$i.stm
	echo ""
	read -n 1 -s -p ">>> Pulsa una tecla..."
	echo -e "\n\n---"
done

clear

echo -e "\n--- Pruebas Errores Sintacticos ---\n"

echo -e "\n>>> Ejecutando errLex1.stm ... \n"
java -cp class/:../CUP/ Main ../Ejemplos/ErrLex1/errLex1.stm
echo ""
read -n 1 -s -p ">>> Pulsa una tecla..."
echo -e "\n\n---"

clear

echo -e "\n--- Pruebas Errores Sintacticos ---\n"

for ((i=1; i<=3; i++))
do
	echo -e "\n>>> Ejecutando errSint$i.stm ... \n"
	java -cp class/:../CUP/ Main ../Ejemplos/ErrSint$i/errSint$i.stm
	echo ""
	read -n 1 -s -p ">>> Pulsa una tecla..."
	echo -e "\n\n---"
done

clear
