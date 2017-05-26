package modelo;

import java.util.Date;

public class Contacto {
    private int id;
    private String nombre;
    private Date fechaNan;
    private String telefonoCasa;
    private String telefonoTrabajo;
    private String celular;
    private String email;
    
    public Contacto() {
        super();
    }
    public Contacto(int id, String nombre, Date fechaNan, String telefonoCasa, String telefonoTrabajo, String celular,
            String email) {
        super();
        this.id = id;
        this.nombre = nombre;
        this.fechaNan = fechaNan;
        this.telefonoCasa = telefonoCasa;
        this.telefonoTrabajo = telefonoTrabajo;
        this.celular = celular;
        this.email = email;
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
    public Date getFechaNan() {
        return fechaNan;
    }
    public void setFechaNan(Date fechaNan) {
        this.fechaNan = fechaNan;
    }
    public String getTelefonoCasa() {
        return telefonoCasa;
    }
    public void setTelefonoCasa(String telefonoCasa) {
        this.telefonoCasa = telefonoCasa;
    }
    public String getTelefonoTrabajo() {
        return telefonoTrabajo;
    }
    public void setTelefonoTrabajo(String telefonoTrabajo) {
        this.telefonoTrabajo = telefonoTrabajo;
    }
    public String getCelular() {
        return celular;
    }
    public void setCelular(String celular) {
        this.celular = celular;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    
}
