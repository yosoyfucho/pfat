import java.util.*;
import java.io.*;
import GeneratedCodeLib.*;
public class ejem5
{
	public static void main(String args[])
{
		iBufferedReader r = new BufferedReader(new FileReader(args[0]));
		BufferedWriter w = new BufferedWriter(new FileWriter(args[1]));
		Vector<String> entradas = Entradas.obtener(r);
		Salida output = new Salida(w);
		int numEventos = 0;
		boolean transNotFound = false;
		int nEventos = 0;
String s0 = "s0";
String s1 = "s1";
String s2 = "s2";
String s3 = "s3";
String a = "a";
String b = "b";
int nSalidas = 4;
boolean s0;
boolean s1;
boolean s2;
boolean s3;
String currentState = s0;
s0=true;
s1=false;
s2=false;
s3=false;
for (String inputEvent : entradas)
{
nEventos++;
if (currentState.equals(s0) && inputEvent.equals(a) && !transNotFound){
currentState = s1;
transNotFound = true;
s0 = false;
s1 = true;
}
if (currentState.equals(s1) && inputEvent.equals(a) && !transNotFound){
currentState = s2;
transNotFound = true;
s2 = true;
s1 = false;
}
if (currentState.equals(s1) && inputEvent.equals(b) && !transNotFound){
currentState = s0;
transNotFound = true;
s0 = true;
s1 = false;
}
if (currentState.equals(s2) && inputEvent.equals(a) && !transNotFound){
currentState = s3;
transNotFound = true;
s2 = false;
s3 = true;
}
if (currentState.equals(s2) && inputEvent.equals(b) && !transNotFound){
currentState = s0;
transNotFound = true;
s0 = true;
s2 = false;
}
if (currentState.equals(s3) && inputEvent.equals(b) && !transNotFound){
currentState = s0;
transNotFound = true;
s0 = true;
s3 = false;
}
		for(int i=0; i<nSalidas; i++)
indentacion{
		 output.insertaResultado(, , nEventos-1)
		}
		if (currentState.equals(finalState))
		{
		 break;
		}
		transNotFound = false;
		}
		output.generarResultado();
	}
}
