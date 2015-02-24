package AST;

import Errors.*;
import java.io.*;

public class Initialization
{
	public Ident i;
	public SimpleStatementList ssl;

	public Initialization (Ident i, SimpleStatementList ssl)
	{
		this.i = i;
		this.ssl = ssl;
	}
}