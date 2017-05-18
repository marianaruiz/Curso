package curso.ejercicio8;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import org.junit.Test;

public class GenteTest {
    @Test
    public void crearTreeSet() {
        Set<Gente> personas=new TreeSet<Gente>();
        personas.add(new Gente("Mariana",4));
        personas.add(new Gente("Adrian",13));
        personas.add(new Gente("Luis",23));
        personas.add(new Gente("Mariana",4));
        System.out.println("-----------------------------------------------");
        for (Gente persona : personas) {
            System.out.println(persona.toString());
        }
    }
    @Test
    public void crearHasMap() {
        Map<String,Gente> map= new HashMap<String, Gente>();
        System.out.println("------------------HHH-----------------------------");
        System.out.println(map.put("Mariana",new Gente("Mariana",4)));
        System.out.println(map.put("Adrian",new Gente("Adrian",13)));
        System.out.println(map.put("Luis",new Gente("Luis",23)));
        System.out.println(map.put("Mariana",new Gente("Mariana",24)));
        System.out.println("--------------------ENTRY---------------------------");
        for (Entry<String, Gente> entry: map.entrySet()) {
            System.out.println(String.format("Key: %s",entry.getKey()));
            System.out.println(String.format("Valor: %s",entry.getValue()));
        }
    }
    @Test
    public void crearHashTree() throws ParseException {
        NavigableMap<Date,Gente> map= new TreeMap<Date, Gente>();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        System.out.println("----------------------TREE------------------------");
        System.out.println(map.put(dateFormat.parse("1993/07/12"),new Gente("Mariana",4)));
        System.out.println(map.put(dateFormat.parse("1994/07/12"),new Gente("Adrian",13)));
        System.out.println(map.put(dateFormat.parse("1990/07/12"),new Gente("Luis",23)));
        System.out.println(map.put(dateFormat.parse("2000/07/12"),new Gente("Mariana",24)));
        System.out.println("-----------------------------------------------");
        for (Entry<Date, Gente> entry: map.entrySet()) {
            System.out.println(String.format("Key: %s",dateFormat.format(entry.getKey())));
            System.out.println(String.format("Valor: %s",entry.getValue()));
        }
       System.out.println(String.format("Menor: %s",map.firstEntry()));
       System.out.println(String.format("Mayor: %s",map.lastEntry()));
    }
    
}
