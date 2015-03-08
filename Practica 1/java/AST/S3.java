package AST;
import Errors.*;

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