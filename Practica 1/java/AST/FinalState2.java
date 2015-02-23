package AST;

import Errors.*;
import java.io.*;

public class FinalState2 implements FinalState
{
	public InitialState is;
	public Event e;
	public FinalState fs;
	public TransBehavior tb;

	public FinalState2 (InitialState is, Event e, FinalState fs, TransBehavior tb)
	{
		this.is = is;
		this.e = e;
		this.fs = fs;
		this.tb = tb;
	}
}