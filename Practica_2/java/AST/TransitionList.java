package AST;
import Compiler.*;
import Errors.*;

public interface TransitionList
{
	public void computeType() throws CompilerExc;
	public void generateCode(BufferedWritter w) throws IOException;
}
