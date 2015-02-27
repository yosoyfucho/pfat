package AST;
import Errors.*;

public class SimpleStatementList2 implements SimpleStatementList{
	public String i;
	public Clog cl;

	public SimpleStatementList2 (String i, Clog cl){
		this.i = i;
		this.cl = cl;
	}
}