package modelo;

import java.math.BigDecimal;
import java.util.Date;

import org.apache.commons.lang.builder.CompareToBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

public class Amortizacion implements Comparable<Amortizacion>{
    private int numero;
    private Date fecha;
    private BigDecimal pagoCapital;
    private BigDecimal pagoInteres;
    private BigDecimal pagoAcumulado;
    private BigDecimal remanente;
    
    public Amortizacion() {
        super();
    }

    public Amortizacion(int numero, Date fecha, BigDecimal pagoCapital, BigDecimal pagoInteres,
            BigDecimal pagoAcumulado, BigDecimal remanente) {
        super();
        this.numero = numero;
        this.fecha = fecha;
        this.pagoCapital = pagoCapital;
        this.pagoInteres = pagoInteres;
        this.pagoAcumulado = pagoAcumulado;
        this.remanente = remanente;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public BigDecimal getPagoCapital() {
        return pagoCapital;
    }

    public void setPagoCapital(BigDecimal pagoCapital) {
        this.pagoCapital = pagoCapital;
    }

    public BigDecimal getPagoInteres() {
        return pagoInteres;
    }

    public void setPagoInteres(BigDecimal pagoInteres) {
        this.pagoInteres = pagoInteres;
    }

    public BigDecimal getPagoAcumulado() {
        return pagoAcumulado;
    }

    public void setPagoAcumulado(BigDecimal pagoAcumulado) {
        this.pagoAcumulado = pagoAcumulado;
    }

    public BigDecimal getRemanente() {
        return remanente;
    }

    public void setRemanente(BigDecimal remanente) {
        this.remanente = remanente;
    }

    public int compareTo(Amortizacion o) {
        CompareToBuilder builder = new CompareToBuilder();
        builder.append(fecha, o.fecha);
        return builder.toComparison();
    }  
    
    @Override
    public String toString() {
        ToStringBuilder builder = new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
        builder.append(numero);
        builder.append(fecha);
        builder.append(pagoCapital);
        builder.append(pagoInteres);
        builder.append(pagoAcumulado);
        builder.append(remanente);
        return builder.toString();
    }
    
}
