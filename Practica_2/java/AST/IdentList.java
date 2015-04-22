package AST;
import Compiler.*;
import Errors.*;

public interface IdentList
{
	public String computeType() throws CompilerExc;	
	public String generateCode() throws IOException;
}
