package AST;

import Errors.*;
import java.io.*;

public class Statement1 implements Statement
{
	public Statement s;
	public Statement es;

	public Statement1 (Statement s, Statement es)
	{
		this.s = s;
		this.es = es;
	}
}