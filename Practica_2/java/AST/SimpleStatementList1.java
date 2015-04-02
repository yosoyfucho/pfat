package AST;
import Errors.*;

/*
SimpleStatementList ::= SimpleStatementList:ssl IDENT:i ASIG CLOG:cl PC   {:RESULT = new SimpleStatementList1(ssl,i,cl); :}
*/

public class SimpleStatementList1 implements SimpleStatementList{
	public SimpleStatementList ssl;
	public String i;
	public Boolean cl;

	public SimpleStatementList1 (SimpleStatementList ssl, String i, Boolean cl){
		this.ssl = ssl;
		this.i = i;
		this.cl = cl;
	}
}
