package AST;
import Compiler.*;
import Errors.*;

/*
IdentList ::= IDENT:i   {:RESULT = new IdentList1(i); :}
*/
public class IdentList1 implements IdentList
{

	public String i;

	public IdentList1 (String i){
		this.i=i;
	}

	public String computeType() throws CompilerExc
	{
		return this.i;
	}

}
