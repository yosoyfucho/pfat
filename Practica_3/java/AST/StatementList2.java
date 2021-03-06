package AST;
import Compiler.*;
import Errors.*;
import java.io.*;

/*
Statement ::= Statement:s StatementList:sl   {:RESULT = new StatementList2(s,sl); :};
*/

public class StatementList2 implements StatementList
{
	public final Statement s;
	public final StatementList sl;

	public StatementList2 (Statement s, StatementList sl)
	{
		this.s = s;
		this.sl = sl;
	}

	public void computeType() throws CompilerExc
	{
		if (s.computeTyp().equals("STOP"))
		{
			throw new StopExc();
		}
		s.computeType();
		sl.computeType();		
	}

	public void generateCode(BufferedWriter w) throws IOException
	{
		s.generateCode(w);
		sl.generateCode(w);
	}
}
