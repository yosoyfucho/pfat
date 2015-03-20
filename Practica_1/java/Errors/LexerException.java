package Errors;

public class LexerException extends CompilerExc
{
	private String texto;

	public LexerException (String txt)
	{
		texto = txt;
		System.out.println("Error Léxico > " + texto);
	}

	public String toString()
	{
		return texto;
	}
}