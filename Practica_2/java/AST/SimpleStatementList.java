package AST;
import Compiler.*;
import Errors.*;

public interface SimpleStatementList
{
	public void computeType() throws CompilerExc;
	public void GenerateCode(BufferedWritter w) throws IOException;
}
