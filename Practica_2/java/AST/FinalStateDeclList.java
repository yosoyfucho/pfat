package AST;
import Errors.*;

/*
FinalStateDeclList ::= FINAL STATES IdentList:il PC {:RESULT = new FinalStateDeclList(il);:};
*/

public class FinalStateDeclList implements IdentList{
	public IdentList il;

	public FinalStateDeclList (IdentList il){
		this.il = il;

	}
}
