package curso.proyecto.business;

public class ContactoExistenteExeption extends Exception{
    private static final long serialVersionUID = 1L;

    @Override
    public String getMessage() {
        // TODO Auto-generated method stub
        return ("El contacto ya existe");
    }

    
}
