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

	public void GenerateCode (BufferedWritter w) throws IOException
	{
		w.write("if ( " + el.generateCode(w) + " )");
		w.newLine();
		w.write("{");
		w.newLine();
	}

}
