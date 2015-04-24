package AST;
import Compiler.*;
import Errors.*;
import java.io.*;

/*
StateDeclList ::= STATES IdentList:il PC	{:RESULT = new StateDeclList(il);:};
*/

public class StateDeclList
{
	public final IdentList il;

	public StateDeclList (IdentList il)
	{
		this.il = il;
	}

	public void computeType() throws CompilerExc
	{
		String[] states = il.computeType().split(",");

		for (int i=0;i<states.length;i++)
		{
			if (SymbolTable.search(states[i],"state")==null)
			{
				SymbolTable.add(states[i],"state",false);
			}
			else
			{
				throw new DoubleDefExc(states[i]);
			}
		}
	}

	public void generateCode(BufferedWriter w) throws IOException
	{
		String[] states = il.generateCode().split(",");

		for (String state : states)
		{
			w.write("String " + state + " = \"" + state + "\";");
			w.newLine();
		}
	}
}
