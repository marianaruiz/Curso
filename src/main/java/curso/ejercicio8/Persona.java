package curso.ejercicio8;

public class Persona {

    private String nombre;
    private int edad;
    
    
    public Persona() {
        super();
    }
    public Persona(String nombre, int edad) {
        super();
        this.nombre = nombre;
        this.edad = edad;
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
//sobreescribir los metodos equals hasCode
    @Override
    public boolean equals(Object arg0) {
            if(arg0==this){
                return true;
            }
            if(!(arg0 instanceof Persona)){
                return false;
            }
            Persona persona=(Persona)arg0;
            return persona.getNombre()==nombre && persona.getEdad()== edad;
    }
    @Override
    public int hashCode() {
         return nombre.length()*edad;
    }
    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", edad=" + edad + "]";
    }
    
    
    
}
