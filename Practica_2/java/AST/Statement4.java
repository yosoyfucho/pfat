package AST;
import Errors.*;
/*
Statement ::= IF ExpLog:el THEN Statement:s ENDIF PC   {:RESULT = new Statement4(el,s); :};
*/

public class Statement4 implements Statement{
	public ExpLog el;
	public Statement s;

	public Statement4 (ExpLog el, Statement s){
		this.s = s;
		this.el = el;
	}
}
