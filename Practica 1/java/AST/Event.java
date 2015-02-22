package AST;

import Errors.*;
import java.io.*;

public class Event implements Ident
{
	public Ident i;

	public Event (Ident i)
	{
		this.i=i;
	}	
}