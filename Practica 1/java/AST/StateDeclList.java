package AST;

import Errors.*;
import java.io.*;

public class StateDeclList implements SimpleStatementList
{
	public IdenList il;
	public States s;

	public StateDeclList (IdenList il,States s)
	{
		this.il = il;
		this.states = s;
	}
}