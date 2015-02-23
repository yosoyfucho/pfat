package AST;

import Errors.*;
import java.io.*;

public class FinalState4 implements FinalState
{
	public InitialState is;
	public Event e;
	public FinalState fs;
	public Condition c;
	public TransBehavior tb;

	public FinalState4 (InitialState is, Event e,
		FinalState fs, Condition c, TransBehavior tb)
	{
		this.is = is;
		this.e = e;
		this.fs = fs;
		this.c = c;
		this.tb = tb;
	}
}