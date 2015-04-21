package AST;
import Compiler.*;
import Errors.*;

public interface IdentList
{
	public String computeType() throws CompilerExc;
	public String generateArguments();
	public void generateLocalVariables(BufferedWriter w) throws IOException;

	//
	public String generateResult(BufferedWriter w) throws IOException;

	//Escribir codigo
	public void generateCode(BufferedWriter w) throws IOException

}
