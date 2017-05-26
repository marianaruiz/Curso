package modelo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.ListUtils;
import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.lang.StringUtils;

public class ContactoDAO {
    private static List<Contacto> contactos= new ArrayList<Contacto>();
    static{
        contactos.add(new Contacto(1,"mariana",new Date(),"55","55","33","mariana@hotmail.com"));
    }
    public List<Contacto>getAll(){
        return contactos;
    }
    public List<Contacto>getAllCom(Comparator c){
        Collections.sort(contactos,c);
        return contactos;
    }

    public void save(Contacto c){
        contactos.add(c);
    }
    public Contacto getByid(int id){
        return contactos.get(id-1);
    }
    public Contacto getByName(String name){
        for (Contacto contacto : contactos) {
            if(StringUtils.containsIgnoreCase(contacto.getNombre(),name)){
                return contacto;
            }
        }
        return null;
    }
}
