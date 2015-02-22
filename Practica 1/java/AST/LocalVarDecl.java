package AST;

import Errors.*;
import java.io.*;

public class LocalVarDecl implements IdentList
{
	public IdentList il;

	public LocalVarDecl (IdentList il)
	{
		this.il = il;
	}
}