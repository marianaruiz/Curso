package conversor.negocio;

import org.junit.Test;

import java.math.BigDecimal;

import org.junit.Assert;

public class ConversorTest {
    
    @Test
    public void convertirKm2Mi() {
        BigDecimal origen = BigDecimal.TEN;
        BigDecimal esperado = new BigDecimal("6.21");
        
        BigDecimal destino = ConversorUnidadesUtils.convertirKm2Mi(origen);
        
        Assert.assertTrue(destino.equals(esperado));
    }
    
    @Test
    public void convertirM2Ft() {
        BigDecimal origen = BigDecimal.ONE;
        BigDecimal esperado = new BigDecimal("3.28");
        
        BigDecimal destino = ConversorUnidadesUtils.convertirM2Ft(origen);
        
        Assert.assertTrue(destino.equals(esperado));
    }
    
    @Test
    public void convertirCm2Inch() {
        BigDecimal origen = BigDecimal.ONE;
        BigDecimal esperado = new BigDecimal("0.39");
        
        BigDecimal destino = ConversorUnidadesUtils.convertirCm2Inch(origen);
        
        Assert.assertTrue(destino.equals(esperado));
    }
    
    @Test
    public void convertirKg2Lb() {
        BigDecimal origen = BigDecimal.ONE;
        BigDecimal esperado = new BigDecimal("2.20");
        
        BigDecimal destino = ConversorUnidadesUtils.convertirKg2Lb(origen);
        
        Assert.assertTrue(destino.equals(esperado));
    }
    
    @Test
    public void convertirLt2Gl() {
        BigDecimal origen = BigDecimal.ONE;
        BigDecimal esperado = new BigDecimal("0.26");
        
        BigDecimal destino = ConversorUnidadesUtils.convertirLt2Gl(origen);
        
        Assert.assertTrue(destino.equals(esperado));
    }
    
    @Test
    public void gc2gf() {
        BigDecimal origen = BigDecimal.TEN;
        BigDecimal esperado = new BigDecimal("50.00");
        
        BigDecimal destino = ConversorUnidadesUtils.gc2gf(origen);
        
        Assert.assertTrue(destino.equals(esperado));
    }
    
    @Test
    public void d2hr() {
        BigDecimal origen = BigDecimal.TEN;
        BigDecimal esperado = new BigDecimal("240.00");
        
        BigDecimal destino = ConversorUnidadesUtils.d2hr(origen);
        
        Assert.assertTrue(destino.equals(esperado));
    }
    
    @Test
    public void convertirCombustible() {
        BigDecimal origen = new BigDecimal("13");
        BigDecimal esperado = new BigDecimal("7.69");
        
        BigDecimal destino = ConversorUnidadesUtils.convertirLt100km2Kmlt(origen);
        
        Assert.assertTrue(destino.equals(esperado));
    }
}
