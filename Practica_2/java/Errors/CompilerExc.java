package Errors;

public class CompilerExc extends Exception
{
	public CompilerExc()
	{
		System.out.println("Error en la compilacion");
	}

	public CompilerExc (String message)
	{
		System.out.println(message);
	}
}
