package AST;
import Compiler.*;
import Errors.*;

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
		el.computeType();
		if (SymbolTable.searchByName(this.i)==null)
		{
			throw new VarNoDefExc();
		}
		else
		{
			if (!SymbolTable.searchByName(this.i).getInit())
			{
					throw new DoubleInitVarExc();
			}
		}
	}

	public String computeTyp() throws CompilerExc
	{
		return null;
	}
}
