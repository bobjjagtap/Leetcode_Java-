/*Two numbers are entered by the user, x and n. Write a function to
 find the value of one number raised to the power of another i.e. xn.*/
 import java.util.*;
 public class  number{
    int sum;
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum=1;
        
        for(int i=1;i<=b;i++){

            sum=sum*a;
        }
        System.out.println(sum);

    }
    
 }