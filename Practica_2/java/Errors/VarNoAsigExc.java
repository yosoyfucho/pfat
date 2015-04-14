package Errors;

public class VarNoAsigExc extends CompilerExc
{
	public VarNoAsigExc()
	{
		System.out.println("Error: Variable Not Assigned Exception");
	}

	public VarNoAsigExc(String ident)
	{
		System.out.println("Error: Variable Not Assigned Exception");
		System.out.println("Error: Variable '" + ident + "' no incializada");
	}
}