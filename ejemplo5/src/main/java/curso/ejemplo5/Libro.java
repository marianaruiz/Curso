package curso.ejemplo5;

public class Libro extends Coleccionable {
    private String autor;
    
    public Libro(int identificador, String edicion,String autor) {
        super(identificador, edicion);
        this.autor=autor;
    }
    
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    public String imprimir() {
        return "\nidentificador=" + getIdentificador() + "\nedicion=" + getEdicion()+"\nautor="+autor;
    }
}
