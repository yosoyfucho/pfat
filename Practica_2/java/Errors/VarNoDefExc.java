package Errors;

public class VarNoDefExc extends CompilerExc
{
	public VarNoDefExc()
	{
		System.out.println("Error: Variable Not Defined Exception");
	}

	public VarNoDefExc (String ident)
	{
		System.out.println("Error: Variable Not Defined Exception");
		System.out.println("Error: La variable '" + ident + "' no ha sido definida");
	}
}
