import java.util.*;
import java.io.*;
import GeneratedCodeLib.*;
public class ../Ejemplos/Ejem5/ejem5.stm {
public static void main(String args[]){
BufferedReader r = new BufferedReader();
Vector<String> entradas = Entradas.obtener(r);
int numEventos = 0;
BufferedWriter w = new BufferedWriter();
Salida output = new Salida(w);
int nEventos = 0;
public String s0 = "s0";
public String s1 = "s1";
public String s2 = "s2";
public String s3 = "s3";
public String a = "a";
public String b = "b";
public boolean s0;
public boolean s1;
public boolean s2;
public boolean s3;
public String currentState = s0;
s0=true;
output.insertaResultado("s0", true, nEventos-1);
s1=false;
output.insertaResultado("s1", false, nEventos-1);
s2=false;
output.insertaResultado("s2", false, nEventos-1);
s3=false;
output.insertaResultado("s3", false, nEventos-1);
for (String inputEvent : entradas)
{
nEventos++;
if (currentState.equals(s0) && inputEvent.equals(a))
{
currentState = s1;
s0 = false;
output.insertaResultado("s0", s0, nEventos-1);
s1 = true;
output.insertaResultado("s1", s1, nEventos-1);
}
if (currentState.equals(s1) && inputEvent.equals(a))
{
currentState = s2;
s2 = true;
output.insertaResultado("s2", s2, nEventos-1);
s1 = false;
output.insertaResultado("s1", s1, nEventos-1);
}
if (currentState.equals(s1) && inputEvent.equals(b))
{
currentState = s0;
s0 = true;
output.insertaResultado("s0", s0, nEventos-1);
s1 = false;
output.insertaResultado("s1", s1, nEventos-1);
}
if (currentState.equals(s2) && inputEvent.equals(a))
{
currentState = s3;
s2 = false;
output.insertaResultado("s2", s2, nEventos-1);
s3 = true;
output.insertaResultado("s3", s3, nEventos-1);
}
if (currentState.equals(s2) && inputEvent.equals(b))
{
currentState = s0;
s0 = true;
output.insertaResultado("s0", s0, nEventos-1);
s2 = false;
output.insertaResultado("s2", s2, nEventos-1);
}
if (currentState.equals(s3) && inputEvent.equals(b))
{
currentState = s0;
s0 = true;
output.insertaResultado("s0", s0, nEventos-1);
s3 = false;
output.insertaResultado("s3", s3, nEventos-1);
}
if (currentState.equals(finalState))
{
break;
}
}
output.generarResultado();
}
}
