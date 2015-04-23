package AST;
import Compiler.*;
import Errors.*;
import java.io.*;

/*
FinalState ::= IDENT:i   {:RESULT = new FinalState(i); :};
*/

public class FinalState
{
	public final String i;

	public FinalState (String i)
	{
		this.i = i;
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
