package AST;
import Errors.*;

public class Statement4 implements Statement{
	public Statement s;
	public ExpLog el;

	public Statement4 (Statement s, ExpLog el){
		this.s = s;
		this.el = el;
	}
}