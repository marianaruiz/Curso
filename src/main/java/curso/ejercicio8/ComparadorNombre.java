package curso.ejercicio8;

import java.util.Comparator;

public class ComparadorNombre implements Comparator<Personita> {

    @Override
    public int compare(Personita o1, Personita o2) {
        // TODO Auto-generated method stub
        return o1.getNombre().compareTo(o2.getNombre());
    }

   

}
