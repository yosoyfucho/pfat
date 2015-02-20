package Errors;

public class LexerException extends CompilerExc
{
	private String texto;

	public LexerException (String txt)
	{
		text = txt;
		System.out.println("Error Léxico");
	}

	public String toString()
	{
		return texto;
	}
}