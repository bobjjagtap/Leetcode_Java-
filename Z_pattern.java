import java.util.*;

public class Z_pattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print("=");
        }
        System.out.println();
        for (int j = n-1; j >= 2; j--) {

            for (int i = j-1; i >= 1; i--) {
                System.out.print(" ");
            }
            System.out.println("//");
        }
        for (int i =1; i<=n; i++) {
            System.out.print("=");
        }
    }
}
