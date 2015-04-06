package Compiler;

public class TableEntry {

	private String name;
	private String type;
	private boolean initia;

	public TableEntry (String name, String type)
	{
		this.name = name;
		this.type = type;
		initia = false;
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
