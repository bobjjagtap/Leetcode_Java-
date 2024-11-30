import java.util.*;
public class odd_even{
    public static void OddEven(int n) {
        int bitmask=1;
        if((n & bitmask) == 0){
            System.out.println("even number = "+n);
        }
        else{
            System.out.println("odd number = "+n);
        }
       // return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        OddEven(n);
    }
}