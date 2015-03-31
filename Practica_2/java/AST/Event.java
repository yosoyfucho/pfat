package AST;
import Errors.*;

/*
Event ::= IDENT:i   {:RESULT = new Event(i); :};

*/

public class Event
{
	public String i;

	public Event (String i)
	{
		this.i=i;
	}
}
