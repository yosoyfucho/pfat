package AST;
import Errors.*;

public class TransBehaviour implements Statement{
	public Statement s;

	public TransBehaviour (Statement s){
		this.s = s;
	}
}
