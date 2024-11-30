import java.util.*;
public class array4{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size");
        int size = sc.nextInt();
        int number[] = new int[size];
        System.out.println("enter the number");
        //enter the input
        for(int i=0;i<size;i++){
            number [i]= sc.nextInt();
        }
        int temp=0;
        for(int i=0;i<number.length;i++){
            for(int j=i+1;j<number.length;j++){
                if(number[i]>number[j]){
                   temp=number[i];
                   number[i]=number[j];
                   number[j]=temp;
                }   
            }
        }
        System.out.println("output is");
        for(int i=0;i<number.length;i++){
            System.out.print(number[i]+" ");

        }

        
    }
}