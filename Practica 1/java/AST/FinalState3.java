package AST;
import Errors.*;

public class FinalState3 implements Transition{
	public InitialState is;
	public Event e;
	public FinalState fs;
	public Condition c;
	
	public FinalState3 (InitialState is, Event e, FinalState fs, Condition c){
		this.is = is;
		this.e = e;
		this.fs = fs;
		this.c = c;
	}
}