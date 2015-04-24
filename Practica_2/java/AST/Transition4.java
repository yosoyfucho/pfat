
package AST;
import Compiler.*;
import Errors.*;
import java.io.*;
import java.util.*;

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
		tb.computeType();
		c.computeType();
	}

	public void generateCode (BufferedWriter w) throws IOException
	{
		String indentacion ="\t";
		w.write(indentacion+"if (currentState.equals(" + is.generateCode() + ") && inputEvent.equals(" + i.generateCode() + ") && !transNotFound)");
		w.newLine();
		w.write(indentacion+"{");
		w.newLine();
		c.generateCode(w);
		w.newLine();
		indentacion +=indentacion;
		w.write(indentacion+"{");
		w.newLine();
		indentacion +=indentacion;
		w.write(indentacion+"currentState = " + fs.generateCode() + ";");
		w.newLine();
		w.write(indentacion+"transNotFound = true;");
		w.newLine();
		tb.generateCode(w);

		w.newLine();
		indentacion ="\t";
		w.write(indentacion+"}");
		w.newLine();
	}
}
