package AST;
import Compiler.*;
import Errors.*;

/*
Transition ::= TRANSITION PAREN InitialState:is COMA Event:e COMA FinalState:fs
								TESIS PC TransBehaviour:tb
								{:RESULT = new Transition2(is,e,fs,tb); :}
*/


public class Transition2 implements Transition
{
	public InitialState is;
	public Event i;
	public FinalState fs;
  	public TransBehaviour tb;

	public Transition2 (InitialState is, Event i, FinalState fs, TransBehaviour tb)
	{
		this.is = is;
		this.i = i;
		this.fs = fs;
    	this.tb = tb;
	}

	public void computeType() throws CompilerExc
	{
		tb.computeType();
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
