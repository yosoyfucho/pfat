package AST;
import Errors.*;

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
}