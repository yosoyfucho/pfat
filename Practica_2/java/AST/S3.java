package AST;
import Errors.*;
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

	public S3 (StateDeclList sdl, InputEventDecl ied, LocalVarDecl lvd,
		OutputEventDecl oed, Initialitation i, Transitions t){

		this.sdl = sdl;
		this.ied = ied;
		this.lvd = lvd;
		this.oed = oed;
		this.i = i;
		this.t = t;
	}
}
