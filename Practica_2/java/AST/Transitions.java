package AST;
import Compiler.*;
import Errors.*;
/*
Transitions ::= BEGIN TransitionList:tl END   {:RESULT = new Transitions(tl); :};
*/

public class Transitions implements TransitionList
{
	public TransitionList tl;

	public Transitions (TransitionList tl)
	{
		this.tl = tl;
	}

	public void computeType() throws CompilerExc
	{
		tl.computeType();
	}
}
