import Parser.*;
import Lexer.*;
import java.io.*;
import AST.*;
import Errors.*;
import Compiler.*;

public class Main
{
  public static void main(String args[]) throws Exception{
    java.io.BufferedReader in;
    Yylex sc;
    parser p;

    S pr = null;

    java_cup.runtime.Symbol sroot;
    boolean error=false;

    //El primer parametro es el nombre del fichero con el programa
    if (args.length < 1) {
      System.out.println(
      "Uso: java Main <nombre_fichero>");
      error=true;
    }

    //Analisis lexico y sintactico

    if (!error)
    {
      try {
        in = new java.io.BufferedReader(new java.io.FileReader(args[0]));
        sc = new Yylex(in);
        p = new parser(sc);
        sroot = p.parse();
        pr =  (S)sroot.value;
        System.out.println("Analisis lexico y sintactico correctos");
      }
      catch(IOException e) {
        System.out.println("Error abriendo fichero: " + args[0]);
        error= true;
      }
    }

    //Analisis Semantico
    if (!error)
    {

        pr.computeType();
        error = true;
        System.out.println("Analisis semantico correcto");
    }

    // Generacion de Codigo
    if (!error)
    {
      String nameFich = (String)pr.obtenerNomb();
      String ficheroJava = nameFich + ".java";
      BufferedWriter w = new BufferedWriter(new FileWriter(ficheroJava));
      try{
        w.write("import java.util.*;");
        w.newLine();
        w.write("import java.io.*;");
        w.newLine();
        w.newLine();
        w.write("public class " + nameFich + " {");
        w.newLine();
        w.write("public static void main(String args[]){");
        w.newLine();
        w.write("String salida = '0';");
        w.write("int estad = 0;");
        w.write("for (String s : args ) ");
        w.write("{");
        w.write("  System.out.println(\"Voy a hacer la transicion por evento \"+s+\". Estoy en \"+estado);");
        w.write("  Transison.hazTrans(estado,s,salida);");
        w.write("}");
        w.newLine();
        pr.generateCode(w);
        w.newLine();
        w.write("}");
        w.newLine();
        w.write("}");
        w.newLine();
        w.close();
        System.out.println("Fichero " + ficheroJava + " con codigo generado");
      }catch (IOException e){
        System.out.println("Error abriendo fichero: " + ficheroJava);
        error = true;
      }
    }


  }
}
