package AST;
import Compiler.*;
import Errors.*;

public interface Statement
{
	public void computeType() throws CompilerExc;
	public String computeTyp() throws CompilerExc;
	public void generateCode(BufferedWritter w) throws IOException;
}
