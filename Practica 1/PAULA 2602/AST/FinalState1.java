package AST;
import Errors.*;

public class FinalState1 implements Transition{
  
	public InitialState is;
	public Event e;
	public FinalState fs;

	public FinalState1(InitialState is, Event e, FinalState fs){
		this.is = is;
		this.e = e;
		this.fs = fs;
	}
}