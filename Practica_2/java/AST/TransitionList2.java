package AST;
import Compiler.*;
import Errors.*;
/*
TransitionList ::= Transition:t TransitionList:tl   {:RESULT = new TransitionList2(t,tl); :};
*/

public class TransitionList2 implements TransitionList
{
	public Transition t;
	public TransitionList tl;

	public TransitionList2 (Transition t, TransitionList tl)
	{
		this.t = t;
		this.tl = tl;
	}

	public void computeType() throws CompilerExc
	{
		t.computeType();
		tl.computeType();
	}
}
