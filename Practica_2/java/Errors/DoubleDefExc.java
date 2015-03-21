package Errors;

public class DoubleDefExc extends Exception
{
	public DoubleDefExc()
	{
		System.out.println("Error: Variable ya definida");
	}

	public DoubleDefExc (String message)
	{
		System.out.println("Error: Variable "+ message +" ya definida");
	}
}
