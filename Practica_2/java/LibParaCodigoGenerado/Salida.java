package LibParaCodigoGenerado;

import java.io.*;
import java.util.*;

public class Salida {

  private BufferedWriter bw;
  private int maxt;
  private Vector resultados;
  private Vector vars;

  public Salida(BufferedWriter w) {
    bw=w;
    maxt=0;
    resultados=new Vector();
    vars=new Vector();
  }

  public void insertaResultado(String var, boolean valor, int tiempo) {
    if (tiempo>maxt) maxt=tiempo;
    resultados.add(new Resultado(var,valor,tiempo));
    if (!vars.contains(var)) insertaVar(var);
  }

  private void insertaVar(String var) {
    int i, max, min;
    int sign;
    boolean cond;
   
    if (vars.size()==0) {
      vars.add(var);
      return;
    }

    if (vars.size()==1) {
      if (var.compareTo((String) vars.get(0))<0) {
        vars.insertElementAt(var,0);
        return; 
      } else {
        vars.add(var);
        return;
      }
    }

    max=vars.size();
    min=0;
    while (true) {
      i=(max+min)/2;
      sign=var.compareTo((String) vars.get(i));
      if ((i==0) && (sign<0)) {
        vars.insertElementAt(var,0);
        return;
      }
      if ((i==vars.size()-1) && (sign>0)) {
        vars.add(var);
        return;
      } 
      if (sign<0) {
        if (var.compareTo((String) vars.get(i-1))>0) {
           vars.insertElementAt(var,i);
           return;
        } else {
          max=i;
        }
      } else {
        min=i;
      }
    }  
  }
              
  public void generarResultado() throws Exception {
    int i,j,k;
    String var;
    boolean value;
    Resultado res;

    bw.write("Resultados");
    bw.newLine();
    bw.write("----------");
    bw.newLine();
    bw.newLine();

    for(i=0; i<vars.size(); i++) {
      var=(String) vars.get(i);
      bw.write(var + "= ");
      for (j=0; j<=maxt; j++) {
        for (k=0; k<resultados.size(); k++) {
          res=(Resultado) resultados.get(k);
          if ((var.equals(res.var)) && (j==res.tiempo)) {
            if (res.valor) {
              bw.write("1");
            } else {
              bw.write("0");
            } 
            break;
          }
        }
        if (k==resultados.size()) {
          throw new ResultNotFoundException(var,j);
        }
        if (j<maxt) {
          bw.write(", ");
        } 
      }
      bw.newLine();
    }
    bw.close();
  }
}
    
    