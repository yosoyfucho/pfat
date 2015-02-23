package AST;

import Errors.*;
import java.io.*;

public class FinalState1 implements FinalState
{
	public Ident i;
	public InitialState is;
	public Event e;
	public FinalState fs;

	public FinalState1 (Ident i, InitialState is, Event e, FinalState fs)
	{
		this.i = i;
		this.is = is;
		this.e = e;
		this.fs = fs;
	}
}