package AST;
import Compiler.*;
import Errors.*;
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

	public void generateCode(BufferedWritter w) throws IOException
	{
		w.write("public Variable " + il.generateCode() + ";");
	}
}
