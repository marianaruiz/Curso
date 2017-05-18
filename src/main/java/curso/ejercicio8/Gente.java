package curso.ejercicio8;

public class Gente implements Comparable<Gente>{
    private String nombre;
    private int edad;
    
    public Gente() {
        super();
    }

    public Gente(String nombre, int edad) {
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

    @Override
    public int compareTo(Gente o) {
        // TODO Auto-generated method stub
        //por nombre
//        return this.nombre.compareTo(o.nombre);
        //por edad
        return this.edad-o.edad;
//        if(this.edad==o.edad){
//            return 0;
//        }
//        if(this.edad<o.edad){
//            return -1;
//        }
//        else{
//            return 1;
//        }
    }

    @Override
    public String toString() {
        return "Gente [nombre=" + nombre + ", edad=" + edad + "]";
    }
    
    
}
