package curso.ejemplo4;

public class Calculadora {
    private int operandoUno;
    private int operandoDos;
    
    public Calculadora() {
        this(5,10);
    }

    public Calculadora(int operandoUno, int operandoDos) {
        this.operandoUno = operandoUno;
        this.operandoDos = operandoDos;
    }
    
    public int getsuma(){
        return this.operandoUno + this.operandoDos;
    }

    public int getResta(){
        return this.operandoUno - this.operandoDos;
    }
    
    public int getMultiplicacion(){
        return this.operandoUno * this.operandoDos;
    }
}
