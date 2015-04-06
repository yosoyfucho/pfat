package Compiler;

import java.util.*;
import java.io.*;
import Errors.*;


public class SymbolTable
{

	private static Vector<TableEntry> variables = new Vector<TableEntry>();

/*
public TableEntry checkTable (String name, String type,TableEntry e)

Funcion que comprueba que no existe un nombre (name) con un determinado tipo (type)
ya en la tabla (e)
Devuelve un objeto TableEntry con el objeto si existe
Devuelve null si no existe.

*/

	public static TableEntry search (String name, String type)
	{
		TableEntry aux = null;
		int i = 0;
		while (i < variables.size())
		{
			aux = variables.get(i);
			
			if (aux.getName().equals(name))
			{
				if( (type.equals("state") || type.equals("finalState")) && 
					(aux.getType().equals("state") || aux.getType().equals("finalState")) )
					break;
				if( (type.equals("local") || type.equals("output")) &&
					(aux.getType().equals("local") || aux.getType().equals("output")) )
					break;
				if( aux.getType().equals("event") )
					break;
			}

			aux = null;
			i++;
		}
		return aux;
	}



	public static TableEntry searchByName (String name)
	{
		TableEntry aux = null;
		int i = 0;
		while (i < variables.size())
		{
			aux = variables.get(i);
			
			if (aux.getName().equals(name))
			{
				break;
			}

			aux = null;
			i++;
		}
		return aux;
	}

/*
public static void newEntryTable (String name, int type)

Funcion que crea una nueva entrada en la tabla especificada por type y por
un nombre (name)
Si el nombre ya existe en la tabla arroja una excepcion

*/
	public static void add (String name, String tipo) throws DoubleDefExc
	{

		TableEntry newEntry = search(name,tipo);
		if (newEntry == null)
		{
			newEntry = new TableEntry(name,tipo);
			variables.add(newEntry);
		}
		else
		{
			throw new DoubleDefExc(name);
		}
	}

}