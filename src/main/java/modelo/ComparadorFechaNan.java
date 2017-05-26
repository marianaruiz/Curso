package modelo;

import java.util.Comparator;

import org.apache.commons.lang.builder.CompareToBuilder;

public class ComparadorFechaNan implements Comparator<Contacto> {

    @Override
    public int compare(Contacto o1, Contacto o2) {
        CompareToBuilder builder =new CompareToBuilder();
      builder.append(o1.getFechaNan(),o2.getFechaNan());
      return builder.toComparison();
    }

}
