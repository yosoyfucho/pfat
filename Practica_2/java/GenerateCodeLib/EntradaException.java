package GeneratedCodeLib;

public class EntradaException extends Exception {
     
  private String msg;

  public EntradaException(int s) { 
    msg="Error en fichero de entrada en l�nea: " + s; 
  }

  public String toString() {
     return msg;
       }
}
