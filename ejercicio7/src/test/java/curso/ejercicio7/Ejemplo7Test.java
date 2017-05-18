package curso.ejercicio7;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

import org.junit.Test;

public class Ejemplo7Test {
    // Object
    @Test
    public void probarObjeto() throws Exception {
        Contenedor obj = new Contenedor();
        obj.agregar(3);
        System.out.println("---------------------Object----------------");
        Contenedor obj2= (Contenedor)obj.clone();
        System.out.println(obj2.getClass());
        System.out.println(obj2.toString());
        System.out.println(obj2.equals(obj));
        System.out.println(obj.getClass());
        System.out.println(obj.hashCode());
        System.out.println(obj.toString());
    }

    // String
    @Test
    public void probarString() {
        String cadena = "HOLA MuNdO";
        System.out.println("---------------------String----------------");
        System.out.println(cadena.contains("hola"));
        System.out.println(cadena.endsWith("dO"));
        System.out.println(String.format("Ejemplo de cadena %s", cadena));
        System.out.println(cadena.getBytes());
        System.out.println(cadena.isEmpty());
        System.out.println(cadena.length());
        System.out.println(cadena.replaceAll("A", "u"));
        System.out.println(cadena.split(" "));
        System.out.println(cadena.startsWith("H"));
        System.out.println(cadena.substring(2, 5));
        System.out.println(cadena.toLowerCase());
        System.out.println(cadena.toUpperCase());

    }

    // Long
    @Test
    public void probarLong(){
        Long i=(long) 1;
        Long i2=(long) 2;
        System.out.println("---------------------LOnG----------------");
        System.out.println(i.compareTo(i2));
        System.out.println(i2.compareTo(i));
        System.out.println(i.compareTo(i));
        System.out.println(i.intValue());
        System.out.println(Long.parseLong("123"));
        System.out.println(Long.valueOf("123"));
    }

 // Math
    @Test
    public void provarMath() {
        System.out.println("---------------------Math----------------");
        Long i=(long) 1;
        Long i2=(long) 2;
        System.out.println(Math.max(1, i2));
        System.out.println(Math.min(1, i2));
        System.out.println(Math.pow(2, 4));
        System.out.println(Math.random());
        System.out.println(Math.round(1.23444));
    }
 // System
    @Test
    public void probarsystem() {
        System.out.println("---------------------System----------------");
        System.out.println(System.currentTimeMillis());
        System.out.println(System.getenv("JAVA_HOME"));
        System.err.println("ERROR");
    }
 // StringBuilder
    @Test
    public void probarStringBuilder() {
        System.out.println("---------------------StringBuilder----------------");
        StringBuilder aux = new StringBuilder("Hola Mundo");
        System.out.println(aux.append(" java"));
        System.out.println(aux.charAt(3));
        System.out.println(aux.deleteCharAt(0));
        System.out.println(aux.indexOf("hola"));
        System.out.println(aux.length());
        String axu2=aux.toString();
        System.out.println(aux);
    }
    // CompareTO
    @Test
    public void compareTo() {
        System.out.println("---------------------CompareTo----------------");
        Integer i = 1;
        Integer i2 = 2;
        System.out.println(i.compareTo(i2));
        System.out.println(i2.compareTo(i));
        System.out.println(i.compareTo(i));
    }

    //Date
    @Test
    public void probarDate() {
        System.out.println("---------------------Date----------------");
        Date date= new Date();
        Date date2=new Date(93, 06, 11);
        System.out.println(date.getTime());
        System.out.println(date);
        System.out.println(date2);        
        System.out.println(date.after(date2));
        System.out.println(date2.before(date));
    }
  //calendar
    @Test
    public void probarCalendar() {
        System.out.println("---------------------Calendar----------------");
        Calendar c= GregorianCalendar.getInstance();
        System.out.println(c.getTime());
        System.out.println(c.DAY_OF_WEEK_IN_MONTH);
        c.add(c.MONTH, 2);
        System.out.println(c.getTime());
        System.out.println(c.YEAR);
        System.out.println(c.HOUR);
        System.out.println(c.MINUTE);
        System.out.println(c.MONDAY);
        System.out.println(c.getActualMaximum(c.DAY_OF_MONTH));
        Calendar c2= GregorianCalendar.getInstance();
        System.out.println(c.compareTo(c2));

    }
    //locate
    @Test
    public void probarLocate() {
        System.out.println("---------------------Locate----------------");
        Locale.setDefault(Locale.CANADA);
        System.out.println(Locale.getDefault());
    }
  //Random
    @Test
    public void probarRandom() {
        System.out.println("---------------------Random----------------");
        Random ra= new Random();
        System.out.println(ra.nextBoolean());
        System.out.println(ra.nextInt(10));
    }
    
  //Scanner
    @Test
    public void probarScaner() {
        System.out.println("---------------------Scanner----------------");
        System.out.println("ingresa un nombre");
        Scanner sc = new Scanner(System.in);
        String nombre = sc.nextLine();
        System.out.println("ingresa un numero");
        int i =sc.nextInt();
        System.out.println(nombre);
        System.out.println(i);
    }
    //Simple date Format
    @Test
    public void SimpleFormar() throws ParseException{
        System.out.println("---------------------SimpleFormat----------------");
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        Date date = new Date();
        System.out.println(dateFormat.format(date)); //2013/10/15
        String fecha="2013/10/15";
        System.out.println(dateFormat.parse(fecha));
    }
}
