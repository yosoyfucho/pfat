package AST;
import Errors.*;

public class TransBehavior implements Statement{
	public Statement s;

	public TransBehavior (Statement s){
		this.s = s;
	}
}