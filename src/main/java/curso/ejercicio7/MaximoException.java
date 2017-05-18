package curso.ejercicio7;

public class MaximoException extends Exception {
    private int maximo=0;
     public MaximoException(String errortipe, int maximo){
         super(errortipe);
         this.maximo=maximo;
     }
     private static final long serialVersionUID = 1L;
    public int getMaximo() {
        return maximo;
    }
    public void setMaximo(int maximo) {
        this.maximo = maximo;
    }
     
}
