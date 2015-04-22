package AST;
import Compiler.*;
import Errors.*;

/*
OutputEventDecl ::= OUTPUTS IdentList:il PC   {:RESULT = new OutputEventDecl(il); :};
*/

public class OutputEventDecl
{
	public final IdentList il;

	public OutputEventDecl (IdentList il)
	{
		this.il=il;
	}

	public void computeType() throws CompilerExc
	{

		String[] outputVar = il.computeType().split(",");

		for (int i=0; i<outputVar.length; i++)
		{
			if (SymbolTable.search(outputVar[i],"output")==null)
			{
				SymbolTable.add(outputVar[i],"output",false);
			}
			else
			{
				throw new DoubleDefExc(outputVar[i]);
			}
		}

	}

	public void generateCode(BufferedWritter w) throws IOException
	{
		w.write("public Event " + il.generateCode() + ";");
	}
}
