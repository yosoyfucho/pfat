package Compiler;

import java.util.*;
import java.io.*;
import Errors.*;


public class TransSymbolTable
{

	private static Vector<TableEntryTrans> transitions = new Vector<TableEntryTrans>();

/*
public TableEntryTrans search (String name, TableEntry e)

Funcion que comprueba que no existe un nombre para ambos estados  (nameIS y name FS) ya en la tabla (e)
Devuelve un objeto TableEntry con el objeto si existe
Devuelve null si no existe.

*/

	public static TableEntryTrans search (String nameIS, String event)
	{
		TableEntryTrans aux = null;
		int i = 0;
		while (i < transitions.size())
		{
			aux = transitions.get(i);
			if (aux.getNameIS().equals(nameIS) && aux.getEvent().equals(event))
			{
				break;
			}

			aux = null;
			i++;
		}
		return aux;
	}

/*
public static void newEntryTableTrans (String nameIS, String nameFS, String typeIS, String typeFS)

Función que agrega una nueva entrada a la tabla de transiciones, donde guardamos el nombre del estado
inicial y final y comprobamos que el estado inicial no sea final y que no exista otra transicion que
empiece y acabe igual.
En caso de que el estado inicial sea final mandará una excepción de tipo TranExpception
En caso de que la transición esté repetida mandará una excepción de tipo DoubleTranExc

*/
	public static void add (String nameIS, String event, String nameFS)	throws TranException,DoubleTranExc
	{
		TableEntryTrans aux = search(nameIS,event); // Revisar
		if(aux == null)
		{
			transitions.add(new TableEntryTrans(nameIS,event,nameFS));
		}
		else
		{
			throw new DoubleTranExc(nameIS + " " + nameFS);
		}
	}

}
