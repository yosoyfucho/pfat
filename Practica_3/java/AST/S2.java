package AST;
import Compiler.*;
import Errors.*;
import java.io.*;

/*
S ::=  STATE_MACHINE StateDeclList:sdl FinalStateDeclList:fsdl InputEventDecl:ied
			OutputEventDecl:oed Initialitation:i Transitions:t
			{:RESULT = new S2(sdl,fsdl,ied,oed,i,t); :}
*/

public class S2 implements S
{
	public StateDeclList sdl;
	public FinalStateDeclList fsdl;
	public InputEventDecl ied;
	public OutputEventDecl oed;
	public Initialitation i;
	public Transitions t;

	public S2 (StateDeclList sdl,FinalStateDeclList fsdl, InputEventDecl ied, 
		OutputEventDecl oed, Initialitation i, Transitions t)
	{
		this.sdl = sdl;
		this.fsdl = fsdl;
		this.ied = ied;
		this.oed = oed;
		this.i = i;
		this.t = t;
	}

	public void computeType() throws CompilerExc
	{
		sdl.computeType();
		fsdl.computeType();
		ied.computeType();
		oed.computeType();
		i.computeType();
		t.computeType();
	}

	public void generateCode(BufferedWriter w) throws IOException
	{
		sdl.generateCode(w);
		fsdl.generateCode(w);
		ied.generateCode(w);
		oed.generateCode(w);
		i.generateCode(w);
		t.generateCode(w);
	}
}
