package AST;
import Compiler.*;
import Errors.*;
import java.io.*;

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

	public String computeType() throws CompilerExc
	{
		return this.i;
	}

	public String generateCode() throws IOException
	{
		return this.i+"_s";	
	}
}
