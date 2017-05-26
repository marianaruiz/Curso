package negocio;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import modelo.Amortizacion;
import modelo.CondicionesDeCredito;
import modelo.TablaAmortizacion;

public class Amortizador {
    
    private static final Logger logger = LoggerFactory.getLogger(Amortizador.class);
    
    private Amortizador() {
        
    }
    
    public static TablaAmortizacion calcular(CondicionesDeCredito condiciones) {
        TablaAmortizacion ta = new TablaAmortizacion(condiciones);
        
        Set<Date> fechas = PeriodosUtil.generarPeriodos(condiciones.getFechaInicial(), condiciones.getPlazo());
        
        BigDecimal pagoCapital = condiciones.getImportePrestamo().divide(new BigDecimal(String.valueOf(condiciones.getPlazo())), 2, BigDecimal.ROUND_HALF_DOWN);
        
        int indice = 1;
        for (Date fecha : fechas) {
            BigDecimal pagado = pagoCapital.multiply(new BigDecimal(String.valueOf(indice - 1)));
            BigDecimal remanente = condiciones.getImportePrestamo().subtract(pagado.add(pagoCapital));
            BigDecimal pagoInteres = remanente.multiply(condiciones.getTasaInteres());
            Amortizacion a = new Amortizacion(indice++, fecha, pagoCapital, pagoInteres, pagado.add(pagoCapital), remanente);
            logger.debug(a.toString());
            ta.add(a);
        }
        
        Amortizacion last = ta.getAmortizaciones().last();
        
        last.setPagoCapital(last.getPagoCapital().add(last.getRemanente()));
        last.setPagoAcumulado(last.getPagoAcumulado().add(last.getRemanente()));
        last.setPagoInteres(BigDecimal.ZERO);
        last.setRemanente(BigDecimal.ZERO);
        
        
        return ta;
    }
}
