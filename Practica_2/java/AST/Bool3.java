package AST;
import Errors.*;
 /*
Explog ::= NOT ExpLog:e   {:RESULT = new Bool3(e); :};
*/
public class Bool3 implements ExpLog {
	public ExpLog e;

	public Bool3 (ExpLog e) {
		this.e = e;
	}
}
