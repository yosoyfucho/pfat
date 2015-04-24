package GeneratedCodeLib;

public class prueba3
{

	public static void main()
	{
		/*
		Codigo reinterpretado
		ejem3.stm

		*/
		BuffererReader r = new BuffererReader();

		Vector<String> entradas = new Vector<String>;

		entradas = obtener(BufferedReader br);

		BufferedWriter w = new BufferedWriter();

		Salida output = new Salida(w);

		int nEventos = 0;

		/*
		states s1,s2,s3,s4;
		*/
		public String s1 = "s1";
		public String s2 = "s2";
		public String s3 = "s3";
		public String s4 = "s4";


		// There's no final state

		/*
		inputs a,b,c;
		*/
		public String a = "a";
		public String b = "b";
		public String c = "c";

		/*
		local l0,l1,l2,c1,c2;
		*/
		public boolean l0;
		public boolean l1;
		public boolean l2;
		public boolean c1;
		public boolean c2;

		/*
		outputs s0,s1,s2;
		*/
		public boolean s0,s1,s2;

		public String currentState = s1;

		/*
		s0:='0';
		s1:='0';
		s2:='0';
		l0:='0';
		l1:='0';
		l2:='0';
		c1:='0';
		c2:='0';
		*/
		s0 = false;
		s1 = false;
		s2 = false;
		l0 = false;
		l1 = false;
		l2 = false;
		c1 = false;
		c2 = false;

		/*
		Recording the values from the beginning
		*/
		output.insertaResultado(s0, false, nEventos);
		output.insertaResultado(s1, false, nEventos);
		output.insertaResultado(s2, false, nEventos);

		for (String inputEvent : entradas)
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
				transition(s3,a,s2);
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
				c1:= l0;
				l0:= not l0;
				c2:= c1 and l1;
				l1:= (c1 and not l1) or (not c1 and l1);
				l2:= (c2 and not l2) or (not c2 and l2);
				s0:=l0;
				s1:=l1;
				s2:=l2;
			*/
			if (currentState.equals(s3) && inputEvent.equals(c))
			{
				currentState = s4;
				c1 = l0;
				l0 = !l0;
				c2 = c1 && l1;
				l1 = (c1 && (!l1)) || ((!c1) && l1);
				l2 = (c2 && (!l2)) || ((!c2) && l2);
				s0 = l0;
				s1 = l1;
				s2 = l2;

				/*
				Recording the values
				*/
				output.insertaResultado(s0, s0, nEventos-1);
				output.insertaResultado(s1, s1, nEventos-1);
				output.insertaResultado(s2, s2, nEventos-1);
			}

			/*
				transition(s4,a,s2)
			*/
			if (currentState.equals(s4) && inputEvent.equals(a))
			{
				currentState = s2;
			}

			/*
				transition(s4,b,s1)
			*/
			if (currentState.equals(s4) && inputEvent.equals(b))
			{
				currentState = s1;
			}

			/*
				transition(s4,c,s1)
			*/
			if (currentState.equals(s4) && inputEvent.equals(c))
			{
				currentState = s1;
			}

		}

		output.generarResultado();
	}
}
