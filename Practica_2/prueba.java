import java.io.*;
import java.util.*;
import GeneratedCodeLib.*;

/*
cd GeneratedCodeLib
javac -d ../class -cp ../../git_repository/pfat/CUP *.java
cd ..
javac -d class/ prueba.java -cp .
java -cp class/:../git_repository/pfat/CUP prueba ent1.txt sal1.txt
*/

public class prueba
{
	public static void main(String args[]) throws IOException, Exception
	{      	
      	java.io.BufferedReader in = new java.io.BufferedReader(new java.io.FileReader(args[0]));
      	java.io.BufferedWriter out = new java.io.BufferedWriter(new java.io.FileWriter(args[1]));

		Vector<String> entradas = GeneratedCodeLib.Entradas.obtener(in);

		Salida output = new Salida(out);

		int nEventos = 0;

		String s1 = "s1";
		String s2 = "s2";
		String s3 = "s3";

		String s4 = "s4";
		String finalState = s4;

		String a = "a";
		String b = "b";
		String c = "c";

		boolean sal;

		String currentState = s1;

		boolean transNotFound = false;	

		sal = false;

		for (String inputEvent : entradas)
		{

			nEventos++;

			System.out.println("Llega evento: ["+inputEvent+"]");

			if (currentState.equals(s1) && inputEvent.equals(a) && !transNotFound)
			{
				System.out.println("Transicion_1: Estado["+s1+"] a Estado["+s2+"]");
				currentState = s2;
				transNotFound = true;
				System.out.println("Estado Actual: ["+currentState+"]");
			}

			else if (currentState.equals(s2) && inputEvent.equals(c) && !transNotFound) 
			{
				System.out.println("Transicion_2 Estado["+s2+"] a Estado["+s1+"]");
				currentState = s1;
				transNotFound = true;
				System.out.println("Estado Actual: ["+currentState+"]");
			}

			else if (currentState.equals(s2) && inputEvent.equals(b) && !transNotFound) 
			{
				System.out.println("Transicion_3 Estado["+s2+"] a Estado["+s3+"]");
				currentState = s3;
				transNotFound = true;
				System.out.println("Estado Actual: ["+currentState+"]");
			}

			else if (currentState.equals(s3) && inputEvent.equals(a) && !transNotFound) 
			{
				System.out.println("Transicion_4 Estado["+s3+"] a Estado["+s2+"]");
				currentState = s2;
				transNotFound = true;
				System.out.println("Estado Actual: ["+currentState+"]");
			}

			else if (currentState.equals(s3) && inputEvent.equals(b) && !transNotFound) 
			{
				System.out.println("Transicion_5 Estado["+s3+"] a Estado["+s1+"]");
				currentState = s1;
				transNotFound = true;
				System.out.println("Estado Actual: ["+currentState+"]");
			}

			else if (currentState.equals(s3) && inputEvent.equals(c) && !transNotFound) 
			{
				System.out.println("Transicion_6 Estado["+s3+"] a Estado["+s4+"]");
				currentState = s4;
				transNotFound = true;
				sal = true;
				System.out.println("Estado Actual: ["+currentState+"]");
			}

			transNotFound = false;

			output.insertaResultado("sal", sal, nEventos-1);

			if (currentState.equals(finalState))
			{
				System.out.println("Estado final alcanzado");
				break;
			}			

			
			
		}

		output.generarResultado();
	}
}
