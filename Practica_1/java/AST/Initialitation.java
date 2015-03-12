package AST;
import Errors.*;


public class Initialitation implements SimpleStatementList{
	public String i;
	public SimpleStatementList ssl;

	public Initialitation (String i, SimpleStatementList ssl){
		this.i = i;
		this.ssl = ssl;
	}
}