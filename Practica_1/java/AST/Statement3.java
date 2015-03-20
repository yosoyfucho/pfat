package AST;
import Errors.*;

public class Statement3 implements Statement
{
	public ExpLog el;
	public Statement s;

	public Statement3 (ExpLog el, Statement s)
	{
		this.s = s;
		this.el = el;
	}
}
