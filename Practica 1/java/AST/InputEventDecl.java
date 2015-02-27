package AST;
import Errors.*;

public class InputEventDecl implements IdentList{
	public IdentList il;

	public InputEventDecl (IdentList il){
		this.il=il;
	}
}