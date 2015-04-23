package GeneratedCodeLib;

public class ResultNotFoundException extends Exception {
     
  private String msg;

  public ResultNotFoundException(String var, int t) { 
    msg="No se ha producido un resultado para la variable de salida " + 
         var + " para tiempo= " + t; 
  }

  public String toString() {
     return msg;
       }
}
