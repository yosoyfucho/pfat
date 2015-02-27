package AST;
import Errors.*;


public class SimpleStatementList1 implements SimpleStatementList{
	public SimpleStatementList ssl;
	public String i;
	public Clog cl;

	public SimpleStatementList1 (SimpleStatementList ssl, String i, Clog cl){
		this.ssl = ssl;
		this.i = i;
		this.cl = cl;
	}
}
