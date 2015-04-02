package AST;
import Errors.*;

/*
Statement ::= IDENT:i ASIG ExpLog:el PC   {:RESULT = new Statement3(i,el); :}
*/

public class Statement3 implements Statement{
	public String i;
	public ExpLog el;

	public Statement3 (String i, ExpLog el){
		this.i = i;
		this.el = el;
	}
}
