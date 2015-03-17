package AST;
import Errors.*; 

public class ParenExpLogTesis implements ExpLog 
{
	public ExpLog e;
	
	public ParenExpLogTesis (ExpLog e) {
		this.e = e;
	}
}
