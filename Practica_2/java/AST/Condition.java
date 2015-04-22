package AST;
import Compiler.*;
import Errors.*;

/*
Condition ::= CONDITION PAREN ExpLog:el TESIS PC   {:RESULT = new Condition(el); :};
*/

public class Condition implements ExpLog
{
	public ExpLog el;

	public Condition (ExpLog el)
	{
		this.el = el;
	}

	public void computeType() throws CompilerExc
	{
		el.computeType();
	}

	//Falta codigo
}
