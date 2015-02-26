package AST;
import Errors.*;

public class StateDeclList implements IdentList{
	public IdentList il;
	public States s;

	public StateDeclList (IdentList il,States s){
		this.il = il;
		this.s = s;
	}
}