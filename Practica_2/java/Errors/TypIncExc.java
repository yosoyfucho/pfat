package Errors;

public class TypIncExc extends CompilerExc
{
	public TypIncExc()
	{
		System.out.println("Error: Type Incorrect Exception");
	}

	public TypIncExc (String ident)
	{
		System.out.println("Error: Type Incorrect Exception");
		System.out.println("Error: La variable '" + ident + "' no esta declarada como tipo local o output");
	}
}