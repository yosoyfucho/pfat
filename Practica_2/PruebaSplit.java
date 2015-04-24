import java.io.*;

public class PruebaSplit
{
  public static void main (String args [])
  {
    System.out.println("He leido :"+args[0]+"\n");

    if (args[0].contains("/"))
    {
      String [] aux = args[0].split("/");
      int auxiliar = aux.length - 1;
      String aux2 = aux[auxiliar];
      String [] aux3 = aux2.split("\\.");
      System.out.println("me quedo con ->'" +aux3[0]+"'");
    }
    else
    {
      String [] aux4 = args[0].split("\\.");
      System.out.println("me quedo con ->'"+aux4[0]+"'");
    }

  }
}
