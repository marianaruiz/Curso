package curso.ejercicio8;

import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

import org.junit.Test;

public class PersonaTest {
    @Test
    public void sobreercribirEqualsAndHasCode() {
        Persona personaUno = new Persona("Mariana",24);
        Persona personaDos = new Persona("Mariana",24);
        Persona personaTres = new Persona("Adrian",23);
        //mismo objeto
        System.out.println(personaDos.equals(personaUno));
        System.out.println(personaDos.hashCode()==personaUno.hashCode());
        //diferente objeto
        System.out.println(personaDos.equals(personaTres));
        //
        Persona personaCuatro = new Persona("Mariana",25);
        System.out.println(personaCuatro.equals(personaUno));
        System.out.println(personaCuatro.hashCode()==personaUno.hashCode());
        System.out.println(personaCuatro.equals(null));
    }
    @Test
    public void crearLista() {
        List<Persona> personas= new ArrayList<Persona>();
        personas.add(new Persona("Mariana",4));
        personas.add(new Persona("Adrian",23));
        personas.add(new Persona("Luis",23));
        Random ra =new Random();
        for(int i=0; i<15;i++){
            personas.add(new Persona("nomre"+i,ra.nextInt(30)));
        }
        for (Persona persona : personas) {
            System.out.println(persona.toString());
        }
        
        //eliminar personas menores a 18 años
        Iterator<Persona> iterator=personas.iterator();
        while(iterator.hasNext()){
            Persona persona=iterator.next();
            if(persona.getEdad()<18){
                iterator.remove();
            }
        }
        System.out.println("Personas Mayores de Edad");
        for (Persona persona : personas) {
            System.out.println(persona.toString());
        }
          
    }
    @Test
    public void crearSet() {
        Set<Persona> personas=new HashSet<Persona>();
        personas.add(new Persona("Mariana",4));
        personas.add(new Persona("Adrian",23));
        personas.add(new Persona("Luis",23));
        personas.add(new Persona("Mariana",4));
        System.out.println("-----------------------------------------------");
        for (Persona persona : personas) {
            System.out.println(persona.toString());
        }
        System.out.println("-----------------------------------------------");
        Set<Persona> personas1=new LinkedHashSet<Persona>();
        Persona p=new Persona("Mariana",4);
        System.out.println(personas1.add(p));
        System.out.println( personas1.add(new Persona("Adrian",23)));
        System.out.println( personas1.add(new Persona("Luis",23)));
        System.out.println( personas1.add(p));
        System.out.println("-----------------------------------------------");
        for (Persona persona : personas1) {
            System.out.println(persona.toString());
        }
    }
}
