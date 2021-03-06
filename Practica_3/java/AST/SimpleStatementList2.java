package AST;
import Compiler.*;
import Errors.*;
import java.io.*;

/*
SimpleStatementList ::= IDENT:i ASIG CLOG:cl PC   {:RESULT = new SimpleStatementList2(i,cl); :};
*/

public class SimpleStatementList2 implements SimpleStatementList
{
	public String i;
	public Boolean cl;

	public SimpleStatementList2 (String i, Boolean cl){
		this.i = i;
		this.cl = cl;
	}

	public void computeType() throws CompilerExc
	{

		if ( SymbolTable.searchByName(this.i)==null )
		{
			throw new VarNoDefExc(this.i);
		}
		if ( SymbolTable.searchLocalOrOutputByName(this.i)==null )
		{
			throw new TypIncExc(this.i);
		}
		if ( SymbolTable.searchLocalOrOutputByName(this.i).getInit() )
		{
			throw new DoubleInitVarExc(this.i);
		}

		SymbolTable.searchLocalOrOutputByName(this.i).setInit(true);
	}

	public void generateCode(BufferedWriter w) throws IOException
	{
		String indentacion="\t\t";
		w.write(indentacion+this.i + "=" + this.cl + ";");
		w.newLine();
	}
}
