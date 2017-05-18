package curso.ejemplo5;

public class Disco extends Coleccionable{
    private int pistas;
    
    public Disco(int identificador, String edicion,int pistas) {
        super(identificador, edicion);
        this.pistas=pistas;
    }
    public int getPistas() {
        return pistas;
    }

    public void setPistas(int pistas) {
        this.pistas = pistas;
    }
    public String imprimir() {
        return "\nidentificador=" + getIdentificador() + "\nedicion=" + getEdicion()+"\npistas="+pistas;
    }
    
}
