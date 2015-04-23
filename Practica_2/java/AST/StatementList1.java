package AST;
import Compiler.*;
import Errors.*;
/*
StatementList ::= Statement:s   {:RESULT = new StatementList1(s); :}
*/

public class StatementList1 implements StatementList
{
	public Statement s;

	public StatementList1 (Statement t)
	{
		this.s = s;
	}

	public void computeType() throws CompilerExc
	{
		s.computeType();
	}

	public void generateCode(BufferedWritter w) throws IOException
	{
		s.generateCode(w);
	}
}
