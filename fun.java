import java.util.*;
public class fun{
    public static void function(int n) {
        if(n<0){
            System.out.println("invild number");
            return;
        }
        int factorial=1;
        for(int i=n;i>=1;i--){
            factorial=factorial * i;
        }
        System.out.println("factorial of" + n+" is " + factorial);
        return;
    }
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        function(n);
    }
}