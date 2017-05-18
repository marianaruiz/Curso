package curso.projecto4.business;

import java.math.BigDecimal;
import java.security.SignatureException;
import java.util.Random;

import curso.projecto4.model.Comprable;
import curso.projecto4.model.ElementoDeInventario;
import curso.projecto4.model.TipoArticulo;

public class Inventario {
 private ElementoDeInventario[] elementos= new ElementoDeInventario[3];
 
 public Inventario(){
     Random ra = new Random();
     int indice=0;
     elementos[0]=new ElementoDeInventario(ra.nextInt(10), TipoArticulo.CELULAR, new BigDecimal(1000.50));
     elementos[1]=new ElementoDeInventario(ra.nextInt(10), TipoArticulo.TABLET, new BigDecimal(2500.50));
     elementos[2]=new ElementoDeInventario(ra.nextInt(10), TipoArticulo.LAPTOP, new BigDecimal(57000.50));
 }
 public String ListarArticulos(){
     StringBuilder aux = new StringBuilder();
     for(int i=0; i< elementos.length;i++){
         aux.append(String.format("\n %d.-%s", i,elementos[i].toString()));
     }
     return aux.toString();
 }
 public Comprable Utilizar(int indice, int cantidad) throws SinStockExeption{
     int total=elementos[indice].getExistencias();
     if(total<cantidad){
         throw new SinStockExeption(elementos[indice].getComprable().getTipo(),elementos[indice].getExistencias());
     }
     else{
         total-=cantidad;
         elementos[indice].setExistencias(total);
         return elementos[indice].getComprable();
     }
     
 } 
}
