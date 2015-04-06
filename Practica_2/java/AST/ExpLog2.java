package AST;
import Compiler.*;
import Errors.*;

/*
Explog ::= ExpLog:e1 AND ExpLog:e2   {:RESULT = new andExpLog(e1,e2); :}
*/


public class ExpLog2 implements ExpLog
{
	public ExpLog e1;
	public ExpLog e2;

	public ExpLog2 (ExpLog e1, ExpLog e2)
	{
		this.e1 = e1;
		this.e2 = e2;
	}

	public void computeType() throws CompilerExc
	{
		e1.computeType();
		e2.computeType();
	}
}
