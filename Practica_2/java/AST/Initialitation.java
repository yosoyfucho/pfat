package AST;
import Compiler.*;
import Errors.*;
import java.io.*;

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
		if (!SymbolTable.searchByName(this.i).getType().equals("state"))
		{
			throw new TranException(this.i);
		}

		ssl.computeType();
	}

	public void generateCode(BufferedWriter w) throws IOException
	{
		String indentacion ="\t";
		w.write(indentacion+"String currentState = " + this.i + ";");
		w.newLine();
		ssl.generateCode(w);
	}
}
