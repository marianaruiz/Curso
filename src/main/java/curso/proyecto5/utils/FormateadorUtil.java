package curso.proyecto5.utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class  FormateadorUtil {
    private static DateFormat da = new SimpleDateFormat("dd/MM/yyyy");;

    public static String format(Date date){
          return da.format(date);
    }
    public static Date parse(String date) throws ParseException{
        return da.parse(date);
    }   
}
