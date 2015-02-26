package AST;
import Errors.*;

public class Statement3 implements Statement{
	public Ident i;
	public ExpLog el;

	public Statement3 (Ident i, ExpLog el){
		this.i = i;
		this.el = el;
	}
}