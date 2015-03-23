package AST;
import Errors.*; 

public class notExpLog implements ExpLog {
	public ExpLog e;
	
	public notExpLog (ExpLog e) {
		this.e = e;
	}
}
