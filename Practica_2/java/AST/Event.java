package AST;
import Compiler.*;
import Errors.*;

/*
Event ::= IDENT:i   {:RESULT = new Event(i); :};

*/

public class Event
{
	public final String i;

	public Event (String i)
	{
		this.i=i;
	}

	public String computeType() throws CompilerExc
	{
		return this.i;
	}

	public String generateCode() throws IOException
	{
		return this.i;
	}


}
