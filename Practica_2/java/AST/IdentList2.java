package AST;
import Compiler.*;
import Errors.*;

/*
IdentList ::= IDENT:i COMA IdentList:il   {:RESULT = new IdentList2(i,il); :};
*/

public class IdentList2 implements IdentList
{

	public String i;
	public IdentList il;

	public IdentList2 (String i, IdentList il)
	{
		this.i=i;
		this.il = il;
	}

	public String computeType() throws CompilerExc
	{
		return this.i + "," + il.computeType();
	}

	public String generateArguments()
	{
		return i.generateArguments() ", " + il.generateArguments();
	}

	public void generateLocalVariables(BufferedWriter w) throws IOException
	{
		w.write(" " + i.generateLocalVariables() + ";");
		w.newLine();
		il.generateLocalVariables(w);
	}

	public void generateResult(BufferedWriter w) throws IOException
	{
		i.generateResult(w);
		il.generateResult(w);
	}
}
