package GenerateCodeLib;

import java.io.*;

public class Prueba
{
	
	public static void main()
	{
      	
      	java.io.BufferedReader in = new java.io.BufferedReader(new java.io.FileReader(args[0]));
      	java.io.BufferedWriter out = new java.io.BufferedWriter(new java.io.FileWriter(args[1]));

      	BuffererReader r = new BuffererReader();
		
		Vector<String> entradas = Entradas.obtener(r);

		Salida output = new Salida(out);

		int nEventos = 0;

		public String s1 = "s1";
		public String s2 = "s2";
		public String s3 = "s3";

		public String s4 = "s4";
		public String finalState = s4;

		public String a = "a";
		public String b = "b";
		public String c = "c";

		public boolean sal;

		public String currentState = s1;		

		sal = false;
		output.insertaResultado(sal, false, nEventos-1);

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
				sal = true;
				output.insertaResultado(sal, false, nEventos-1);
			}

			if (currentState.equals(finalState))
			{
				break;
			}			
			
		}

		output.generarResultado();
	}
}