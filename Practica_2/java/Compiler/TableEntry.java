package Compiler;

public class TableEntry 
{
	private String name;
	private String type;
	private Boolean initia;
	private Object valor;

	public TableEntry (String name, String type, Boolean init, Object valor)
	{
		this.name = name;
		this.type = type;
		this.initia = init;
		this.valor = valor;
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

	public Object getValue()
	{
		return valor;
	}
}
