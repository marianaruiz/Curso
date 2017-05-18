package curso.projecto4.business;

import curso.projecto4.model.TipoArticulo;

public class SinStockExeption extends Exception{
    private static final long serialVersionUID = 1L;
    private TipoArticulo tipo;
    private int disponibles;
     
    
    public SinStockExeption(TipoArticulo string, int disponibles) {
        super();
        this.tipo = string;
        this.disponibles = disponibles;
    }


    @Override
    public String getMessage() {
        // TODO Auto-generated method stub
       
        return String.format("Solo se tienen %d unidades de %s",disponibles,tipo);
    }
   
  
    
}
