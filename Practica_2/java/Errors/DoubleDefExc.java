package Errors;

public class DoubleDefExc extends CompilerExc
{
	public DoubleDefExc()
	{
		System.out.println("Error: Double Definition Variable Exception");
	}

	public DoubleDefExc (String ident)
	{
		System.out.println("Error: Double Definition Variable Exception");
		System.out.println("Error: Variable '" + ident + "' definida");
	}
}
