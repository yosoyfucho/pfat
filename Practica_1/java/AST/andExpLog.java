package AST;
import Errors.*; 

public class andExpLog implements ExpLog 
{
	public ExpLog e1;
	public ExpLog e2;
	
	public andExpLog (ExpLog e1, ExpLog e2) 
	{
		this.e1 = e1;
		this.e2 = e2;
	}
}
