package AST;

import Errors.*;
import java.io.*;

public class Initialitation
{
	public Ident i;
	public SimpleStatementList ssl;

	public Initialitation (Ident i, SimpleStatementList ssl)
	{
		this.i = i;
		this.ssl = ssl;
	}
}