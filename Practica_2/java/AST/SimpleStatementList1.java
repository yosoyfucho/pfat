package AST;
import Compiler.*;
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

	public void computeType() throws CompilerExc
	{
		ssl.computeType();
		if (SymbolTable.searchByName(this.i)!=null)
		{
			if (SymbolTable.searchByName(this.i).getInit())
			{
				throw new DoubleStatExc();
			}
			else
			{
				SymbolTable.searchByName(this.i).setInit(true);
			}
		}
		else
		{
			throw new VarNoDefExc();
		}
	}
}
