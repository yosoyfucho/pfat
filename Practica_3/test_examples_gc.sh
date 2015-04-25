# script ejecucion ejemplos Practica 2 - PFAT
clear

echo -e "\n--- Pruebas Practica 2 ---\n"

for ((i=1; i<=10; i++))
do
	echo -e "\n>>> Ejecutando ejem$i.stm ... \n"
	java -cp class/:../CUP/ Main ../Ejemplos/Ejem$i/ejem$i.stm gcode$i
	echo ""
	read -n 1 -s -p ">>> Pulsa una tecla..."
	echo -e "\n\n---"
done