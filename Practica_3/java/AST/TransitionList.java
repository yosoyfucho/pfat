package AST;
import Compiler.*;
import Errors.*;
import java.io.*;

public interface TransitionList
{
	public void computeType() throws CompilerExc;
	public void generateCode(BufferedWriter w) throws IOException;


}
