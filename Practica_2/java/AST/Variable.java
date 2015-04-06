package AST;
import Compiler.*;
import Errors.*;
/*
Explog ::= PAREN IDENT:i TESIS   {:RESULT = new Variable(i); :}
*/

public class Variable implements ExpLog 
{
	public final String i;

	public Variable(String i)
	{
		this.i = i;
	}

	public void computeType() throws CompilerExc
	{
		if ( SymbolTable.searchByName(this.i)==null )
		{
			throw new VarNoDefExc();
		}
	}
}
