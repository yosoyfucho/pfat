package AST;
import Errors.*;

/*
IdentList ::= IDENT:i COMA IdentList:il   {:RESULT = new IdentList2(i,il); :};
*/

public class IdentList2 implements IdentList{

	public String i;
	public IdentList il;

	public IdentList2 (String i, IdentList il){

		this.i=i;
		this.il = il;
	}
}
