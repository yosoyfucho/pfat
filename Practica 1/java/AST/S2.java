package AST;

import Errors.*;
import java.io.*;

public class S2 implements S
{
	StateDeclList sdl;
	FinalStateDeclList fsdl;
	InputEventDecl ied;
	OutputEventDecl oed;
	Initialitation i;
	Transitions t;

	public S2 (StateDeclList sdl,FinalStateDeclList fsdl,
	InputEventDecl ied, OutputEventDecl oed, 
	Initialitation i, Transitions t)
	{
		this.sdl = sdl;
		this.fsdl = fdsl;
		this.ied = ied;
		this.oed = oed;
		this.i = i;
		this.t = t;
	}
}