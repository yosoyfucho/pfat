package AST;
import Compiler.*;
import Errors.*;
import java.io.*;

public interface SimpleStatementList
{
	public void computeType() throws CompilerExc;
	public void generateCode(BufferedWriter w) throws IOException;
}
