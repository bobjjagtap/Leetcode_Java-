import java.util.*;
public class Arrays{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int size = sc.nextInt();
        int number[] = new int[size];
        System.out.println("array is "+size);

        for(int i=0;i<size;i++){
            number[i] = sc.nextInt();//one by one naumber save in (i)th idex            
        }
        System.out.println("output is");

        for(int i=0;i<number.length;i++){
            System.out.print(number[i]+" ");
        }
        
        
    }
}