package AST;

import Compiler.*;
import Errors.*;
import java.io.*;

 /* ExpLog ::= CLOG:c   {:RESULT = new Bool(c); :} */

public class Bool implements ExpLog
{
	public boolean c;

	public Bool (boolean c)
	{
		this.c = c;
	}

	public void computeType() throws CompilerExc
	{
		if ( !(this.c == false || this.c == true) )
		{
			throw new AsigIncExc(""+this.c);
		}
	}

	public String generateCode() throws IOException
	{
		if(c)
		{
			return Boolean.toString(true);
		}
		else
		{
			return Boolean.toString(false);
		}
	}
}
