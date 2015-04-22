package AST;
import Compiler.*;
import Errors.*;

/*
ExpLog ::= NOT ExpLog:el   {:RESULT = new ExpLog4(el);
*/

public class ExpLog4 implements ExpLog
{
	public ExpLog el;

	public ExpLog4 (ExpLog el)
	{
		this.el = el;
	}

	public void computeType() throws CompilerExc
	{
		el.computeType();
	}

	public String generateCode() throws IOException
	{
		return "!" + el.generateCode();
	}
}