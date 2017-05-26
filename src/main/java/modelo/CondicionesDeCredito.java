package modelo;

import java.math.BigDecimal;
import java.util.Date;

public class CondicionesDeCredito {
    private Date fechaInicial;
    private int plazo;
    private BigDecimal importePrestamo;
    private BigDecimal enganche;
    private BigDecimal tasaInteres;
    
    public CondicionesDeCredito() {
        super();
    }

    public CondicionesDeCredito(Date plazoInicial, int plazo, BigDecimal importePrestamo, BigDecimal enganche,
            BigDecimal tasaInteres) {
        this.fechaInicial = plazoInicial;
        this.plazo = plazo;
        this.importePrestamo = importePrestamo;
        this.enganche = enganche;
        this.tasaInteres = tasaInteres;
    }

    

    public Date getFechaInicial() {
        return fechaInicial;
    }

    public void setFechaInicial(Date fechaInicial) {
        this.fechaInicial = fechaInicial;
    }

    public int getPlazo() {
        return plazo;
    }

    public void setPlazo(int plazo) {
        this.plazo = plazo;
    }

    public BigDecimal getImportePrestamo() {
        return importePrestamo;
    }

    public void setImportePrestamo(BigDecimal importePrestamo) {
        this.importePrestamo = importePrestamo;
    }

    public BigDecimal getEnganche() {
        return enganche;
    }

    public void setEnganche(BigDecimal enganche) {
        this.enganche = enganche;
    }

    public BigDecimal getTasaInteres() {
        return tasaInteres;
    }

    public void setTasaInteres(BigDecimal tasaInteres) {
        this.tasaInteres = tasaInteres;
    }
    
    
}
