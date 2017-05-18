package curso.ejercicio8;

import java.util.Comparator;

public class ComparadorFechaNan implements Comparator<Personita> {

    @Override
    public int compare(Personita o1, Personita o2) {
        // TODO Auto-generated method stub
        return o1.getFechaNan().compareTo(o2.getFechaNan());
    }

}
