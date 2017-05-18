package curso.ejercicio7;

import java.util.Arrays;

public class Contenedor implements Cloneable{
    private int[] elementos= new int[4];
    int MAXIMO=4;
    int indice=0;
    public void agregar(int i) throws MaximoException{
        if(indice<MAXIMO){
            elementos[indice]=i;
            indice+=1;
        }
        else{
            throw new MaximoException("Llego a su maximo",MAXIMO);
        }
    }
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    @Override
    public String toString() {
        return "Contenedor [elementos=" + Arrays.toString(elementos) + ", MAXIMO=" + MAXIMO + ", indice=" + indice
                + "]";
    }

}
