package Compiler;
import java.util.Vector;
import Errors.*;


public class SymbolTable()
{

	private static Vector<TableEntry> table = new Vector<TableEntry>();

	public static void newEntry(String name, String type) throws DoubleDefExc
	{

		TableEntry myTable = new SymbolTable.search(name, type);
		if (myTable == NULL)
		{
			myTable = new TableEntry(name);
			table.add(myTable);
		}
		else
		{
			throw new DoubleDefExc(name);
		}


	}

	public static TableEntry search(String name, String type)
	{
		TableEntry searchEntry = NULL;

		int i=0;
		while (i < table.size())
		{
			searchEntry = table.get(i);
			// Busca una variable con mismo nombre declarada
			if (searchEntry.getName().equals(name))
			{
				if (searchEntry.getType().equals(type))
				{
					break;
				}
				else
				{
					if (searchEntry.getType().equals("status"))
					{

					}
					if (searchEntry.getType().equals("final state"))
					{

					}
					if (searchEntry.getType().equals("inputs"))
					{

					}
					if (searchEntry.getType().equals("outputs"))
					{

					}
				}
			}
			searchEntry = NULL;
			i++;
		}

		return searchEntry;
	}

}
