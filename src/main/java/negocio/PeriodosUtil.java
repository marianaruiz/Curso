package negocio;

import java.util.Date;
import java.util.Set;
import java.util.TreeSet;

import org.apache.commons.lang.time.DateUtils;

public class PeriodosUtil {

    private PeriodosUtil() {

    }

    public static Set<Date> generarPeriodos(Date fechaInicial, int meses) {
        Set<Date> fechas = new TreeSet<Date>();
        fechas.add(fechaInicial);
        for (int i = 1; i < meses; i++) {
            fechas.add(DateUtils.addMonths(fechaInicial, i));
        }
        return fechas;
    }
}
