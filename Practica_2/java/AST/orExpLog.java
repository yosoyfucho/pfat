package AST;
import Compiler.*;
import Errors.*;

/*
Expolg ::= ExpLog:e1 OR ExpLog:e2   {:RESULT = new orExpLog(e1,e2); :}
*/

public class orExpLog implements ExpLog
{
	public ExpLog e1;
	public ExpLog e2;

	public orExpLog (ExpLog e1, ExpLog e2)
	{
		this.e1 = e1;
		this.e2 = e2;
	}
}
