package AST;
import Compiler.*;

import Errors.*;

// No esta en el parser

public class SimpleStatementList3 implements SimpleStatementList{
	public StatementList sl;

	public SimpleStatementList3 (StatementList sl){
		this.sl = sl ;
	}
}
