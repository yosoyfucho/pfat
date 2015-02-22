package AST;

import Errors.*;
import java.io.*;

public class InitialState implements State
{
	public State is;

	public InitialState (State is)
	{
		this.is = is;
	}
}