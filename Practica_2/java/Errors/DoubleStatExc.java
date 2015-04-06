package Errors;

public class DoubleStatExc extends CompilerExc
{
	public DoubleStatExc()
	{
		System.out.println("Error: La asignacion ya fue realizada");
	}

	public DoubleStatExc (String message)
	{
		System.out.println(message);
	}
}
