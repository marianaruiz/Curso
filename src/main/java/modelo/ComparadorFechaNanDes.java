package modelo;

import java.util.Comparator;

import org.apache.commons.lang.builder.CompareToBuilder;

public class ComparadorFechaNanDes implements Comparator<Contacto> {

    @Override
    public int compare(Contacto o1, Contacto o2) {
        CompareToBuilder builder =new CompareToBuilder();
      builder.append(o2.getFechaNan(),o1.getFechaNan());
      return builder.toComparison();
    }
}
