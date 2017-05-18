package curso.projecto4.model;

import java.math.BigDecimal;

public class ComprableImp implements Comprable {
    private BigDecimal precio;
    private TipoArticulo tipo;
    
    
    public ComprableImp(BigDecimal precio, TipoArticulo tipo) {
        super();
        this.precio = precio;
        this.tipo = tipo;
    }

   public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    public TipoArticulo getTipo() {
        return tipo;
    }

    public void setTipo(TipoArticulo tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Producto"+tipo
                +"\nprecio=" + precio;
    }

    
}
