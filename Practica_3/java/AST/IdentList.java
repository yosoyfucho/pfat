package AST;
import Compiler.*;
import Errors.*;
import java.io.*;

public interface IdentList
{
	public String computeType() throws CompilerExc;	
	public String generateCode() throws IOException;
}
