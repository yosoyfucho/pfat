import java.util.*;
import java.io.*;
import GeneratedCodeLib.*;
public class ../Ejemplos/Ejem3/ejem3.stm {
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
public boolean l0;
public boolean l1;
public boolean l2;
public boolean c1;
public boolean c2;
public boolean s0;
public boolean s1;
public boolean s2;
public String currentState = s1;
s0=false;
output.insertaResultado("s0", false, nEventos-1);
s1=false;
output.insertaResultado("s1", false, nEventos-1);
s2=false;
output.insertaResultado("s2", false, nEventos-1);
l0=false;
output.insertaResultado("l0", false, nEventos-1);
l1=false;
output.insertaResultado("l1", false, nEventos-1);
l2=false;
output.insertaResultado("l2", false, nEventos-1);
c1=false;
output.insertaResultado("c1", false, nEventos-1);
c2=false;
output.insertaResultado("c2", false, nEventos-1);
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
}
if (currentState.equals(s2) && inputEvent.equals(b))
{
	currentState = s3;
}
if (currentState.equals(s3) && inputEvent.equals(a))
{
	currentState = s2;
}
if (currentState.equals(s3) && inputEvent.equals(b))
{
	currentState = s1;
}
if (currentState.equals(s3) && inputEvent.equals(c))
{
currentState = s4;
c1 = l0;
output.insertaResultado("c1", c1, nEventos-1);
l0 = !l0;
output.insertaResultado("l0", l0, nEventos-1);
c2 = c1 && l1;
output.insertaResultado("c2", c2, nEventos-1);
l1 = (c1 && !l1) || (!c1 && l1);
output.insertaResultado("l1", l1, nEventos-1);
l2 = (c2 && !l2) || (!c2 && l2);
output.insertaResultado("l2", l2, nEventos-1);
s0 = l0;
output.insertaResultado("s0", s0, nEventos-1);
s1 = l1;
output.insertaResultado("s1", s1, nEventos-1);
s2 = l2;
output.insertaResultado("s2", s2, nEventos-1);
}
if (currentState.equals(s4) && inputEvent.equals(a))
{
	currentState = s2;
}
if (currentState.equals(s4) && inputEvent.equals(b))
{
	currentState = s1;
}
if (currentState.equals(s4) && inputEvent.equals(c))
{
	currentState = s1;
}
if (currentState.equals(finalState))
{
break;
}
}
output.generarResultado();
}
}
