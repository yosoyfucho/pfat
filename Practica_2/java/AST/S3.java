package AST;
import Compiler.*;
import Errors.*;
import java.io.*;
/*
S ::=  STATE_MACHINE StateDeclList:sdl InputEventDecl:ied LocalVarDecl:lvd
			OutputEventDecl:oed Initialitation:i Transitions:t
			{:RESULT = new S3(sdl,ied,lvd,oed,i,t); :}
*/

public class S3 implements S{

	public StateDeclList sdl;
	public InputEventDecl ied;
	public LocalVarDecl lvd;
	public OutputEventDecl oed;
	public Initialitation i;
	public Transitions t;

	public S3 (StateDeclList sdl, InputEventDecl ied, LocalVarDecl lvd,	OutputEventDecl oed, 
		Initialitation i, Transitions t)
	{
		this.sdl = sdl;
		this.ied = ied;
		this.lvd = lvd;
		this.oed = oed;
		this.i = i;
		this.t = t;
	}

	public void computeType() throws CompilerExc
	{
		sdl.computeType();
		ied.computeType();
		lvd.computeType();
		oed.computeType();
		i.computeType();
		t.computeType();
	}

	public void generateCode(BufferedWriter w) throws IOException
	{
		sdl.generateCode(w);
		ied.generateCode(w);
		lvd.generateCode(w);
		oed.generateCode(w);
		i.generateCode(w);
		t.generateCode(w);
	}
}
