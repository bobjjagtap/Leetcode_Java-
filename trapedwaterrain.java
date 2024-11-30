import java.util.*;

import javax.sound.sampled.SourceDataLine;
public class trapedwaterrain{
    public static int trapedwater(int array[]) {
        int leftMax[]=new int[array.length];
        for(int i=1;i<array.length;i++){
            leftMax[i]=Math.max(i, i);
        }
        return a;

        
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("enter the number of size array that array want");
        int n=sc.nextInt();
        int array[]=new int[n];
        System.out.println("enter the array");
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        System.out.print(trapedwater(array));

    }
}