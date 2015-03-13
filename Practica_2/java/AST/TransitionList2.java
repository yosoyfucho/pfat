package AST;
import Errors.*;

public class TransitionList2 implements TransitionList{
	public Transition t;
	public TransitionList tl;

	public TransitionList2 (Transition t, TransitionList tl){
		this.t = t;
		this.tl = tl;
	}
}