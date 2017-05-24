package conversor.negocio;

import java.math.BigDecimal;

public class ConversorUnidadesUtils {

    private ConversorUnidadesUtils() {
        
    }
    
    public static final BigDecimal convertirKm2Mi(BigDecimal km) {
        BigDecimal factor = new BigDecimal("0.621371");
        return km.multiply(factor).setScale(2, BigDecimal.ROUND_HALF_DOWN);
    }
    
    public static final BigDecimal convertirM2Ft(BigDecimal m) {
        BigDecimal factor = new BigDecimal("0.30479");
        return m.divide(factor, 2, BigDecimal.ROUND_HALF_DOWN);
    }
    
    public static final BigDecimal convertirCm2Inch(BigDecimal cm) {
        BigDecimal factor = new BigDecimal("2.54");
        return cm.divide(factor, 2, BigDecimal.ROUND_HALF_DOWN);
    }
    
    public static final BigDecimal convertirKg2Lb(BigDecimal kg) {
        BigDecimal factor = new BigDecimal("0.4536");
        return kg.divide(factor, 2, BigDecimal.ROUND_HALF_DOWN);
    }
    
    public static final BigDecimal convertirLt2Gl(BigDecimal lt) {
        BigDecimal factor = new BigDecimal("0.264172");
        return lt.multiply(factor).setScale(2, BigDecimal.ROUND_HALF_DOWN);
    }
    
    public static final BigDecimal gc2gf(BigDecimal gc) {
        BigDecimal factor1 = new BigDecimal("1.8");
        BigDecimal factor2 = new BigDecimal("32");
        return gc.multiply(factor1).add(factor2).setScale(2, BigDecimal.ROUND_HALF_DOWN);
    }
    
    public static final BigDecimal d2hr(BigDecimal d) {
        BigDecimal factor = new BigDecimal("24");
        return d.multiply(factor).setScale(2, BigDecimal.ROUND_HALF_DOWN);
    }
    
    public static final BigDecimal convertirLt100km2Kmlt(BigDecimal lt100km) {
        BigDecimal factor = new BigDecimal("0.01");
        return BigDecimal.ONE.divide(lt100km.multiply(factor), 2, BigDecimal.ROUND_HALF_DOWN);        
    }
}
