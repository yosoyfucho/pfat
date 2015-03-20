package AST;
import Errors.*; 

public class NotExpLog implements ExpLog 
{
	public ExpLog e;
	
	public NotExpLog (ExpLog e) {
		this.e = e;
	}
}
