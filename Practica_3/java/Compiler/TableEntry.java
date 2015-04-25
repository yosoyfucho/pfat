package Compiler;

public class TableEntry 
{
	private String name;
	private String type;
	private Boolean initia;

	public TableEntry (String name, String type, Boolean init)
	{
		this.name = name;
		this.type = type;
		this.initia = init;
	}

	public void setInit(boolean initia)
	{
		this.initia = initia;
	}

	public boolean getInit()
	{
		return initia;
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
