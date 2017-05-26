import java.util.Date;
import java.util.Set;

import org.apache.commons.lang.time.DateFormatUtils;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import junit.framework.Assert;
import negocio.PeriodosUtil;

public class PeriodoTest {
    private static Logger logger= LoggerFactory.getLogger(PeriodoTest.class);
    @Test
    public void pruebaPeriodos(){
        logger.info("prueba");
        Date now=new Date();
        Set<Date> fechas=PeriodosUtil.generarPeriodos(now,12);
        for (Date fecha : fechas) {
            logger.debug(DateFormatUtils.format(fecha, "dd/MM/yyyy"));
        }
        Assert.assertTrue(fechas.size()==12);
    }
}
