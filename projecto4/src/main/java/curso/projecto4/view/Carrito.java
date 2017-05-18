package curso.projecto4.view;

import java.util.Scanner;

import curso.projecto4.business.Inventario;
import curso.projecto4.business.Pedido;
import curso.projecto4.business.SinStockExeption;
import curso.projecto4.model.Comprable;

public class Carrito {
    private Inventario inventario=new Inventario();
    private Pedido pedido=new Pedido();
    private int banderaComprar=1;
     public Inventario carrito(){
        return inventario;
     }
     
     public void iniciar(){
         int productoseleccionado=-1;
         int cantidad;
         Scanner sc = new Scanner(System.in);
         System.out.println("Bienvenido a la tienda");
         while(banderaComprar!=0){
             System.out.println(inventario.ListarArticulos());
             System.out.println("3.-Terminar Compra");
             System.out.println("Slecciona un Producto");
             productoseleccionado =sc.nextInt();
             if(productoseleccionado!=3){
                 System.out.println("Ingresa la cantidad");
                 cantidad=sc.nextInt();
                 try {
                     Comprable comprable=carrito().Utilizar(productoseleccionado, cantidad);
                    pedido.agregar(comprable,cantidad);
                    System.out.println("Se agrego al carrito");
                } catch (SinStockExeption e) {
                    // TODO Auto-generated catch block
                    System.err.println(e.getMessage());
                }
             }
             else{
                 banderaComprar=0;
             }
         }
         System.out.println(pedido.imprimir());
     }
}
