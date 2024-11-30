/*Write a function to print the sum of all 
  odd numbers from 1 to n. */
import java.util.*;
public class sumodd{
    public static void function(int a) {
        int sum=0;
        for(int i=0;i<=a;i++){
            if(i % 2!=0)
            sum= sum+i;
        }
        System.out.println(sum);     
    }
    public static void main(String[]args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        function(a);
    }
}