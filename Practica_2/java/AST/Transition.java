package AST;
import Compiler.*;
import Errors.*;

public interface Transition
{
	public InitialState is;
	public Event i;
	public FinalState fs;

	public void computeType() throws CompilerExc;
}
