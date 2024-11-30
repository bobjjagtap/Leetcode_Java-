import java.util.*;
public class numbertriangle{
    public static void triangle(int n){
        int tp=0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                tp=i+j;
                //tp++;
                if(tp%2==0){
                    System.out.print("1");
                }
                else{
                    System.out.print("0");

                }
                
            }
            System.out.println();
        }
    }
            public static void main(String[] args) {
                Scanner sc=new Scanner(System.in);
                System.out.println("ente the number as like array want");
                int n= sc.nextInt();
               /*  System.out.println("array listed");
                int array[]=new int[n];
                for(int i=1;i<n;i++){
                    array[i] = sc.nextInt();
                }*/
                triangle(n);

            }
}