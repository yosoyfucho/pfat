package Errors;

public class TranException extends CompilerExc
{
	public TranException()
	{
		System.out.println("Error: El estado inicial es final");
	}

	public TranException (String message)
	{
		System.out.println("Error: El estado inicial "+ message +" es final");
	}
}
