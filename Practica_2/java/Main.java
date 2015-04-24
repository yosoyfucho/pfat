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
      System.out.println(
      "Uso: java Main <nombre_fichero>");
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
      String nameFich = args[0];
      String ficheroJava = args[1] + ".java";
      BufferedWriter w = new BufferedWriter(new FileWriter(ficheroJava));

      try
      {
        w.write("import java.util.*;");
        w.newLine();
        w.write("import java.io.*;");
        w.newLine();
        w.write("import GeneratedCodeLib.*;");
        w.newLine();
        w.write("public class " + nameFich + " {");
        w.newLine();
        w.write("public static void main(String args[]){");
        w.newLine();
        w.write("BufferedReader r = new BufferedReader();");
        w.newLine();
        w.write("Vector<String> entradas = Entradas.obtener(r);");
        w.newLine();
        w.write("int numEventos = 0;");
        w.newLine();
        w.write("BufferedWriter w = new BufferedWriter();");
        w.newLine();
        w.write("Salida output = new Salida(w);");
        w.newLine();
        w.write("int nEventos = 0;");
        w.newLine();
        
        pr.generateCode(w);

        w.write("for(int i=0; i<nSalidas; i++)");
        w.newLine();
        w.write("{");
        w.newLine();
        w.write("output.insertaResultado(, , nEventos-1)");
        w.newLine();
        w.write("}");
        w.newLine();

        w.write("if (currentState.equals(finalState))");         
        w.newLine();
        w.write("{");
        w.newLine();
        w.write("break;");
        w.newLine();
        w.write("}");
        w.newLine();
        w.write("}"); //for
        w.newLine();
        w.write("output.generarResultado();");
        w.newLine();
        w.write("}"); //public static void main
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
