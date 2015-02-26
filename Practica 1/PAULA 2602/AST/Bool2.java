package AST;
import Errors.*; 

public class Bool2 implements ExpLog {
	public ExpLog e1;
	public ExpLog e2;
	public boolean op;
	
	public Bool2 (ExpLog e1, ExpLog e2, boolean op) {
		this.e1 = e1;
		this.e2 = e2;
		this.op = op;
	}
}
