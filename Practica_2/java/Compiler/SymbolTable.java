package Compiler;

import java.util.*;
import java.io.*;
import Errors.*;


public class SymbolTable
{
	private static Vector<TableEntry> variables = new Vector<TableEntry>();

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

	public static String searchByType (String type)
	{
		TableEntry aux = null;
		int i = 0;
		String output = "";
		while (i < variables.size())
		{
			aux = variables.get(i);

			if (aux.getType().equals(type))
			{
				if (output=="")
				{
					output = aux.getName();
				}
				else
				{
					output = output + "," + aux.getName();
				}
			}

			aux = null;
			i++;
		}
		return output;
	}

	public static TableEntry searchLocalOrOutputByName (String name)
	{
		TableEntry aux = null;
		int i = 0;
		while (i < variables.size())
		{
			aux = variables.get(i);

			if (aux.getName().equals(name) && 
				(aux.getType().equals("local") || aux.getType().equals("output")) )
			{
				break;
			}

			aux = null;
			i++;
		}
		return aux;
	}

	public static void add (String name, String tipo, boolean init) throws DoubleDefExc
	{
		TableEntry newEntry = search(name,tipo);
		if (newEntry == null)
		{
			newEntry = new TableEntry(name,tipo,init);

			variables.add(newEntry);
		}
		else
		{
			throw new DoubleDefExc(name);
		}
	}
}
