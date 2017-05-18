package curso.proyecto5.model;

public class MedioComunicacion implements Comparable<MedioComunicacion>{
    private TipoMedio tipoMedio;
    private String valor;
    public MedioComunicacion(TipoMedio tipoMedio, String valor) {
        this.tipoMedio = tipoMedio;
        this.valor = valor;
    }
    public TipoMedio getTipoMedio() {
        return tipoMedio;
    }
    public void setTipoMedio(TipoMedio tipoMedio) {
        this.tipoMedio = tipoMedio;
    }
    public String getValor() {
        return valor;
    }
    public void setValor(String valor) {
        this.valor = valor;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj==this){
            return true;
        }
        if(!(obj instanceof MedioComunicacion)){
            return false;
        }
        MedioComunicacion medio=(MedioComunicacion)obj;
        return medio.getTipoMedio()==tipoMedio && medio.getValor()== valor;
    }
    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return tipoMedio.toString().length()*valor.length();
    }
    @Override
    public String toString() {
        return "tipoMedio=" + tipoMedio + "\nvalor=" + valor ;
    }
    public int compareTo(MedioComunicacion arg0) {
        // TODO Auto-generated method stub
        return  this.tipoMedio.toString().compareTo(arg0.tipoMedio.toString());
    }


    
}
