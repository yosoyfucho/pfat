package AST;
import Compiler.*;
import Errors.*;
/*
Transition ::= TRANSITION PAREN InitialState:is COMA Event:e COMA FinalState:fs
TESIS PC   {:RESULT = new Transition1(is,e,fs); :}
*/

public class Transition1 implements Transition
{
	public InitialState is;
	public Event i;
	public FinalState fs;

	public Transition1 (InitialState is, Event i, FinalState fs)
	{
		this.is = is;
		this.i = i;
		this.fs = fs;
	}

	public void computeType() throws CompilerExc
	{
		if ( SymbolTable.searchByName(is.computeType())==null )
		{
			throw new VarNoDefExc(is.computeType());
		}
		else if ( SymbolTable.searchByName(i.computeType())==null )
		{
			throw new VarNoDefExc(i.computeType());
		}
		else if ( SymbolTable.searchByName(fs.computeType())==null )
		{
			throw new VarNoDefExc(fs.computeType());
		}
		else
		{
			if ( !SymbolTable.searchByName(is.computeType()).getType().equals("state") )
			{
				throw new TranException(is.computeType());
			}
			else if ( !SymbolTable.searchByName(i.computeType()).getType().equals("event") )
			{
				throw new TranException(i.computeType());
			}
			else if ( !( SymbolTable.searchByName(fs.computeType()).getType().equals("finalState") ||
			SymbolTable.searchByName(fs.computeType()).getType().equals("state") ) )
			{
				throw new TranException(fs.computeType());
			}
			else
			{
				if ( TransSymbolTable.search(is.computeType(),i.computeType())==null )
				{
					TransSymbolTable.add(is.computeType(),i.computeType(),fs.computeType());
				}
				else
				{
					throw new DoubleTranExc(is.computeType() + "," + i.computeType());
				}
			}
		}
	}

	public void GenerateCode (BufferedWritter w) throws IOException
	{
		w.write("transition (" + this.is.GenerateCode() + "," + this.i.GenerateCode() + "," + this.fs.GenerateCode() + ");");

		if ( TransSymbolTable.search(is.computeType(),i.computeType() )
		{
			currenState = this.fs.GenerateCode();
		}

	}

}
