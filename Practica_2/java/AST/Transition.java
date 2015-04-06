package AST;
import Compiler.*;
import Errors.*;

public interface Transition
{
	public void computeType() throws CompilerExc;
}
