package curso.proyecto.business;

import java.util.Comparator;

import curso.proyecto5.model.Contacto;

public class ComparadorFecha implements Comparator<Contacto> {

    public int compare(Contacto o1, Contacto o2) {
        // TODO Auto-generated method stub
        return o1.getFechaNacimiento().compareTo(o2.getFechaNacimiento());
    }

   
}
