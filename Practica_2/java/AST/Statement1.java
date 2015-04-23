package AST;
import Compiler.*;
import Errors.*;

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

	public void generateCode(BufferedWritter w) throws IOException
	{

	}
}
