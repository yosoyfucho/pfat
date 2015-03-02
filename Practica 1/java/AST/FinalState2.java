package AST;
import Errors.*;

public class FinalState2 implements Transition{
	public InitialState is;
	public Event e;
	public FinalState fs;
	public TransBehaviour tb;

	public FinalState2 (InitialState is, Event e, FinalState fs, TransBehaviour tb){
		this.is = is;
		this.e = e;
		this.fs = fs;
		this.tb = tb;
	}
}
