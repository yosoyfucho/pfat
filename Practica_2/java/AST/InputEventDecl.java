package AST;
import Errors.*;

/*
InputEventDecl ::= INPUTS IdentList:il PC   {:RESULT = new InputEventDecl(il); :};
*/

public class InputEventDecl implements IdentList{
	public IdentList il;

	public InputEventDecl (IdentList il){
		this.il=il;
	}
}
