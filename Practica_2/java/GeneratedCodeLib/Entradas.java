package GeneratedCodeLib;
import java.io.*;
import java.util.*;

public class Entradas {

  public static Vector obtener(BufferedReader br) throws Exception {
    Vector res=new Vector();
    Yylex lexer=new Yylex(br);
    java_cup.runtime.Symbol s;
   
    s=lexer.next_token();
    if (s.sym==2) {
      res.add(s.value);
    } else {
      throw new EntradaException(s.left);
    }
    s=lexer.next_token();

    while(s.sym!=0) {
      if (s.sym!=1) {
        throw new EntradaException(s.left);
      }
      s=lexer.next_token();
      if (s.sym==2) {
        res.add(s.value);
      } else {
        throw new EntradaException(s.left);
      }
      s=lexer.next_token();
    }
    br.close();
    return res;
  }
}

    
