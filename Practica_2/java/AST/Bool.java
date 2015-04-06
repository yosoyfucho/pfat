package AST;
import Compiler.*;

import Errors.*;
 /*
ExpLog ::= CLOG:c   {:RESULT = new Bool(c); :}
*/
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
			throw new VarNoDefExc();
		}
	}
}
