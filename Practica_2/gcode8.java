import java.util.*;
import java.io.*;
import GeneratedCodeLib.*;
public class ../Ejemplos/Ejem8/ejem8.stm {
public static void main(String args[]){
BufferedReader r = new BufferedReader();
Vector<String> entradas = Entradas.obtener(r);
int numEventos = 0;
BufferedWriter w = new BufferedWriter();
Salida output = new Salida(w);
int nEventos = 0;
public String s1 = "s1";
public String s2 = "s2";
public String s3 = "s3";
public String s4 = "s4";
public String a = "a";
public String b = "b";
public String c = "c";
public boolean sal1;
public String currentState = s1;
sal1=false;
output.insertaResultado("sal1", false, nEventos-1);
for (String inputEvent : entradas)
{
nEventos++;
if (currentState.equals(s1) && inputEvent.equals(a))
{
	currentState = s2;
}
if (currentState.equals(s2) && inputEvent.equals(c))
{
currentState = s1;
sal1 = false;
output.insertaResultado("sal1", sal1, nEventos-1);
}
if (currentState.equals(s2) && inputEvent.equals(b))
{
	currentState = s3;
}
if (currentState.equals(s3) && inputEvent.equals(a))
{
currentState = s2;
sal1 = false;
output.insertaResultado("sal1", sal1, nEventos-1);
}
if (currentState.equals(s3) && inputEvent.equals(b))
{
currentState = s1;
sal1 = false;
output.insertaResultado("sal1", sal1, nEventos-1);
}
if (currentState.equals(s3) && inputEvent.equals(c))
{
currentState = s4;
if ( (sal1) )
{
		break;
}
sal1 = true;
output.insertaResultado("sal1", sal1, nEventos-1);
}
if (currentState.equals(s2) && inputEvent.equals(a))
{
currentState = s2;
sal1 = false;
output.insertaResultado("sal1", sal1, nEventos-1);
}
if (currentState.equals(s4) && inputEvent.equals(a))
{
	currentState = s2;
}
if (currentState.equals(s4) && inputEvent.equals(b))
{
currentState = s1;
sal1 = false;
output.insertaResultado("sal1", sal1, nEventos-1);
}
if (currentState.equals(s4) && inputEvent.equals(c))
{
currentState = s1;
sal1 = false;
output.insertaResultado("sal1", sal1, nEventos-1);
}
if (currentState.equals(finalState))
{
break;
}
}
output.generarResultado();
}
}
