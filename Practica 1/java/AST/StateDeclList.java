package AST;
import Errors.*;

public class StateDeclList implements IdentList{
	public IdentList il;

	public StateDeclList (IdentList il){
		this.il = il;
	}
}
