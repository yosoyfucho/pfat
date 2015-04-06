package Errors;

public class VarNoDefExc extends CompilerExc
{
	public VarNoDefExc()
	{
		System.out.println("Error: Variable no definida");
	}

	public VarNoDefExc (String message)
	{
		System.out.println(message);
	}
}
