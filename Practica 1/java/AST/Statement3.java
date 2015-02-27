package AST;
import Errors.*;

public class Statement3 implements Statement{
	public String i;
	public ExpLog el;

	public Statement3 (String i, ExpLog el){
		this.i = i;
		this.el = el;
	}
}