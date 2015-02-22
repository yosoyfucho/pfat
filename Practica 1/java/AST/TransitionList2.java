package AST;

import Errors.*;
import java.io.*;

public class TransitionList2 implements TransitionList
{
	public Transition t;
	public TransitionList tl;

	public TransitionList1 (Transition t, TransitionList tl)
	{
		this.t = t;
		this.tl = tl;
	}
}