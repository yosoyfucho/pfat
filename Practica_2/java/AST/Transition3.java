package AST;
import Compiler.*;
import Errors.*;

/*
Transition ::= TRANSITION PAREN InitialState:is COMA Event:e COMA FinalState:fs
							TESIS PC Condition:c   {:RESULT = new Transition3(is,e,fs,c); :}
*/

public class Transition3 implements Transition
{
	public InitialState is;
	public Event i;
	public FinalState fs;
  	public Condition c;

	public Transition3 (InitialState is, Event i, FinalState fs, Condition c)
	{
		this.is = is;
		this.i = i;
		this.fs = fs;
    	this.c = c;
	}

	public void computeType() throws CompilerExc
	{
		c.computeType();
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
