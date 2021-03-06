package AST;
import Compiler.*;
import Errors.*;
import java.io.*;

/*
IdentList ::= IDENT:i   {:RESULT = new IdentList1(i); :}
*/
public class IdentList1 implements IdentList
{

	public String i;

	public IdentList1 (String i)
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
