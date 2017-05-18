package curso.ejercicio7;

public class MainEjecicio7 {
    public static void main(String[] args){
        Contenedor c= new Contenedor();
        try{
            for(int i=0; i<10;i++){
                c.agregar(i);
            }
        } catch (MaximoException e) {
           System.err.println(e.getMessage());
           System.err.println(e.getMaximo());
        } finally{
            System.out.println("dentro de finally");
        }
        System.out.println("Continuo Feliz");
    }
}
