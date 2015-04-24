package AST;

import Compiler.*;
import Errors.*;
import java.io.*;

/*
OutputEventDecl ::= OUTPUTS IdentList:il PC   {:RESULT = new OutputEventDecl(il); :};
*/

public class OutputEventDecl
{
	public IdentList il;

	public OutputEventDecl(IdentList il)
	{
		this.il = il;
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

	public void generateCode(BufferedWriter w) throws IOException
	{
		String[] outputVar = il.generateCode().split(",");
		w.write("int nSalidas = " + outputVar.length + ";");
		w.newLine();
		for (String output : outputVar)
		{
			w.write("boolean " + output + ";");
			w.newLine();
		}
	}
}
