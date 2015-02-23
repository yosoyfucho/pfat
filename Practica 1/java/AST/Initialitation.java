package AST;

import Errors.*;
import java.io.*;

public class Initialitation implements <>
{
	public Ident i;
	public SimpleStatementList ssl;

	public TransitionList1 (Ident i, SimpleStatementList ssl)
	{
		this.i = i;
		this.ssl = ssl;
	}