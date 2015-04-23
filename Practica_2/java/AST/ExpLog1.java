package AST;
import Compiler.*;
import Errors.*;

/*
ExpLog ::= PAREN ExpLog:el TESIS {:RESULT = new ExpLog1(el); :};
*/

public class ExpLog1 implements ExpLog
{
	public ExpLog e;

	public ExpLog1 (ExpLog e) {
		this.e = e;
	}

	public void computeType() throws CompilerExc
	{
		e.computeType();
	}

	public String generateCode(BufferedWriter w) throws IOException
	{
		w.write("("+ e.generateCode() + ")");
	}
}
