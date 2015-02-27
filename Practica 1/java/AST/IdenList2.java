package AST;
import Errors.*;

public class IdentList2 implements IdentList{

	public IdentList i;
	public IdentList il;

	public IdentList2 (IdentList i, IdentList il){
		
		this.i=i;
		this.il = il;
	}
}