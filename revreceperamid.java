import java.util.*;
public class revreceperamid{
    public static void peramid(int n) {
        // outer loop
        for (int i = 1; i <= n; i++)
            
        {
            // inner loop
            for (int j = n; j >=i; j--) {
                System.out.print(" ");

            }
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println("");
        }
        

    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the number as star you want");
        int n=sc.nextInt();
        peramid(n);

    }
}