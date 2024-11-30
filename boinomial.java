import java.util.*;

public class boinomial {
    public static double factorial(double n) {
        double a = 1;
        for (double i = n; i >= 1; i--) {
            a = a * i;

        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the value n! ");//both are declear same variable is(n)
        double w = sc.nextDouble();
        
        System.out.println("enter the value r! ");//both are declear same variable is(n)
        double e = sc.nextDouble();
        
        double q = factorial(w);//RETURN VALUE OF A
        double b = factorial(e);//RETURN VALUE OF A
        double c = factorial(w - e);//RETURN VALUE OF A
        double sum = q / (b * c);//THEN ADD ALL RETURN VALUE IN SINGLE VARIABLE
        
        System.out.println(sum);//PRINT THE VARIABLE
    }
}