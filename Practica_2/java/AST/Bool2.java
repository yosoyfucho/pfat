package AST;
import Errors.*;

/*
Explog::=
| ExpLog:e1 AND ExpLog:e2   {:RESULT = new Bool2(e1,e2); :}
| PAREN ExpLog:e1 AND ExpLog:e2 TESIS   {:RESULT = new Bool2(e1,e2); :}
| ExpLog:e1 OR ExpLog:e2   {:RESULT = new Bool2(e1,e2); :}
*/

public class Bool2 implements ExpLog
{
	public ExpLog e1;
	public ExpLog e2;

	public Bool2 (ExpLog e1, ExpLog e2)
	{
		this.e1 = e1;
		this.e2 = e2;
	}
}
