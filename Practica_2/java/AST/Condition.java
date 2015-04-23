package AST;
import Compiler.*;
import Errors.*;
import Errors.*;
import Errors.*;
import java.io.*;

/*
Condition ::= CONDITION PAREN ExpLog:el TESIS PC   {:RESULT = new Condition(el); :};
*/

public class Condition
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

	public void generateCode (BufferedWriter w) throws IOException
	{
		w.write("if ( " + el.generateCode() + " )");
		w.newLine();
		w.write("{");
		w.newLine();
	}

}
