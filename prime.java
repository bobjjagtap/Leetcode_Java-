import java.util.*;

public class prime {
  public static boolean prime(int n) {
    boolean isprime = true;
    for (int i = 2; i <= n-1; i++) {
      //n-1 will be not a fix value of that paramiter,it is a temporary value.
      //n-1 hi value fix value naste ti tya statement purta maryadit aaste karan 
      //ti n=n-1 aashi asli tar save hot ti fhakt i <= n-1 aashi aaste hyat ti save nahi hot
      if (n % i == 0) {
        isprime = false;
        System.out.println("is  not a prime "+ n);
        break;
      }
      else{
        System.out.println("is a prime no" + n);
      }
    }
  
  
    return isprime;
    }
    /*public static void primeisrange(int n){
   * for(int i=2;i<=n;i++){
   * if(prime(i)){
   * System.out.println(i+" ");
   * }
   * }
   * }
   */

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the number");
    int n = sc.nextInt();
    prime(n);
    //System.out.println(prime(n));

  }
}