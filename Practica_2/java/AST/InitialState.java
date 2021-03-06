package AST;
import Compiler.*;
import Errors.*;

/*
InitialState ::= IDENT:i   {:RESULT = new InitialState(i); :};
*/

public class InitialState
{
	public final String i;

	public InitialState (String i)
	{
		this.i = i;
	}

	public String computeType () throws CompilerExc
	{
		return this.i;
	}
}
