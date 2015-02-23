package AST;

import Errors.*;
import java.io.*;

public class Statement3 implements Statement
{
	public Identi i;
	public ExpLog el;

	public Statement3 (Identi i, ExpLog el)
	{
		this.i = i;
		this.el = el;
	}
}