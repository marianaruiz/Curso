package modelo;

import java.util.Comparator;

import org.apache.commons.lang.builder.CompareToBuilder;

public class ComparadorPorNombre  implements Comparator<Contacto> {

    @Override
    public int compare(Contacto o1, Contacto o2) {
        CompareToBuilder builder =new CompareToBuilder();
      builder.append(o1.getNombre(), o2.getNombre());
      return builder.toComparison();
    }

}
