package AST;
import Errors.*;

public class Transition3 implements Transition{
	public InitialState is;
	public Event i;
	public FinalState fs;
  public Condition c;

	public Transition3 (InitialState is, Event i, FinalState fs, Condition c)
	{
		this.is = is;
		this.i = i;
		this.fs = fs;
    this.c = c;
	}
}
