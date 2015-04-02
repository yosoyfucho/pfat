package AST;
import Errors.*;

/*
InitialState ::= IDENT:i   {:RESULT = new InitialState(i); :};
*/

public class InitialState
{
	public String i;

	public InitialState (String i){
		this.i = i;
	}
}
