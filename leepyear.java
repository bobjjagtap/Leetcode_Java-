import java.util.*;
public class leepyear{
    public static void main(String[]args) { 
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
       /*  if(n%4==0 && n%100==0)
        {
            System.out.println("is a leep year");
        }
        else{
            System.out.println("is not a leep year");
        }*/
        
        String type =(n%4==0 && n%100==0)? "leep year":"not leep year";
        System.out.println(type);
    }   
}