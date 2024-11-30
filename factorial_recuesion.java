import java.util.Scanner;

public class factorial_recuesion {
    public static int factorial(int n) {
        if(n==0){
            return 1;
        }
         int sum=n*factorial(n-1);
        return sum;
        
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(factorial(n));
        

    }
}
