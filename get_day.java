import java.text.SimpleDateFormat;  
import java.util.Date;    
public class get_day {
    public static void main(String[] args) {
        get_day gt=new get_day();
         SimpleDateFormat formatter = new SimpleDateFormat("dd/12/2002 HH:mm:ss");  
    Date date = new Date();  
    System.out.println(formatter.format(date));    
    }
}
