import Parser.*;
import Lexer.*;
import Compiler.*;
import AST.*;
import GeneratedCodeLib.*;
import Errors.*;

import java.io.*;



public class Main
{

	public static void main(String args[]) throws Exception
	{
		java.io.BufferedReader in;
		Lexer.Yylex sc;
		parser p;

		S pr = null;

		java_cup.runtime.Symbol sroot;
		boolean error=false;

		//El primer parametro es el nombre del fichero con el programa
		if (args.length < 1)
		{
			System.out.println("Uso: java Main <nombre_fichero>");
			error=true;
		}

		//Analisis lexico y sintactico

		if (!error)
		{
			try
			{
		  		in = new java.io.BufferedReader(new java.io.FileReader(args[0]));
		  		sc = new Lexer.Yylex(in);
		  		p = new parser(sc);
		  		sroot = p.parse();
		  		pr =  (S)sroot.value;
		  		System.out.println("Analisis lexico y sintactico correctos");
			}
			catch(IOException e) 
			{
		  		System.out.println("Error abriendo fichero: " + args[0]);
		  		error= true;
			}
		}

		//Analisis Semantico
		if (!error)
		{
			error = true;
			pr.computeType();
			error = false;
			System.out.println("Analisis semantico correcto");
		}

		// Generacion de Codigo
		if (!error)
		{

			String nameFich = new String();
			String indentacion = "\t";

			if (args[0].contains("/"))
    		{
      			String [] aux = args[0].split("/");
      			int auxiliar = aux.length - 1;
      			String aux2 = aux[auxiliar];
     			String [] aux3 = aux2.split("\\.");
      			nameFich = aux3[0];
    		}
    		else
    		{
     			String [] aux4 = args[0].split("\\.");
      			nameFich = aux4[0];
    		}

			String ficheroJava = nameFich + ".java";
			java.io.BufferedWriter w = new java.io.BufferedWriter(new java.io.FileWriter(ficheroJava));

			try
			{
				w.write("import java.util.*;");
				w.newLine();
				w.write("import java.io.*;");
				w.newLine();
				w.write("import GeneratedCodeLib.*;");
				w.newLine();
				//System.out.println("El valor de nameFich es:"+nameFich);
				w.write("public class " + nameFich);
				w.newLine();
				w.write("{");
				w.newLine();

				w.write(indentacion+"public static void main(String args[])");
				w.newLine();
				indentacion+=indentacion;
				w.write("{");
				w.newLine();
				w.write(indentacion+"iBufferedReader r = new BufferedReader(new FileReader(args[0]));");
				w.newLine();
				w.write(indentacion+"BufferedWriter w = new BufferedWriter(new FileWriter(args[1]));");
				w.newLine();
				w.write(indentacion+"Vector<String> entradas = Entradas.obtener(r);");
				w.newLine();



				w.write(indentacion+"Salida output = new Salida(w);");
				w.newLine();
				w.write(indentacion+"int numEventos = 0;");
				w.newLine();
				w.write(indentacion+"boolean transNotFound = false;");

				w.newLine();
				w.write(indentacion+"int nEventos = 0;");
				w.newLine();

				pr.generateCode(w); 

				String [] outputs = SymbolTable.searchByType("output").split(",");
				for(String out : outputs)
				{
					////////////////////////////////////////////////////
					w.write(indentacion+"output.insertaResultado(\""+out+"\","+out+",nEventos-1);");
					////////////////////////////////////////////////////
					w.newLine();
				}

				w.write(indentacion+"if (currentState.equals(finalState))");         
				w.newLine();
				w.write(indentacion+"{");
				w.newLine();
				w.write(indentacion+ " " +"break;");
				w.newLine();
				w.write(indentacion+"}");
				w.newLine();

				w.write(indentacion+"transNotFound = false;");
				w.newLine();

				w.write(indentacion+"}"); //for
				w.newLine();
				
				w.write(indentacion+"output.generarResultado();");
				w.newLine();

				w.write(indentacion+"}"); //public static void main
				w.newLine();
				
				w.write("}"); //public class
			  	w.newLine();
			  	
			  	w.close();
			}
			catch (IOException e)
			{
			  	System.out.println("Error abriendo fichero: " + ficheroJava);
			  	error = true;
			}
			System.out.println("Generacion de codigo correcto");
		}
	}
}
