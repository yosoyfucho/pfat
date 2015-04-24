package AST;
import Compiler.*;
import Errors.*;
import java.io.*;

public interface Transition
{
	public void computeType() throws CompilerExc;

	public void generateCode(BufferedWriter w, int nTransitions) throws IOException;
}
