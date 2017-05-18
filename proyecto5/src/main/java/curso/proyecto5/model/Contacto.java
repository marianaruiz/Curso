package curso.proyecto5.model;

import java.util.Date;
import java.util.Set;
import java.util.TreeSet;

import curso.proyecto5.utils.FormateadorUtil;

public class Contacto {
    private String nombre;
    private Date fechaNacimiento;
    private Set<MedioComunicacion> medios= new TreeSet<MedioComunicacion>();
    public Contacto() {
        super();
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }
    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    public Set<MedioComunicacion> getMedios() {
        return medios;
    }
    public void setMedios(Set<MedioComunicacion> medios) {
        this.medios = medios;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj==this){
            return true;
        }
        if(!(obj instanceof Contacto)){
            return false;
        }
        Contacto contacto=(Contacto)obj;
        return contacto.getNombre()==nombre && contacto.getFechaNacimiento()== fechaNacimiento;
    }
    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return nombre.length()*fechaNacimiento.hashCode();
    }
    @Override
    public String toString() {
        return "\nContacto [nombre=" + nombre + ", fechaNacimiento=" + FormateadorUtil.format(fechaNacimiento) + ", medios=" + medios + "]";
    }
    
    
    
}
