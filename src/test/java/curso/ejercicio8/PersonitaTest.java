package curso.ejercicio8;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Set;
import java.util.TreeSet;

import org.junit.Test;

public class PersonitaTest {
    //implementar Comparator
    @Test
    public void crearTreeSetComparadorNombre() throws ParseException {
        Set<Personita> personas=new TreeSet<Personita>(new ComparadorNombre());
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        personas.add(new Personita("Mariana",4,dateFormat.parse("1990/07/12")));
        personas.add(new Personita("Adrian",13,dateFormat.parse("1990/06/12")));
        personas.add(new Personita("Luis",23,dateFormat.parse("1999/07/12")));
        personas.add(new Personita("Mariana",4,dateFormat.parse("1991/07/12")));
        System.out.println("------------------------Comparador Nombre -----------------------");
        for (Personita persona : personas) {
            System.out.println(persona.toString());
        }
    }
    @Test
    public void crearTreeSetComparadorEdad() throws ParseException {
        Set<Personita> personas=new TreeSet<Personita>(new ComparadorEdad());
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        personas.add(new Personita("Mariana",4,dateFormat.parse("1990/07/12")));
        personas.add(new Personita("Adrian",13,dateFormat.parse("1990/06/12")));
        personas.add(new Personita("Luis",23,dateFormat.parse("1999/07/12")));
        personas.add(new Personita("Mariana",6,dateFormat.parse("1991/07/12")));
        System.out.println("------------------------Comparador Edad -----------------------");
        for (Personita persona : personas) {
            System.out.println(persona.toString());
        }
    }
    @Test
    public void crearTreeSetComparadorFechaNan() throws ParseException {
        Set<Personita> personas=new TreeSet<Personita>(new ComparadorFechaNan());
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        personas.add(new Personita("Mariana",4,dateFormat.parse("1990/07/12")));
        personas.add(new Personita("Adrian",13,dateFormat.parse("1990/06/12")));
        personas.add(new Personita("Luis",23,dateFormat.parse("1999/07/12")));
        personas.add(new Personita("Mariana",7,dateFormat.parse("1991/07/12")));
        System.out.println("------------------------Comparador Fecha Nacimiento -----------------------");
        for (Personita persona : personas) {
            System.out.println(persona.toString());
        }
    }
}
