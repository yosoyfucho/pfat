package AST;
import Errors.*;
/*
Explog ::= PAREN IDENT:i TESIS   {:RESULT = new Variable(i); :}
*/

public class Variable implements ExpLog {
	public String i;

	public Variable(String i) {
		this.i = i;
	}
}
