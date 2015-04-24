package GenerateCodeLib;

import java.io.*;

public class Prueba
{
	
	public static void main()
	{

		BuffererReader r = new BuffererReader();
		
		Vector<String> entradas = new Vector<String>();

		entradas = Entradas.obtener(BufferedReader br);

		BufferedWriter w = new BufferedWriter();

		Salida output = new Salida(w);

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