package AST;
import Errors.*;
/*
Transitions ::= BEGIN TransitionList:tl END   {:RESULT = new Transitions(tl); :};
*/

public class Transitions implements TransitionList{
	public TransitionList tl;

	public Transitions (TransitionList tl){
		this.tl = tl;
	}
}
