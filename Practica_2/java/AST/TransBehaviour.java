package AST;
import Errors.*;

public class TransBehaviour implements StatementList{
	public StatementList sl;

	public TransBehaviour (StatementList sl){
		this.sl = sl;
	}
}
