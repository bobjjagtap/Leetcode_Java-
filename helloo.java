import java.util.*;
import java.util.jar.Attributes.Name;
public class helloo{
    public static void main(String[] args) {
        int meal =5;
        int tip =2;
        int total = meal+(meal>6 ? ++tip : --tip);
        System.out.println(total);
        
    }
}