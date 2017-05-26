package modelo;

import java.math.BigDecimal;
import java.util.Comparator;
import java.util.Map;

import org.apache.commons.lang.builder.CompareToBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

public class Automovil {
//implements Comparator<Automovil>{
    private int id;
    private String nombre;
    private BigDecimal precio;
    private String imagen;
    private Map<Integer, BigDecimal> intereses;
    
    public Automovil() {
        super();
    }

    public Automovil(int id, String nombre, BigDecimal precio, String imagen, Map<Integer, BigDecimal> intereses) {
        super();
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.imagen = imagen;
        this.intereses = intereses;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public Map<Integer, BigDecimal> getIntereses() {
        return intereses;
    }

    public void setIntereses(Map<Integer, BigDecimal> intereses) {
        this.intereses = intereses;
    }

//    @Override
//    public String toString() {
//        return ToStringBuilder.reflectionToString(this,ToStringStyle.MULTI_LINE_STYLE);//format el to string 
//    }

    
//    @Override
//    public int compare(Automovil o1, Automovil o2) {
//        // TODO Auto-generated method stub
//        CompareToBuilder builder =new CompareToBuilder();
//        builder.append(o1.nombre, o2.nombre);
//        return builder.toComparison();
//    }
    
}
