package Errors;

public class DoubleInitVarExc extends CompilerExc
{
	public DoubleInitVarExc()
	{
		System.out.println("Error: Double Initialitation Variable Exception");
	}

	public DoubleInitVarExc (String ident)
	{
		System.out.println("Error: Double Initialitation Variable Exception");
		System.out.println("Error: Variable '" + ident + "' inicializada");
	}
}
