package curso.ejercicio8;

import java.util.Comparator;

public class ComparadorEdad implements Comparator<Personita> {

    @Override
    public int compare(Personita o1, Personita o2) {
        // TODO Auto-generated method stub
        return o1.getEdad()-o2.getEdad();
    }

}
