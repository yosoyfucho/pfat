package AST;
import Errors.*;

/*
OutputEventDecl ::= OUTPUTS IdentList:il PC   {:RESULT = new OutputEventDecl(il); :};
*/

public class OutputEventDecl implements IdentList{
	public IdentList il;

	public OutputEventDecl (IdentList il){
		this.il=il;
	}
}
