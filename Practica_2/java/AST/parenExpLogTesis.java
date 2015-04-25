package AST;
import Compiler.*;
import Errors.*;
/*
Explog ::= PAREN ExpLog:el TESIS {:RESULT = new parenExpLogTesis(el); :}
*/

public class parenExpLogTesis implements ExpLog {
	public ExpLog e;

	public parenExpLogTesis (ExpLog e) {
		this.e = e;
	}
}
