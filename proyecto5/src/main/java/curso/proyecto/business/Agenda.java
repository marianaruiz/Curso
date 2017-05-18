package curso.proyecto.business;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;

import javax.sql.rowset.spi.TransactionalWriter;

import curso.proyecto5.model.Contacto;

public class Agenda {
    private  Map<String,Contacto> contactos= new HashMap<String, Contacto>();
    public Agenda() {
        super();
    }
    public void agregarContacto(Contacto contacto) throws ContactoExistenteExeption{
     if(contactos.put(contacto.getNombre(),contacto )!=null){
         throw new ContactoExistenteExeption();
         }
    }
    
    public void listar(Comparator<Contacto> comparador){
        List<Contacto> lista=new ArrayList<Contacto>(contactos.values());
       Collections.sort(lista,comparador);
       for (Contacto contacto:lista) {
           System.out.println(String.format("-------------------\n %s",contacto.toString()));
       }
    }
     public Contacto buscarPorNombre(String nombre) throws ContactoNoEncontrado{
         if(contactos.containsKey(nombre)==true){
             return contactos.get(nombre);
         }
         else{
            throw new ContactoNoEncontrado();
         }
     }
}
