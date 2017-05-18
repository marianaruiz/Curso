package curso.ejemplo5;

public class Tarjeta extends Coleccionable {
    private boolean especial;

    public Tarjeta(int identificador, String edicion,boolean especial) {
        super(identificador, edicion);
        this.especial=especial;
    }
     
    public boolean isEspecial() {
        return especial;
    }

    public void setEspecial(boolean especial) {
        this.especial = especial;
    }
    public String imprimir() {
        return "\nidentificador=" + getIdentificador() + "\nedicion=" + getEdicion()+"\nespecial="+especial;
    }
}
