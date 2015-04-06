package AST;
import Compiler.*;
import Errors.*;

/*
Statement ::= Statement:s StatementList:sl   {:RESULT = new StatementList2(s,sl); :};
*/

public class StatementList2 implements StatementList
{
	public Statement t;
	public StatementList tl;

	public StatementList2 (Statement t, StatementList tl)
	{
		this.t = t;
		this.tl = tl;
	}

	public void computeType() throws CompilerExc
	{
		t.computeType();
		tl.computeType();
	}
}
