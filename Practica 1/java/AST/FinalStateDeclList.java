package AST;

import Errors.*;
import java.io.*;

public class FinalStateDeclList implements SimpleStatementList
{
	public IdenList il;
	public States s;

	public FinalStateDeclList (IdenList il,States s)
	{
		this.il = il;
		this.states = s;
	}
}