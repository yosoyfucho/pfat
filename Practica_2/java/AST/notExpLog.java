package AST;
import Compiler.*;
import Errors.*;

/*
Explog ::= NOT ExpLog:el   {:RESULT = new notExpLog(el); :};
*/

public class notExpLog implements ExpLog {
	public ExpLog e;

	public notExpLog (ExpLog e) {
		this.e = e;
	}
}
