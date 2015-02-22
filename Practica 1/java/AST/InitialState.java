package AST;

import Errors.*;
import java.io.*;

public class InitialState implements Ident
{
	public Ident i;

	public InitialState (Ident i)
	{
		this.i = i;
	}
}