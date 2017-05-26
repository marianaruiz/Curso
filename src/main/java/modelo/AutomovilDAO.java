package modelo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.text.StyledEditorKit.StyledTextAction;

import org.apache.commons.lang.math.RandomUtils;
//Data Access Object
public class AutomovilDAO {
    private static List<Automovil> autos= new ArrayList<Automovil>();
    static {
        int[] meses = new int[] {12, 24, 36};
        String[] nombres = new String[]{"Nissan GTR", "Subaru BRZ", "BMW M2", "Audi RS5", "Nissan 370Z"};
        String[] precios = new String[]{"2499990.00", "485900.00", "1129900.00", "1104900.00", "645900.00"};
        String[] images = new String[]{"nissan_gtr_2017.jpg", "brz_2017.jpg", "bmw_m2_2017.jpg", "audi_rs5_2017.jpg", "nissan_370z_2017.jpg"};
        
        for (int i = 0; i < nombres.length; i++) {
            Map<Integer, BigDecimal> intereses = new HashMap<Integer, BigDecimal>();
            for (int j = 0; j < meses.length; j++) {
                intereses.put(meses[j], new BigDecimal(String.valueOf(RandomUtils.nextFloat())));
            }
            autos.add(new Automovil(i + 1, nombres[i], new BigDecimal(precios[i]), images[i], intereses));
        }
    }
    public List<Automovil> findAll(){
        
        return autos;        
    }
    public Automovil getbyIde(int id){
        return autos.get(id-1);        
    }
    
}
