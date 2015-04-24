import java.util.*;
import java.io.*;
import GeneratedCodeLib.*;
public class ../Ejemplos/Ejem4/ejem4.stm {
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
public boolean cero;
public boolean uno;
public boolean dos;
public boolean tres;
public String currentState = s0;
cero=true;
output.insertaResultado("cero", true, nEventos-1);
uno=false;
output.insertaResultado("uno", false, nEventos-1);
dos=false;
output.insertaResultado("dos", false, nEventos-1);
tres=false;
output.insertaResultado("tres", false, nEventos-1);
for (String inputEvent : entradas)
{
nEventos++;
if (currentState.equals(s0) && inputEvent.equals(a))
{
currentState = s1;
cero = false;
output.insertaResultado("cero", cero, nEventos-1);
uno = true;
output.insertaResultado("uno", uno, nEventos-1);
}
if (currentState.equals(s1) && inputEvent.equals(a))
{
currentState = s2;
dos = true;
output.insertaResultado("dos", dos, nEventos-1);
uno = false;
output.insertaResultado("uno", uno, nEventos-1);
}
if (currentState.equals(s1) && inputEvent.equals(b))
{
currentState = s0;
cero = true;
output.insertaResultado("cero", cero, nEventos-1);
uno = false;
output.insertaResultado("uno", uno, nEventos-1);
}
if (currentState.equals(s2) && inputEvent.equals(a))
{
currentState = s3;
dos = false;
output.insertaResultado("dos", dos, nEventos-1);
tres = true;
output.insertaResultado("tres", tres, nEventos-1);
}
if (currentState.equals(s2) && inputEvent.equals(b))
{
currentState = s0;
cero = true;
output.insertaResultado("cero", cero, nEventos-1);
dos = false;
output.insertaResultado("dos", dos, nEventos-1);
}
if (currentState.equals(s3) && inputEvent.equals(b))
{
currentState = s0;
cero = true;
output.insertaResultado("cero", cero, nEventos-1);
tres = false;
output.insertaResultado("tres", tres, nEventos-1);
}
if (currentState.equals(finalState))
{
break;
}
}
output.generarResultado();
}
}
