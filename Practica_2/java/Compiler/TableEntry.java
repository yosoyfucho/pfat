package Compiler;

public class TableEntry {

	private String name;
	private String type;

	public TableEntry (String name, String type)
	{
		this.name = name;
		this.type = type;
	}

	public String getName()
	{
		return name;
	}

	public String getType()
	{
		return type;
	}

}
