package AST;
import Errors.*;

/*
Condition ::= CONDITION PAREN ExpLog:el TESIS PC   {:RESULT = new Condition(el); :};
*/

public class Condition implements ExpLog{
	public ExpLog el;

	public Condition (ExpLog el){
		this.el = el;
	}
}
