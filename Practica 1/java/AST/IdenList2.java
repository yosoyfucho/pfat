package AST;

import Errors.*;
import java.io.*;

public class IdenList2 implements IdenList
{
	public IdenList i;
	public IdenList il;

	public IdenList2 (IdenList i, IdenList il)
	{
		this.i=i;
		this.il = il;
	}
}