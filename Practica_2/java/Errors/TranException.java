package Errors;

public class TranException extends CompilerExc
{
	public TranException()
	{
		System.out.println("Error: Transition Exception");
	}

	public TranException (String ident)
	{
		System.out.println("Error: Transition Exception");
		System.out.println("Error: El estado '" + ident + "' no es de tipo correcto");
	}
}
