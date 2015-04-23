package GeneratedCodeLib;

public class EntradaException extends Exception {
     
  private String msg;

  public EntradaException(int s) { 
    msg="Error en fichero de entrada en línea: " + s; 
  }

  public String toString() {
     return msg;
       }
}
