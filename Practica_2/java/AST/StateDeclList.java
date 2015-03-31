package AST;
import Errors.*;

/*
StateDeclList ::= STATES IdentList:il PC	{:RESULT = new StateDeclList(il);:};
*/

public class StateDeclList implements IdentList{
	public IdentList il;

	public StateDeclList (IdentList il){
		this.il = il;
	}
}
