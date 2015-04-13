package AST;
import Compiler.*;
import Errors.*;

/*
Statement ::= Statement:s StatementList:sl   {:RESULT = new StatementList2(s,sl); :};
*/

public class StatementList2 implements StatementList
{
	public final Statement t;
	public final StatementList tl;

	public StatementList2 (Statement t, StatementList tl)
	{
		this.t = t;
		this.tl = tl;
	}

	public void computeType() throws CompilerExc
	{
		if ((t.computeTyp()).equals("STOP"))
				throw new StopExcep();
		else
		{
		tl.computeType();
		}
	}
}
