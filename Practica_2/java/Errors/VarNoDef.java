package Errors;

public class VarNoDef extends Exception
{
	public VarNoDef()
	{
		System.out.println("Error: Variable no definida");
	}

	public VarNoDef (String message)
	{
		System.out.println(message);
	}
}
