package Errors;

public class DoubleInitVarExc extends CompilerExc
{
	public DoubleInitVarExc()
	{
		System.out.println("Error: Variable ya inicializada");
	}

	public DoubleInitVarExc (String message)
	{
		System.out.println("Error: Variable "+ message +" ya inicializada");
	}
}
