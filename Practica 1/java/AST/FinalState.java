package AST;

import Errors.*;
import java.io.*;

public class FinalState implements Ident
{
	public Ident i;

	public FinalState (Ident i)
	{
		this.i = i;
	}
}