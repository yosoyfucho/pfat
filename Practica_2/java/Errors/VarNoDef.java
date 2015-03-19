package Errors;

public class VarNoDef extends Exception
{
	public VarNoDef()
	{
		System.out.println("Error");
	}

	public VarNoDef (String message)
	{
		System.out.println(message);
	}
}
