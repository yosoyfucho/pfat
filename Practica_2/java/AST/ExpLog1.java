package AST;
import Compiler.*;
import Errors.*;

/*
Explog ::= NOT ExpLog:el   {:RESULT = new notExpLog(el); :};
*/

public class ExpLog1 implements ExpLog 
{
	public ExpLog e;

	public ExpLog1 (ExpLog e) {
		this.e = e;
	}

	public void computeType() throws CompilerExc
	{
		e.computeType();
	}
}
