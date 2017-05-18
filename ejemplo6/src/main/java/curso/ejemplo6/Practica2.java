package curso.ejemplo6;

import curso.ejemplo5.Disco;
import curso.ejemplo5.Libro;
import curso.ejemplo5.Tarjeta;

public class Practica2 {
    public static void main(String[] args) {
        Coleccionador coleccionador= new Coleccionador();
        boolean flagInsert;
        flagInsert=coleccionador.agregarElemento(new Disco(1, "uno", 10));
        System.out.println(flagInsert);
        flagInsert=coleccionador.agregarElemento(new Disco(2, "dos", 15));
        System.out.println(flagInsert);
        flagInsert=coleccionador.agregarElemento(new Disco(3, "dos", 15));
        System.out.println(flagInsert);
        flagInsert=coleccionador.agregarElemento(new Libro(11, "limitada", "Marquez"));
        System.out.println(flagInsert);
        flagInsert=coleccionador.agregarElemento(new Libro(12, "especial", "Marquez"));
        System.out.println(flagInsert);
        flagInsert=coleccionador.agregarElemento(new Libro(13, "unica", "Marquez"));
        System.out.println(flagInsert);
        flagInsert=coleccionador.agregarElemento(new Tarjeta(23, "nueva", true));
        System.out.println(flagInsert);
        flagInsert=coleccionador.agregarElemento(new Tarjeta(24, "nueva", false));
        System.out.println(flagInsert);
        flagInsert=coleccionador.agregarElemento(new Tarjeta(24, "nueva", true));
        System.out.println(flagInsert);
        System.out.println(coleccionador.generarInventario());
        System.out.println(String.format("Numero de Libros=%d",coleccionador.contarLibros()));
        System.out.println(String.format("Numero de Discos=%d",coleccionador.contarDiscos()));
        System.out.println(String.format("Numero de Tarjetas=%d",coleccionador.contarTarjetas()));
        System.out.println("Buscar Elemento 3");
        if(coleccionador.consultar(3)!=null){
            System.out.println(String.format("Elemento:%s",coleccionador.consultar(3).imprimir()));
        }
        else{
            System.out.println("No se enfcontro el elemento");
        }
    }
}
