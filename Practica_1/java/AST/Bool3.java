package AST;
import Errors.*; 

public class Bool3 implements ExpLog {
	public ExpLog e;
	
	public Bool3 (ExpLog e) {
		this.e = e;
	}
}
