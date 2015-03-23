package AST;
import Errors.*;

public class Transition4 implements Transition{
	public InitialState is;
	public Event i;
	public FinalState fs;
  public TransBehaviour tb;
  public Condition c;

	public Transition4 (InitialState is, Event i, FinalState fs, Condition c,TransBehaviour tb)
	{
		this.is = is;
		this.i = i;
		this.fs = fs;
    this.tb = tb;
    this.c = c;
	}
}
