package AST;
import Errors.*;

public class InitialState implements Ident{
	public Ident i;

	public InitialState (Ident i){
		this.i = i;
	}
}