package AST;
import Compiler.*;
import Errors.*;
/*
TransitionList ::= Transition:t   {:RESULT = new TransitionList1(t); :}
*/

public class TransitionList1 implements TransitionList
{
	public Transition t;

	public TransitionList1 (Transition t)
	{
		this.t = t;
	}

	public void computeType() throws CompilerExc
	{
		t.computeType();
	}
}
