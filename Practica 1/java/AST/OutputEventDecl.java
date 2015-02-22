package AST;

import Errors.*;
import java.io.*;

public class OutputEventDecl implements IdentList
{
	public IdentList il;

	public OutputEventDecl (IdentList il)
	{
		this.il=il;
	}
}