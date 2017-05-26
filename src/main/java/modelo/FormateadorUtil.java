package modelo;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class  FormateadorUtil {
    private static DateFormat da = new SimpleDateFormat("dd/MM/yyyy");;
    private static NumberFormat nf = new DecimalFormat("#,###,###.00");
    public static String format(Date date){
          return da.format(date);
    }
    public static Date parse(String date) throws ParseException{
        return da.parse(date);
    }   
    public static String formatNumber(Long number){
        return nf.format(number);
    }
    public static String formatNumber(BigDecimal number){
        return nf.format(number);
    }
    public static Long parseNumber(String date) throws ParseException{
      return (Long) nf.parse(date);
    }   
    
}
