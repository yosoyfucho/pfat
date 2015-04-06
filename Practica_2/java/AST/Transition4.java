package AST;
import Compiler.*;
import Errors.*;

/*
Transition ::= TRANSITION PAREN InitialState:is COMA Event:e COMA FinalState:fs
							TESIS PC Condition:c TransBehaviour:tb
							{:RESULT = new Transition4(is,e,fs,c,tb); :};
*/
public class Transition4 implements Transition
{
	public InitialState is;
	public Event i;
	public FinalState fs;
  	public TransBehaviour tb;
  	public Condition c;

	public Transition4 (InitialState is, Event i, FinalState fs, Condition c,TransBehaviour tb)
	{
		this.is = is;
		this.i = i;
		this.fs = fs;
    	this.tb = tb;
    	this.c = c;
	}

	public void computeType() throws CompilerExc
	{
		tb.computeType();
		c.computeType();
		if ( (SymbolTable.searchByName(is.computeType())!=null) &&
			(SymbolTable.searchByName(i.computeType())!=null) &&
			(SymbolTable.searchByName(fs.computeType())!=null))
		{
			if ( SymbolTable.searchByName(is.computeType()).getType().equals("state") &&
			( SymbolTable.searchByName(fs.computeType()).getType().equals("finalState") ||
			SymbolTable.searchByName(fs.computeType()).getType().equals("state") ) &&
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
