package AST;

import Errors.*;
import java.io.*;

public class Condition implements ExpLog
{
	public ExpLog el;

	public Condition (ExpLog el)
	{
		this.el = el;
	}
}