package curso.proyecto5.view;

import java.text.ParseException;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import curso.proyecto.business.Agenda;
import curso.proyecto.business.ComparadorFecha;
import curso.proyecto.business.ComparadorNombre;
import curso.proyecto.business.ContactoExistenteExeption;
import curso.proyecto.business.ContactoNoEncontrado;
import curso.proyecto5.model.Contacto;
import curso.proyecto5.model.MedioComunicacion;
import curso.proyecto5.model.TipoMedio;
import curso.proyecto5.utils.FormateadorUtil;

public class TerminalManager {
    private Agenda agenda;
    private Scanner scanner= new Scanner(System.in);;
    private boolean banderacontinunar=true;
    
    public void iniciar(){
        while(banderacontinunar){
            int opc=solicitarOpcion();
            switch (opc) {
           case 1:
                try {
                   agenda.agregarContacto(computarContacto());
               } catch (ContactoExistenteExeption e) {
                   // TODO Auto-generated catch block
                   System.err.println(e.getMessage());
               }
               break;
           case 2:
                try {
                    Contacto contacto=agenda.buscarPorNombre(solicitarNombre());
                    System.out.println(contacto.toString());
               } catch (ContactoNoEncontrado e) {
                   // TODO Auto-generated catch block
                   System.err.println(e.getMessage());
               }
               break;
           case 3:
               agenda.listar(new ComparadorNombre());
               break;
           case 4:
               agenda.listar(new ComparadorFecha());
               break;
           default:
               System.exit(0);
               break;
           }
        }
    }
    
    public TerminalManager(Agenda agenda){
        this.agenda=agenda;
         
    }
    private int solicitarOpcion(){
        boolean banderaOpocionCorrecta=false;
        while(banderaOpocionCorrecta==false){
            String selccion;
            System.out.println("-----------Bienvenido a tu Agenda----------");
            System.out.println("Selecciona una Opción");
            System.out.println("1.-Ingresar Contacto");
            System.out.println("2.-Buscar Contacto");
            System.out.println("3.-Ver contactos por Nombre");
            System.out.println("4.-Ver contactos por Fecha Nacimimento");
            System.out.println("5.-Salir");
            selccion=scanner.nextLine();
            try{
                int selecciono=Integer.parseInt(selccion);
                if(selecciono==1||selecciono==2||selecciono==3||selecciono==4||selecciono==5){
                    banderaOpocionCorrecta=true;
                    return selecciono;
                }
            }catch (Exception e) {
               banderaOpocionCorrecta=false;
            }
        }
        return 0;
   }
    
    private Contacto computarContacto(){
        Contacto contacto=new Contacto();
        System.out.println("-----------------------------------------------");
        System.out.println("Ingresa nombre");
        contacto.setNombre(scanner.nextLine());
        System.out.println("Ingresa Fecha de nacimiento dd/MM/yyyy ");
        try {
            String fecha=scanner.nextLine();
            contacto.setFechaNacimiento(FormateadorUtil.parse(fecha));
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        contacto.setMedios(pedirMedios());
        return contacto;
        
    }
    private String solicitarNombre(){
        System.out.println("-----------------------------------------------");
        System.out.println("Ingresa nombre");
        return(scanner.nextLine());
          
    }
    
    private Set<MedioComunicacion> pedirMedios(){
        Set<MedioComunicacion> medios= new TreeSet<MedioComunicacion>();
        int opcion=0;
        for(int i=0;i<TipoMedio.values().length;i++){
            System.out.println(String.format("1.-Ingresar %s",TipoMedio.values()[i]));
            MedioComunicacion medioComunicacion= new MedioComunicacion(TipoMedio.values()[i],scanner.nextLine());
            medios.add(medioComunicacion);
        }
        return medios;       
    }
        
}
