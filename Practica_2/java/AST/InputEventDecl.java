package AST;
import Compiler.*;
import Errors.*;
import java.io.*;

/*
InputEventDecl ::= INPUTS IdentList:il PC   {:RESULT = new InputEventDecl(il); :};
*/

public class InputEventDecl
{
	public final IdentList il;

	public InputEventDecl (IdentList il)
	{
		this.il=il;
	}

	public void computeType() throws CompilerExc
	{
		String[] eventos = il.computeType().split(",");

		for (int i=0;i<eventos.length;i++)
		{
			if (SymbolTable.search(eventos[i],"event")==null)
			{
				SymbolTable.add(eventos[i],"event",false);
			}
			else
			{
				throw new DoubleDefExc(eventos[i]);
			}
		}
	}

	public void generateCode(BufferedWriter w) throws IOException
	{
		String[] events = il.generateCode().split(",");

		for (String inputEvent : events)
		{
			w.write("public String " + inputEvent + " = \"" + inputEvent + "\";");
			w.newLine();
		}
	}
}
