import java.util.*;
public class array2{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int size= sc.nextInt();
        int number[] = new int [size];
        //input the array
        System.out.println("array is");
        for(int i=0;i<size;i++){
            number[i]=sc.nextInt();
        }
        //those are the function to find maximum and minimum value in array etc.

        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        
        //chack the value is accending order
        for(int i=0;i<number.length;i++){
            if(number[i] < min){
                min = number[i];
            }
            if(number[i] > max){
                max = number[i];
            }
        }
        System.out.println("larger number is"+min);
        System.out.println("smaller number is"+max);
    }

}