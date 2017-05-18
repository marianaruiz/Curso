package curso.ejemplo5;

import curso.interfases.Imprimible;

public abstract class Coleccionable implements Imprimible{
    private int identificador;
    private String edicion;
    
    
    public Coleccionable(int identificador, String edicion) {
        super();
        this.identificador = identificador;
        this.edicion = edicion;
    }
    public int getIdentificador() {
        return identificador;
    }
    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }
    public String getEdicion() {
        return edicion;
    }
    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }
     
}
