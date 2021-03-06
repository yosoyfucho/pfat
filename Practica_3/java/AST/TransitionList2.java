package AST;
import java.io.*;
import Errors.*;
import Compiler.*;

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

	public void generateCode(BufferedWriter w) throws IOException
	{
		t.generateCode(w);
		tl.generateCode(w);
	}
}
