package AST;
import Errors.*;
/*
LocalVarDecl ::= LOCAL IdentList:il PC   {:RESULT = new LocalVarDecl(il); :};
*/

public class LocalVarDecl implements IdentList{
	public IdentList il;

	public LocalVarDecl (IdentList il){
		this.il = il;
	}
}
