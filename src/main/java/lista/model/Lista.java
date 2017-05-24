package lista.model;

import java.util.Date;

public class Lista {
    private Date fecha;
    private String nombre;
    private boolean estado;
    
    public Lista() {
        super();
    }

    public Lista(Date fecha, String nombre, boolean estado) {
        super();
        this.fecha = fecha;
        this.nombre = nombre;
        this.estado = estado;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return fecha  + "  " + nombre + " " + estado + "]";
    }
    
}
