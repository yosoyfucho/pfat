package AST;
import Errors.*;

public class Transition2 implements Transition{
	public InitialState is;
	public Event i;
	public FinalState fs;
  public TransBehaviour tb;

	public Transition2 (InitialState is, Event i, FinalState fs, TransBehaviour tb)
	{
		this.is = is;
		this.i = i;
		this.fs = fs;
    this.tb = tb;
	}
}
