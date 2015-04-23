package AST;
import Compiler.*;
import Errors.*;
import java.io.*;

public interface ExpLog
{
	public void computeType() throws CompilerExc;

	public String generateCode() throws IOException;
}
