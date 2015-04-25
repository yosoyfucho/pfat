package AST;
import Compiler.*;
import Errors.*;
import java.io.*;

public interface Statement
{
	public void computeType() throws CompilerExc;
	public String computeTyp() throws CompilerExc;
	public void generateCode(BufferedWriter w) throws IOException;
}
