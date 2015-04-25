package AST;
import Compiler.*;
import Errors.*;
import java.io.*;

// Statement ::= IF ExpLog:el THEN Statement:s ENDIF PC

public class Statement3 implements Statement
{
	public ExpLog el;
	public Statement s;

	public Statement3 (ExpLog el, Statement s){
		this.s = s;
		this.el = el;
	}

	public void computeType() throws CompilerExc
	{
		el.computeType();
		s.computeType();
	}

	public String computeTyp() throws CompilerExc
	{
		return "";
	}

	public void generateCode(BufferedWriter w) throws IOException
	{
		String indentacion="\t";
		w.write(indentacion+"if ( " + el.generateCode() + " )");
		w.newLine();
		w.write(indentacion+"{");
		w.newLine();
		w.write("	");
		s.generateCode(w);
		w.newLine();
		w.write(indentacion+"}");
		w.newLine();
	}
}
