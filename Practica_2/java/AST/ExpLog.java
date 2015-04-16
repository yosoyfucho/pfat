package AST;
import Compiler.*;
import Errors.*;

public interface ExpLog
{
	public void computeType() throws CompilerExc;

	public String generateCode() throws IOException;
}
