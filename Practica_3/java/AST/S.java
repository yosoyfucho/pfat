package AST;
import Compiler.*;
import Errors.*;
import java.io.*;

public interface S
{
	
	public void computeType() throws CompilerExc;

	public void generateCode(BufferedWriter w) throws IOException;
}
