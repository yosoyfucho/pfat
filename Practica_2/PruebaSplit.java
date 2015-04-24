import java.io.*;

public class PruebaSplit
{
  public static void main (String args [])
  {
    String [] aux = args[0].split("/");
    int auxiliar = aux.length - 1;
    String aux2 = aux[auxiliar];
    String [] aux3 = aux2.split("\\.");
    System.out.println("me quedo con '" +aux3[0]+"'");
  }
}
