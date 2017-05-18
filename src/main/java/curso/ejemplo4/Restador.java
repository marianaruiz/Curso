package curso.ejemplo4;

import curso.ejemplo.interfases.Operable;

public class Restador implements Operable {

    public int operar(int numeroUno, int numeroDos) {
        return numeroUno-numeroDos;
    }
    
}
