package AST;

import java.io.*;
import java.util.*;
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

	public void computeType() throws CompilerExc, VarNoAsigExc
	{
		if ( SymbolTable.searchByName(this.i)==null )
		{
			throw new VarNoDefExc(this.i);
		}
		if ( SymbolTable.searchLocalOrOutputByName(this.i)==null )
		{
			throw new TypIncExc(this.i);
		}
		if ( !SymbolTable.searchLocalOrOutputByName(this.i).getInit() )
		{
			throw new VarNoAsigExc(this.i);
		}
	}

	public void generateCode(BufferedWriter w) throws IOException
	{
		w.write(this.i);
	}
}
