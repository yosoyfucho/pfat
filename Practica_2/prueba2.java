package GeneratedCodeLib;

public class prueba2
{
	/*
	Codigo interpretado a java
	de ejem2.stm
	*/
	public static void main()
	{

		BuffererReader br = new BuffererReader();

		Entradas entries = new Entradas();

		Vector<String> leidas = new Vector<String>;

		leidas = entries.obtener(BufferedReader br);

		BufferedWriter w = new BufferedWriter();

		Salida output = new Salida(w);

		int nEventos = leidas.size();

		/*
		states s1,s2,s3,s4
		*/

		public String s1 = "s1";
		public String s2 = "s2";
		public String s3 = "s3";
		public String s4 = "s4";

		/*
		inputs a,b,c
		*/
		public String a = "a";
		public String b = "b";
		public String c = "c";

		/*
		output sal;
		*/
		public boolean sal;

		/*
		starts with s1
		*/
		public String currentState = s1;

		/*
		sal:='0'
		*/
		sal = false;


		output.insertaResultado(sal, false, nEventos-1);

		for (String inputEvent : leidas)
		{

			nEventos++;

			/*
			transition(s1,a,s2)
			*/
			if (currentState.equals(s1) && inputEvent.equals(a))
			{
				currentState = s2;
			}

			/*
			transition(s2,c,s1)
			*/
			if (currentState.equals(s2) && inputEvent.equals(c))
			{
				currentState = s1;
			}

			/*
			transition(s2,b,s3)
			*/
			if (currentState.equals(s2) && inputEvent.equals(b))
			{
				currentState = s3;
			}

			/*
			transition(s3,a,s2)
			*/
			if (currentState.equals(s3) && inputEvent.equals(a))
			{
				currentState = s2;
			}

			/*
			transition(s3,b,s1)
			*/
			if (currentState.equals(s3) && inputEvent.equals(b))
			{
				currentState = s1;
			}

			/*
				transition(s3,c,s4)
				behaviour
				sal:='1'
			*/
			if (currentState.equals(s3) && inputEvent.equals(c))
			{
				currentState = s4;
				sal = true;
				output.insertaResultado(sal, false, nEventos-1);
			}

			/*
				transition(s4,a,s2)
				behaviour
				sal:='0'
			*/
			if (currentState.equals(s4) && inputEvent.equals(a))
			{
				currentState = s2;
				sal = false;
				output.insertaResultado(sal, false, nEventos-1);
			}

			/*
				transition(s4,b,s1)
				behaviour
				sal:='0'
			*/
			if (currentState.equals(s4) && inputEvent.equals(b))
			{
				currentState = s1;
				sal = false;
				output.insertaResultado(sal, false, nEventos-1);
			}

			/*
				transition(s4,c,s1)
				behaviour
				sal:='0'
			*/
			if (currentState.equals(s4) && inputEvent.equals(c))
			{
				currentState = s1;
				sal = false;
				output.insertaResultado(sal, false, nEventos-1);
			}
		}

		output.generarResultado();
	}
}
