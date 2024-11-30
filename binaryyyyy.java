import java.util.*;
 public class binaryyyyy{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the decimal number = ");
    int n=sc.nextInt();
    int a=0,desimal=0;
    // while(true){
    //     if(n==0){
    //         break;
    //     }
    //     else{
    //         int temp=n%10;
    //         desimal +=temp*Math.pow(2,a);
    //         a++;
    //         n=n/10;
    //     }
    // }
    // System.out.println(desimal);
while(true){
    if(n==0){
        // System.out.println("0");
        break;
    }
    else{
        int temp=n%2;
        System.out.print(temp);
        n=n/2;
    }
}

    
    
}
}