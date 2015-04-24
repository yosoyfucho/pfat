package AST;
import Compiler.*;
import Errors.*;
import java.io.*;

/*
FinalStateDeclList ::= FINAL STATES IdentList:il PC {:RESULT = new FinalStateDeclList(il);:};
*/

public class FinalStateDeclList
{
	public final IdentList il;

	public FinalStateDeclList (IdentList il)
	{
		this.il = il;
	}

	public void computeType() throws CompilerExc
	{

		String[] finalStates = il.computeType().split(",");

		for (int i=0;i<finalStates.length;i++)
		{
			if (SymbolTable.search(finalStates[i],"finalState")==null)
			{
				SymbolTable.add(finalStates[i],"finalState",false);
			}
			else
			{
				throw new DoubleDefExc(finalStates[i]);
			}
		}

	}

	public void generateCode(BufferedWriter w) throws IOException
	{

		String[] finalStates = il.generateCode().split(",");

		String indentacion ="\t"
		for (String finalS : finalStates)
		{
<<<<<<< Updated upstream
			w.write("String " + finalS + " = \"" + finalS + "\";");
			w.newLine();
			w.write("String finalState = " + il.generateCode() + ";");
=======
			w.write(indentacion+"public String " + finalS + " = \"" + finalS + "\";");
			w.newLine();
			w.write(indentacion+"public String finalState = " + il.generateCode() + ";");
>>>>>>> Stashed changes
			w.newLine();
		}

	}


}
