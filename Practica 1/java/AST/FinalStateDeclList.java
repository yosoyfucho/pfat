package AST;
import Errors.*;

public class FinalStateDeclList implements IdentList{
	public IdentList il;
	public States s;

	public FinalStateDeclList (IdentList il,States s){
		this.il = il;
		this.s = s;
	}
}