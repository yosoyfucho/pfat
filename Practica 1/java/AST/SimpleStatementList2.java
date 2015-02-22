package AST;

import Errors.*;
import java.io.*;

public class SimpleStatementList2 implements SimpleStatementList
{
	public Ident i;
	public Clog cl;

	public SimpleStatementList2 (Ident i, Clog cl)
	{
		this.i = i;
		this.cl = cl;
	}
}