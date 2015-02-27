package AST;
import Errors.*;

public class LocalVarDecl implements IdentList{
	public IdentList il;

	public LocalVarDecl (IdentList il){
		this.il = il;
	}
}