package AST;
import Compiler.*;
import Errors.*;

/*
Explog ::= ExpLog:e1 AND ExpLog:e2   {:RESULT = new andExpLog(e1,e2); :}
*/


public class andExpLog implements ExpLog
{
	public ExpLog e1;
	public ExpLog e2;

	public andExpLog (ExpLog e1, ExpLog e2)
	{
		this.e1 = e1;
		this.e2 = e2;
	}
}
