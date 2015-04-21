package AST;
import Compiler.*;
import Errors.*;

/*
S ::=  STATE_MACHINE StateDeclList:sdl FinalStateDeclList:fsdl InputEventDecl:ied LocalVarDecl:lvd
			OutputEventDecl:oed Initialitation:i Transitions:t
			{:RESULT = new S1(sdl,fsdl,ied,lvd,oed,i,t); :}
*/
public class S1 implements S{

	public StateDeclList sdl;
	public FinalStateDeclList fsdl;
	public InputEventDecl ied;
	public LocalVarDecl lvd;
	public OutputEventDecl oed;
	public Initialitation i;
	public Transitions t;

	public S1 (StateDeclList sdl, FinalStateDeclList fsdl,
		InputEventDecl ied, LocalVarDecl lvd, OutputEventDecl oed,
		Initialitation i, Transitions t){
		this.sdl = sdl;
		this.fsdl = fsdl;
		this.ied = ied;
		this.lvd = lvd;
		this.oed = oed;
		this.i = i;
		this.t = t;
	}

	public void computeType() throws CompilerExc
	{
		sdl.computeType();
		fsdl.computeType();
		ied.computeType();
		lvd.computeType();
		oed.computeType();
		i.computeType();
		t.computeType();
	}
	
	public void generateCode(BufferedWritter w) throws IOException
	{
		sdl.generateCode(w);
		fsdl.generateCode(w);
		ied.generateCode(w);
		lvd.generateCode(w);
		oed.generateCode(w);
		i.generateCode(w);
		t.generateCode(w);
	}

}
