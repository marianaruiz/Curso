package curso.ejemplo4;

import curso.ejemplo.interfases.Operable;

public class ProgramaD2 {
    public static void main(String[] args) {
//        Calculadora calculadora= new Calculadora();
//        System.out.println("Suma: "+calculadora.getsuma());
//        System.out.println("Resta: "+calculadora.getResta());
//        System.out.println("Multiplicación: "+calculadora.getMultiplicacion());
        //se cre una instancia de Sumador que actua como Operable polimorfismo
        Operable suma=new Sumador();
        System.out.println("Suma: "+suma.operar(5, 2));
        Operable resta =new Restador();
        System.out.println("Resta: "+resta.operar(5, 2));
        
    }
}
