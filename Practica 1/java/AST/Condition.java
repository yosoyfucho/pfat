package AST;
import Errors.*;

public class Condition implements ExpLog{
	public ExpLog el;

	public Condition (ExpLog el){
		this.el = el;
	}
}