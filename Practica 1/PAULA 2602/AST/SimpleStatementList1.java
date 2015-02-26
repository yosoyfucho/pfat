package AST;
import Errors.*;


public class SimpleStatementList1 implements SimpleStatementList{
	public SimpleStatementList ssl;
	public Ident i;
	public Clog cl;

	public SimpleStatementList1 (SimpleStatementList ssl, Ident i, Clog cl){
		this.ssl = ssl;
		this.i = i;
		this.cl = cl;
	}
}
