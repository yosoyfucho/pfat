package AST;
import Errors.*;

/*
FinalState ::= IDENT:i   {:RESULT = new FinalState(i); :};
*/

public class FinalState
{
	public String i;

	public FinalState (String i){
		this.i = i;
	}
}
