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
		if ( (SymbolTable.searchByName(is.computeType())!=null) &&
		(SymbolTable.searchByName(i.computeType())!=null) &&
		(SymbolTable.searchByName(fs.computeType())!=null))
		{
			if ( SymbolTable.searchByName(is.computeType()).getType().equals("state") &&
			SymbolTable.searchByName(is.computeType()).getType().equals("finalState") &&
			TransSymbolTable.search(is.computeType(),i.computeType())==null )
			{
				TransSymbolTable.add(is.computeType(),i.computeType(),fs.computeType());
			}
			else
			{
				throw new DoubleTranExc();
			}
		}
		else
		{
			throw new VarNoDefExc();
		}
	}
}
