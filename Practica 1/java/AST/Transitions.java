package AST;

import Errors.*;
import java.io.*;

public class Transitions implements TransitionList
{
	public TransitionList tl;

	public Transitions (TransitionList tl)
	{
		this.tl = tl;
	}
}