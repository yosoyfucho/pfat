package AST;
import Errors.*;

/*
S ::=  STATE_MACHINE StateDeclList:sdl InputEventDecl:ied OutputEventDecl:oed
			Initialitation:i Transitions:t	{:RESULT = new S4(sdl,ied,oed,i,t); :};
*/

public class S4 implements S{

	public StateDeclList sdl;
	public InputEventDecl ied;
	public OutputEventDecl oed;
	public Initialitation i;
	public Transitions t;

	public S4 (StateDeclList sdl, InputEventDecl ied,
		OutputEventDecl oed, Initialitation i,
		Transitions t){

		this.sdl = sdl;
		this.ied = ied;
		this.oed = oed;
		this.i = i;
		this.t = t;
	}
}
