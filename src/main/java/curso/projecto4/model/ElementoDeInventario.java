package curso.projecto4.model;

import java.math.BigDecimal;

public class ElementoDeInventario {
    private Integer existencias;
    private Comprable comprable;
    
    
    public ElementoDeInventario(Integer existencias,TipoArticulo tipo,BigDecimal precio) {
        super();
        this.existencias = existencias;
        this.comprable = new ComprableImp(precio,tipo);
    }
    
    public Integer getExistencias() {
        return existencias;
    }
    public void setExistencias(Integer existencias) {
        this.existencias = existencias;
    }
    public Comprable getComprable() {
        return comprable;
    }
    public void setComprable(Comprable comprable) {
        this.comprable = comprable;
    }

    @Override
    public String toString() {
        return String.format("%s .......%2f",comprable.getTipo(),comprable.getPrecio());
//        return "\nProducto:"+comprable.getTipo()
//                +"\nPrecio:"+comprable.getPrecio()
//                +"\nExistencia:" + existencias;
    }
    
}
