/*Write a function which takes in 2 numbers and 
returns the greater of those two.*/
import java.util.*;
public class greaternumber{
    public static void function(int a,int b) {
        if(a>b){
            System.out.println(a+" is greater");
        }
        else if(b>a){
            System.out.println(b+" is greater");
        }
            else {
                System.out.println("is equal");
            }
        
    }
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        function(a,b);
    }
}