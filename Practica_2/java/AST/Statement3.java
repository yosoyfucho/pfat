package AST;
import Compiler.*;
import Errors.*;

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
}
