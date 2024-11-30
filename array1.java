import java.util.*;

public class array1 
{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int size = sc.nextInt();
        int number[] = new int[size];
        int i;
        //input the array
        System.out.println("The Array is ");
        for(i=0;i<size;i++){
            number[i]= sc.nextInt(); //one by one naumber save in (i)th idex
        }
        System.out.println("find the number");
        //enter the number thuse who find
        int x = sc.nextInt();
        //output the array
        for(i=0;i<number.length;i++){
            if(x == number[i]){
                System.out.println("position of index is " +i);
            }    
        }
    }

}