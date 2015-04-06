package Errors;

public class DoubleTranExc extends CompilerExc
{
	public DoubleTranExc()
	{
		System.out.println("Error: Transicion ya definida");
	}

	public DoubleTranExc (String message)
	{
		System.out.println("Error: Estados en la transicion "+ message +" ya definidos");
	}
}
