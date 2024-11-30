import java.util.*;
public class b_to_d{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the decimal number = ");
    int n=sc.nextInt();
    for(int i=n;i>=1;){
    n=n/2;
    System.out.println(n);
    }


    
  }  
}