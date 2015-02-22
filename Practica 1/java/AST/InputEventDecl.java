package AST;

import Errors.*;
import java.io.*;

public class InputEventDecl implements IdentList
{
	public IdentList il;

	public InputEventDecl (IdentList il)
	{
		this.il=il;
	}
}