package GenerateCodeLib;

public class Prueba
{
	
	public static void main()
	{

		public String s1 = "s1";
		public String s2 = "s2";
		public String s3 = "s3";
		public String s4 = "s4";

		public String a = "a";
		public String b = "b";
		public String c = "c";

		public boolean sal;

		public String currentState = s1;
		public String finalState = s4;

		sal = false;

		BuffererReader r = new BuffererReader();
		
		Vector<String> entradas = new Vector<String>;
		
		entradas = obtener(BufferedReader br);

		BufferedWriter w = new BufferedWriter();

		Salida output = new Salida(w);

		int nEventos = entradas.size();

		for (String inputEvent : entradas)
		{
			if (currentState.equals(s1) && inputEvent.equals(a))
			{
				currentState = s2;
				output.insertaResultado(currentState, sal, nEventos-1);
				if (currentState.equals(finalState))
				{
					 output.generarResultado();
				}
			}

			if (currentState.equals(s2) && inputEvent.equals(c)) 
			{
				currentState = s1;
				output.insertaResultado(currentState, sal, nEventos-1);
				if (currentState.equals(finalState))
				{
					output.generarResultado();
				}
			}

			if (currentState.equals(s2) && inputEvent.equals(b)) 
			{
				currentState = s3;
				output.insertaResultado(currentState, sal, nEventos-1);
				if (currentState.equals(finalState))
				{
					output.generarResultado();
				}
			}

			if (currentState.equals(s3) && inputEvent.equals(a)) 
			{
				currentState = s2;
				output.insertaResultado(currentState, sal, nEventos-1);
				if (currentState.equals(finalState))
				{
					output.generarResultado();
				}
			}

			if (currentState.equals(s3) && inputEvent.equals(b)) 
			{
				currentState = s1;
				output.insertaResultado(currentState, sal, nEventos-1);
				if (currentState.equals(finalState))
				{
					output.generarResultado();
				}
			}

			if (currentState.equals(s3) && inputEvent.equals(c)) 
			{
				currentState = s4;
				sal = true;
				output.insertaResultado(currentState, sal, nEventos-1);
				if (currentState.equals(finalState))
				{
					output.generarResultado();
				}
			}

			nEventos--;
		}
	}
}