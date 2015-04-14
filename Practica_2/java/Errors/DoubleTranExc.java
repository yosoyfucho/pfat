package Errors;

public class DoubleTranExc extends CompilerExc
{
	public DoubleTranExc()
	{
		System.out.println("Error: Double Transition Exception");
	}

	public DoubleTranExc (String message)
	{
		System.out.println("Error: Double Transition Exception");
		System.out.println("Error: Estados en la transicion '" + message + "' ya definidos");
	}
}
