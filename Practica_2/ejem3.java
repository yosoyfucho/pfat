import java.util.*;
import java.io.*;
import GeneratedCodeLib.*;
public class ejem3
{
	public static void main(String args[])
{
		BufferedReader r = new BufferedReader(new FileReader(args[0]));
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
String a = "a";
String b = "b";
String c = "c";
boolean l0;
boolean l1;
boolean l2;
boolean c1;
boolean c2;
int nSalidas = 3;
boolean s0;
boolean s1;
boolean s2;
String currentState = s1;
s0=false;
s1=false;
s2=false;
l0=false;
l1=false;
l2=false;
c1=false;
c2=false;
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
currentState = s4;
transNotFound = true;
c1 = l0;l0 = !l0;c2 = c1 && l1;l1 = (c1 && !l1) || (!c1 && l1);l2 = (c2 && !l2) || (!c2 && l2);s0 = l0;s1 = l1;s2 = l2;
}
if (currentState.equals(s4)	&& inputEvent.equals(a) && !transNotFound)
{
currentState = s2;
transNotFound = true;
}
if (currentState.equals(s4)	&& inputEvent.equals(b) && !transNotFound)
{
currentState = s1;
transNotFound = true;
}
if (currentState.equals(s4)	&& inputEvent.equals(c) && !transNotFound)
{
currentState = s1;
transNotFound = true;
}
		output.insertaResultado("s0",s0,nEventos-1);
		output.insertaResultado("s1",s1,nEventos-1);
		output.insertaResultado("s2",s2,nEventos-1);
		if (currentState.equals(finalState))
		{
		 break;
		}
		transNotFound = false;
		}
		output.generarResultado();
		}
}
