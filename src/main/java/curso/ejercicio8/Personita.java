package curso.ejercicio8;

import java.util.Date;

public class Personita {
    private String nombre;
    private int edad;
    private Date fechaNan;
    
    public Personita() {
        super();
    }
    public Personita(String nombre, int edad, Date fechaNan) {
        super();
        this.nombre = nombre;
        this.edad = edad;
        this.fechaNan = fechaNan;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public Date getFechaNan() {
        return fechaNan;
    }
    public void setFechaNan(Date fechaNan) {
        this.fechaNan = fechaNan;
    }
    @Override
    public String toString() {
        return "Personita [nombre=" + nombre + ", edad=" + edad + ", fechaNan=" + fechaNan + "]";
    }
    
}
