package AST;
import Compiler.*;
import Errors.*;
import java.io.*;

/*
TransBehaviour ::= BEHAVIOUR StatementList:sl   {:RESULT = new TransBehaviour(sl); :};
*/

public class TransBehaviour implements StatementList
{
	public StatementList sl;

	public TransBehaviour (StatementList sl)
	{
		this.sl = sl;
	}

	public void computeType() throws CompilerExc
	{
		sl.computeType();
	}

	public void generateCode(BufferedWriter w) throws IOException
	{
		sl.generateCode(w);
	}
}
