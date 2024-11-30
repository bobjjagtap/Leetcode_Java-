/*Write a function that takes in the radius as 
input and returns the circumference of a circle.*/

//CIRCUMFERENCE OF THE CIRCLE=2πR
import java.util.*;
public class circumference{
    public static void function(int n) {
        double sum,p=3.14;
        sum=2*p*n;
        System.out.println(sum);
        
    }
    public static void main(String[]args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        function(n);
    }
}