package AST;

import Errors.*;
import java.io.*;

public class SimpleStatementList1 implements SimpleStatementList
{
	public Ident i;
	public Clog cl;

	public SimpleStatementList1 (Ident i, Clog cl)
	{
		this.i = i;
		this.cl = cl;
	}
}