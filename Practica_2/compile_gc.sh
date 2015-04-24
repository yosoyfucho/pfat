for ((i=1; i<=10; i++))
do
	echo -e "\n>>> Ejecutando ejem$i.stm ... \n"
	javac -d class -cp java/:../CUP ejem$i.java
	echo ""
	read -n 1 -s -p ">>> Pulsa una tecla..."
	echo -e "\n\n---"
done

clear