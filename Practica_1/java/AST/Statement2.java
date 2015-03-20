package AST;
import Errors.*;

public class Statement2 implements Statement
{
	public String i;
	public ExpLog el;

	public Statement2 (String i, ExpLog el)
	{
		this.i = i;
		this.el = el;
	}
}