package AST;
import Errors.*;
/*
TransBehaviour ::= BEHAVIOUR StatementList:sl   {:RESULT = new TransBehaviour(sl); :};
*/

public class TransBehaviour implements StatementList{
	public StatementList sl;

	public TransBehaviour (StatementList sl){
		this.sl = sl;
	}
}
