package Compiler;

public class TableEntryTrans {

	private String nameIS;
  private String nameFS;
	private String event;
	//private String typeIS;

	//public TableEntryTrans (String nameIS, String event, String nameFS, String typeIS)
	public TableEntryTrans (String nameIS, String event, String nameFS)

	{
		this.nameIS = nameIS;
		this.nameFS = nameFS;
    this.event = event;
		//this.typeIS = typeIS;
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

/*
	public String getTypeIS()
	{
		return typeIS;
	}
	*/
}
