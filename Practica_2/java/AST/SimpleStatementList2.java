package AST;
import Errors.*;

/*
SimpleStatementList ::= IDENT:i ASIG CLOG:cl PC   {:RESULT = new SimpleStatementList2(i,cl); :};
*/

public class SimpleStatementList2 implements SimpleStatementList{
	public String i;
	public Boolean cl;

	public SimpleStatementList2 (String i, Boolean cl){
		this.i = i;
		this.cl = cl;
	}
}
