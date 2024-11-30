import java.util.*;

public class subarray {
    public static void substring(int array[]) {
        int sum=0;
        int maxSum=Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
           int start = i;
            for (int j = i; j < array.length; j++) {
                 int end = j;
                  sum=0;
                 for (int k=start;k<=end;k++){
                    
                    sum+=array[k]/*+sum*/;
                    //System.out.print(array[k]+"");
                    
                 } 
                 System.out.print("="+sum);
                 
                 if(maxSum<sum){
                    maxSum=sum;
                    
                 }
                 
                System.out.println();
            }
            
        }
        
        System.out.print("maximun number is"+ sum);
    }

    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number that size of array you want");
        int n = sc.nextInt();
        System.out.println("enter the array");
        int array[] = new int[n];
        for (int i = 0; i <n; i++) {
            array[i] = sc.nextInt();
        }
        substring(n, array);

    }
}