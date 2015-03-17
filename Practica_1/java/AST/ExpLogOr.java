package AST;
import Errors.*; 

public class ExpLogOr implements ExpLog 
{
	public ExpLog e1;
	public ExpLog e2;

	public ExpLogOr (ExpLog e1, ExpLog e2) {
		this.e1 = e1;
		this.e2 = e2;
	}
}
