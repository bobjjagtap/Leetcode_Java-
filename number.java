import java.util.*;
 public class number{
    int sum;
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int base = sc.nextInt();
        int exponent = sc.nextInt();
        int sum=1;
        
        for(int i=1;i<=exponent;i++){

            sum=sum*base;
        }
        System.out.println(sum);

    }
    
 }