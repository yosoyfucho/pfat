package AST;
import Errors.*;

public class Transitions implements TransitionList{
	public TransitionList tl;

	public Transitions (TransitionList tl){
		this.tl = tl;
	}
}