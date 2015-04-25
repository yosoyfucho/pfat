package Errors;

public class CompilerExc extends Exception
{
	public CompilerExc()
	{
		System.out.println("Error: Compiler Exception");
	}

	public CompilerExc (String message)
	{
		System.out.println(message);
	}
}
