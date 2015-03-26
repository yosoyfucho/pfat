package AST;
import Errors.*;

public class IdentList2 implements IdentList{

	public String i;
	public IdentList il;

	public IdentList2 (String i, IdentList il){

		this.i=i;
		this.il = il;
	}
}
