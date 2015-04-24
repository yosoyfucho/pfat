package AST;
import Compiler.*;
import Errors.*;
import java.io.*;

// Statement ::= STOP PC

public class Statement1 implements Statement
{
	public String computeTyp() throws CompilerExc
	{
			return "STOP";
	}

	public void computeType() throws CompilerExc
	{

	}

	public void generateCode(BufferedWriter w) throws IOException
	{
		w.write("	break;");
	}
}
