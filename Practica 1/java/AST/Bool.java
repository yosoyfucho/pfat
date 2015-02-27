package AST;
import Errors.*; 

public class Bool implements ExpLog {
	public boolean c;
	
	public Bool (boolean c) {
		this.c = c;
	}
}
