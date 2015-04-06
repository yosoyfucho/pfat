package Compiler;

public class TableEntryTrans {

	private String nameIS;
  	private String nameFS;
	private String event;

	public TableEntryTrans (String nameIS, String event, String nameFS)
	{
		this.nameIS = nameIS;
		this.nameFS = nameFS;
    	this.event = event;
	}

	public String getNameIS()
	{
		return nameIS;
	}

  	public String getNameFS()
	{
		return nameFS;
	}

	public String getEvent()
	{
		return event;
	}
}
