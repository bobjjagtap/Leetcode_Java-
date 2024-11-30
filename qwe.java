import java.util.Scanner;
public class qwe{
    public static void ex(int array[],int key) {
        for(int i=key;i>=0;i--){
            System.out.print(array[i]);
            if(i==0){
                    for(int j=array.length-1;j>key;j--){
                        System.out.print(array[j]);
                    }
                }
        }

        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= 5;
        int array[]= new int[n];
        System.out.println("enter the array");
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        System.out.println("enter the number when you Reverse1 array");
        int key=sc.nextInt();
        ex(array,key);
    }
}