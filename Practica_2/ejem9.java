import java.util.*;
import java.io.*;
import GeneratedCodeLib.*;
public class ejem9
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
String a = "a";
String b = "b";
String c = "c";
int nSalidas = 1;
boolean sal;
String currentState = s1;
sal=false;
for (String inputEvent : entradas)
{
nEventos++;
if (currentState.equals(s1)	&& inputEvent.equals(a) && !transNotFound)
{
currentState = s2;
transNotFound = true;
}
if (currentState.equals(s2)	&& inputEvent.equals(c) && !transNotFound)
{
currentState = s1;
transNotFound = true;
}
if (currentState.equals(s2)	&& inputEvent.equals(b) && !transNotFound)
{
currentState = s3;
transNotFound = true;
}
if (currentState.equals(s3)	&& inputEvent.equals(a) && !transNotFound)
{
currentState = s2;
transNotFound = true;
}
if (currentState.equals(s3)	&& inputEvent.equals(b) && !transNotFound)
{
currentState = s1;
transNotFound = true;
}
if (currentState.equals(s3) && inputEvent.equals(c) && !transNotFound){
currentState = s3;
transNotFound = true;
sal = true;
	break;}
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
