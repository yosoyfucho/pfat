package AST;
import Compiler.*;
import Errors.*;

/*
Initialitation ::= START WITH IDENT:i PC SimpleStatementList:ssl   {:RESULT = new Initialitation(i,ssl); :};
*/

public class Initialitation implements SimpleStatementList
{
	public String i;
	public SimpleStatementList ssl;

	public Initialitation (String i, SimpleStatementList ssl){
		this.i = i;
		this.ssl = ssl;
	}

	public void computeType() throws CompilerExc
	{
		TableEntry e = SymbolTable.searchByName(this.i);
		if (!e.getType().equals("state"))
		{
			throw new TranException();
		}

		ssl.computeType();
	}

}
