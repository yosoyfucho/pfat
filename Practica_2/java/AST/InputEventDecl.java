package AST;
import Compiler.*;
import Errors.*;

/*
InputEventDecl ::= INPUTS IdentList:il PC   {:RESULT = new InputEventDecl(il); :};
*/

public class InputEventDecl
{
	public final IdentList il;
	public final String tipo = "inputs";

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

	public void generateCode(BufferedWritter w) throws IOException
	{
		w.write("public Event " + il.generateCode() + ";");
	}


}
