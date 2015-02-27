package AST;
import Errors.*;

public class Event implements Ident{
	public Ident i;

	public Event (Ident i)	{
		this.i=i;
	}	
}