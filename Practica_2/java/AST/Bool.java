package AST;
import Errors.*;
 /*
ExpLog ::= CLOG:c   {:RESULT = new Bool(c); :}
| PAREN CLOG:c TESIS   {:RESULT = new Bool(c); :}
*/
public class Bool implements ExpLog {
	public boolean c;

	public Bool (boolean c) {
		this.c = c;
	}
}
