import java.util.*;
import java.io.*;
import GeneratedCodeLib.*;
public class ejem4
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
boolean cero;
boolean uno;
boolean dos;
boolean tres;
String currentState = s0;
cero=true;
uno=false;
dos=false;
tres=false;
for (String inputEvent : entradas)
{
nEventos++;
if (currentState.equals(s0) && inputEvent.equals(a) && !transNotFound){
currentState = s1;
transNotFound = true;
cero = false;uno = true;}
if (currentState.equals(s1) && inputEvent.equals(a) && !transNotFound){
currentState = s2;
transNotFound = true;
dos = true;uno = false;}
if (currentState.equals(s1) && inputEvent.equals(b) && !transNotFound){
currentState = s0;
transNotFound = true;
cero = true;uno = false;}
if (currentState.equals(s2) && inputEvent.equals(a) && !transNotFound){
currentState = s3;
transNotFound = true;
dos = false;tres = true;}
if (currentState.equals(s2) && inputEvent.equals(b) && !transNotFound){
currentState = s0;
transNotFound = true;
cero = true;dos = false;}
if (currentState.equals(s3) && inputEvent.equals(b) && !transNotFound){
currentState = s0;
transNotFound = true;
cero = true;tres = false;}
		output.insertaResultado("cero",cero,nEventos-1);
		output.insertaResultado("uno",uno,nEventos-1);
		output.insertaResultado("dos",dos,nEventos-1);
		output.insertaResultado("tres",tres,nEventos-1);
		if (currentState.equals(finalState))
		{
		 break;
		}
		transNotFound = false;
		}
		output.generarResultado();
		}
}
