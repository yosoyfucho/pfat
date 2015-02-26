package AST;
import Errors.*;


public class Initialitation implements SimpleStatementList{
	public Ident i;
	public SimpleStatementList ssl;

	public Initialitation (Ident i, SimpleStatementList ssl){
		this.i = i;
		this.ssl = ssl;
	}
}