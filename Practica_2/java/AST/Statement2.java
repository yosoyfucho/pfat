package AST;
import Compiler.*;
import Errors.*;

// Statement ::= IDENT:i ASIG ExpLog:el PC

public class Statement2 implements Statement
{
	public final String i;
	public final ExpLog el;

	public Statement2 (String i, ExpLog el)
	{
		this.i = i;
		this.el = el;
	}

	public void computeType() throws CompilerExc
	{

		if ( SymbolTable.searchByName(this.i)==null )
		{
			throw new VarNoDefExc(this.i);
		}
		if ( SymbolTable.searchLocalOrOutputByName(this.i)==null )
		{
			throw new TypIncExc(this.i);
		}
		
		el.computeType();
	}

	public String computeTyp() throws CompilerExc
	{
		return "";
	}

	public void generateCode(BufferedWritter w) throws IOException
	{
		
	}
}
