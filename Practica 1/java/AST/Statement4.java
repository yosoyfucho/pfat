package AST;
import Errors.*;

public class Statement4 implements Statement{
	public ExpLog el;
	public Statement s;

	public Statement4 (ExpLog el, Statement s){
		this.s = s;
		this.el = el;
	}
}
