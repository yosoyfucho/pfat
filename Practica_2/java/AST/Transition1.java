package AST;
import Errors.*;

public class Transition1 implements Transition{
	public InitialState is;
	public Event i;
	public FinalState fs;

	public Transition1 (InitialState is, Event i, FinalState fs)
	{
		this.is = is;
		this.i = i;
		this.fs = fs;

	}
}
