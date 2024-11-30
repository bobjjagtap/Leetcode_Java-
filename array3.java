import java.util.*;
public class array3{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        int number[] = new int[size];
        //input array
        System.out.println("Enter the array");
        for(int i=0;i<size;i++){
            number[i]=sc.nextInt(); 
        }
        //Ascending order initializing method 
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
            System.out.println();
            System.out.println("output is");
            //output the array
            for(int i=0;i<number.length;i++){
                System.out.println(number[i]+" ");

            }    
        
    }
}