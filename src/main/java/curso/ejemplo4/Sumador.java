package curso.ejemplo4;

import curso.ejemplo.interfases.Operable;

public class Sumador implements Operable {

    public int operar(int numeroUno, int numeroDos) {
       return numeroUno+numeroDos;
    }

}