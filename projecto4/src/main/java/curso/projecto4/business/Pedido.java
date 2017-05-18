package curso.projecto4.business;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import curso.projecto4.model.Comprable;
import curso.projecto4.model.ComprableImp;

public class Pedido {
    private Comprable[] productos = new Comprable[3];
    private int[] cantidades = new int[3];
    private int indice = 0;

    public String imprimir() {
        StringBuilder sb = new StringBuilder();
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        NumberFormat nf = new DecimalFormat("###,###.00");
        
        sb.append("Pedido\n");
        sb.append(String.format("                   Fecha %s\n", df.format(new Date())));
        sb.append("\n");
        sb.append("Producto    Cantidad    Precio Unitario    Total\n");
        BigDecimal total = BigDecimal.ZERO;
        for (int i = 0; i < indice; i++) {
            Comprable comprable = productos[i];
            Long cantidad = Long.valueOf(cantidades[i]);
            BigDecimal totalArticulo = comprable.getPrecio().multiply(BigDecimal.valueOf(cantidad));
            total = total.add(totalArticulo);
            sb.append(String.format("%s        %d    %s    %s\n", 
                    comprable.getTipo(), 
                    cantidad, 
                    nf.format(comprable.getPrecio()), 
                    nf.format(totalArticulo)));
        }
        sb.append("\n");
        sb.append(String.format("Total                    %s\n", nf.format(total)));    
        BigDecimal impuestos = total.multiply(new BigDecimal("0.16"));      
        sb.append(String.format("Impuestos                %s\n", nf.format(impuestos)));
        BigDecimal totalMasImpuestos = total.add(impuestos);
        sb.append(String.format("Total + Impuestos        %s\n", nf.format(totalMasImpuestos)));        
        
        return sb.toString();
    }
    
    public void agregar(Comprable comprable, int cantidad) {
        int indiceActual = -1;
        for (int i = 0; i < indice; i++) {
            if (productos[i].getTipo() == comprable.getTipo()) {
                indiceActual = i;
                break;
            }
        }
        if (indiceActual == -1) {
            productos[indice] = comprable;
            cantidades[indice] = cantidad;
            indice++;
        } else {
            cantidades[indiceActual] += cantidad;
        }
        
    }
    
}
