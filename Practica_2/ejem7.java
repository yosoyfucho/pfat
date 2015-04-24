import java.util.*;
import java.io.*;
import GeneratedCodeLib.*;
public class ejem7
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
String s1 = "s1";
String s2 = "s2";
String s3 = "s3";
String s4 = "s4";
String s5 = "s5";
String finalState = s5;
String a = "a";
String b = "b";
String c = "c";
String d = "d";
int nSalidas = 2;
boolean s1;
boolean s2;
String currentState = s1;
s1=false;
s2=false;
for (String inputEvent : entradas)
{
nEventos++;
if (currentState.equals(s1)	&& inputEvent.equals(a) && !transNotFound)
{
currentState = s2;
transNotFound = true;
}
if (currentState.equals(s2) && inputEvent.equals(c) && !transNotFound){
currentState = s1;
transNotFound = true;
s1 = false;
s2 = false;
}
if (currentState.equals(s2) && inputEvent.equals(a) && !transNotFound){
currentState = s2;
transNotFound = true;
s1 = false;
s2 = false;
}
if (currentState.equals(s2)	&& inputEvent.equals(b) && !transNotFound)
{
currentState = s3;
transNotFound = true;
}
if (currentState.equals(s3) && inputEvent.equals(a) && !transNotFound){
currentState = s2;
transNotFound = true;
s1 = false;
s2 = false;
}
if (currentState.equals(s3) && inputEvent.equals(b) && !transNotFound){
currentState = s1;
transNotFound = true;
s1 = false;
s2 = false;
}
if (currentState.equals(s3) && inputEvent.equals(c) && !transNotFound){
currentState = s4;
transNotFound = true;
if ( s1 )
{
	s2 = true;

}
if ( !s1 )
{
	s1 = true;

}
}
if (currentState.equals(s4) && inputEvent.equals(d) && !transNotFound)
{
if  (s2)
{
currentState = s5;
transNotFound = true;
}
}
if (currentState.equals(s4) && inputEvent.equals(a) && !transNotFound){
currentState = s2;
transNotFound = true;
if ( s2 )
{
		break;
}
}
if (currentState.equals(s4) && inputEvent.equals(b) && !transNotFound){
currentState = s1;
transNotFound = true;
if ( s2 )
{
		break;
}
s1 = false;
}
if (currentState.equals(s4) && inputEvent.equals(c) && !transNotFound){
currentState = s1;
transNotFound = true;
s1 = false;
if ( s2 )
{
		break;
}
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
