package AST;
import Compiler.*;
import Errors.*;

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

	public void generateCode(BufferedWritter w) throws IOException
	{
		w.write("if ( " + el.generateCode(w) + " )");
		w.newLine();
		w.write("{");
		w.newLine();
		w.write("	" + s.generateCode(w) + ";");
		w.newLine();
		w.write("}");
		w.newLine();
	}
}
