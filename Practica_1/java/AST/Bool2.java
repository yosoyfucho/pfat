package AST;
import Errors.*; 

public class Bool2 implements ExpLog {
	public ExpLog e1;
	public ExpLog e2;
	//public boolean op;
	
	//public Bool2 (ExpLog e1, ExpLog e2, boolean op) {
	public Bool2 (ExpLog e1, ExpLog e2) {
		this.e1 = e1;
		this.e2 = e2;
	}
}
