package AST;
import Compiler.*;
import Errors.*;
import java.io.*;
/*
LocalVarDecl ::= LOCAL IdentList:il PC   {:RESULT = new LocalVarDecl(il); :};
*/

public class LocalVarDecl
{
	public final IdentList il;

	public LocalVarDecl (IdentList il){
		this.il = il;
	}

	public void computeType() throws CompilerExc
	{
		String[] localVar = il.computeType().split(",");

		for (int i=0;i<localVar.length;i++)
		{
			if (SymbolTable.search(localVar[i],"local")==null)
			{
				SymbolTable.add(localVar[i],"local",false);
			}
			else
			{
				throw new DoubleDefExc(localVar[i]);
			}
		}
	}

	public void generateCode(BufferedWriter w) throws IOException
	{
		String[] localVar = il.generateCode().split(",");
		String indentacion ="\t\t";
		for (String local : localVar)
		{
			w.write(indentacion+"boolean " + local + ";");
			w.newLine();
		}
	}
}
