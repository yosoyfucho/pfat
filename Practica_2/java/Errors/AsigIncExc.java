package Errors;

public class AsigIncExc extends CompilerExc
{
	public AsigIncExc()
	{
		System.out.println("Error: Assignament Incorrect Exception");
	}

	public AsigIncExc(String message)
	{
		System.out.println("Error: Assignament Incorrect Exception");
		System.out.println("Error: Asignación de tipo incorrecta: " + message);
	}
}