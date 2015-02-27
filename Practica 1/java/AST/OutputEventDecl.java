package AST;
import Errors.*;

public class OutputEventDecl implements IdentList{
	public IdentList il;

	public OutputEventDecl (IdentList il){
		this.il=il;
	}
}