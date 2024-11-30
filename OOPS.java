import java.util.*;
public class OOPS {
    public static void main(String[] args) {
        Pen n1 = new Pen(9);
        System.out.println(n1.tip);
    }
}
    
    class Pen{
        String colour;
        int tip;
        Pen(int tip){
           this.tip=tip;
        }
    }

