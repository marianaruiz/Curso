package modelo;

import java.util.Comparator;

import org.apache.commons.lang.builder.CompareToBuilder;

public class ComparadorPorNombreDes implements Comparator<Contacto> {

    @Override
    public int compare(Contacto o1, Contacto o2) {
        CompareToBuilder builder =new CompareToBuilder();
      builder.append(o2.getNombre(),o1.getNombre());
      return builder.toComparison();
    }
}
