package AST;
import Compiler.*;
import Errors.*;
/*
StatementList ::= Statement:s   {:RESULT = new StatementList1(s); :}
*/

public class StatementList1 implements StatementList
{
	public Statement t;

	public StatementList1 (Statement t)
	{
		this.t = t;
	}

	public void computeType() throws CompilerExc
	{
		t.computeType();
	}
}
