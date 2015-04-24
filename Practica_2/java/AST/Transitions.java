package AST;
import Compiler.*;
import Errors.*;
import java.io.*;
/*
Transitions ::= BEGIN TransitionList:tl END   {:RESULT = new Transitions(tl); :};
*/

public class Transitions
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

	public void generateCode(BufferedWriter w) throws IOException
	{
		int nTransitions=0;
		w.newLine();
		w.write("for (String inputEvent : entradas)");
		w.newLine();
		w.write("{");
		w.newLine();
		w.write("nEventos++;");
		w.newLine();
		tl.generateCode(w, nTransitions);
	}
}
