package AST;
import Errors.*;

public class FinalState4 implements Transition{

	public InitialState is;
	public Event e;
	public FinalState fs;
	public Condition c;
	public TransBehaviour tb;

	public FinalState4 (InitialState is, Event e, FinalState fs, Condition c, TransBehaviour tb){
		this.is = is;
		this.e = e;
		this.fs = fs;
		this.c = c;
		this.tb = tb;
	}
}
