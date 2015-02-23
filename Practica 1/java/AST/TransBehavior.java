package AST;

import Errors.*;
import java.io.*;

public class TransBehavior implements Transitions
{
	public Statement s;

	public TransBehavior (Statement s)
	{
		this.s = s;
	}
}