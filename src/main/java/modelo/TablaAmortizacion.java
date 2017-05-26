package modelo;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TablaAmortizacion {
    private CondicionesDeCredito condiciones;
    private NavigableSet<Amortizacion> amortizaciones;
    
    public TablaAmortizacion() {
        super();
    }

    public TablaAmortizacion(CondicionesDeCredito condiciones) {
        this.condiciones = condiciones;
        this.amortizaciones=new TreeSet<Amortizacion>();
    }

    public CondicionesDeCredito getCondiciones() {
        return condiciones;
    }

    public void setCondiciones(CondicionesDeCredito condiciones) {
        this.condiciones = condiciones;
    }

    public NavigableSet<Amortizacion> getAmortizaciones() {
        return amortizaciones;
    }

    public void setAmortizaciones(NavigableSet<Amortizacion> amortizaciones) {
        this.amortizaciones = amortizaciones;
    }
    public boolean add(Amortizacion a) {
        return this.amortizaciones.add(a);
    }
    
}
