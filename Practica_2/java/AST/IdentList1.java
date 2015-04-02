package AST;
import Errors.*;

/*
IdentList ::= IDENT:i   {:RESULT = new IdentList1(i); :}
*/
public class IdentList1 implements IdentList{

	public String i;

	public IdentList1 (String i){
		this.i=i;
	}
}
