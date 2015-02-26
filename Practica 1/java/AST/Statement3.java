package AST;

import Errors.*;
import java.io.*;

public class Statement3 implements Statement
{
	public Ident i;
	public ExpLog el;

	public Statement3 (Ident i, ExpLog el)
	{
		this.i = i;
		this.el = el;
	}
}