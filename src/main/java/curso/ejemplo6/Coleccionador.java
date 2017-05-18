package curso.ejemplo6;

import curso.ejemplo5.Coleccionable;
import curso.ejemplo5.Disco;
import curso.ejemplo5.Libro;
import curso.ejemplo5.Tarjeta;

public class Coleccionador {
    private Coleccionable[] coleccionable=new Coleccionable[10];
    private int indice;
    public int contarLibros() {
        int contador = 0;
        for (int i=0;i<indice;i++) {
            contador=coleccionable[i] instanceof Libro?contador+1:contador;
        }
        return contador;
    }

    public int contarDiscos() {
        int contador = 0;
        for (int i=0;i<indice;i++) {
            contador=coleccionable[i] instanceof Disco?contador+1:contador;
        }
        return contador;
    }

    public int contarTarjetas() {
        int contador = 0;
        for (int i=0;i<indice;i++) {
            contador=coleccionable[i] instanceof Tarjeta?contador+1:contador;
        }
        return contador;
    }

    public boolean agregarElemento(Coleccionable nuevoColeccionador) {
        for (int i=0;i<indice;i++) {
            if(coleccionable[i].getIdentificador()==nuevoColeccionador.getIdentificador()){
                return false; 
            }
        }
        coleccionable[indice]=nuevoColeccionador;
        indice+=1;
        return true;
        
    }

    public String generarInventario() {
        String inventario="";
        for (int i=0;i<indice;i++) {
            inventario=inventario+coleccionable[i].imprimir();
        }
        return inventario;
    }
    
    public Coleccionable consultar(int numero){
        int auxliarSearch=-1;
        for (int i=0;i<indice;i++) {
            if(coleccionable[i].getIdentificador()==numero){
                return coleccionable[i];
            }
        }
        return null;
    }
}
