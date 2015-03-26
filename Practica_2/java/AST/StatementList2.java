package AST;
import Errors.*;

public class StatementList2 implements StatementList{
	public Statement t;
	public StatementList tl;

	public StatementList2 (Statement t, StatementList tl){
		this.t = t;
		this.tl = tl;
	}
}
