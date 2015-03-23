package AST;
import Errors.*; 

public class parenExpLogTesis implements ExpLog {
	public ExpLog e;
	
	public parenExpLogTesis (ExpLog e) {
		this.e = e;
	}
}
