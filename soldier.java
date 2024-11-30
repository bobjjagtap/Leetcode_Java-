import java.util.*;
public class soldier{
    public static void find(int array[][]) {
        int key=array.length;
        System.out.println(array.length);
        int arr[]=new int[key];
        for (int i = 0; i < array.length; i++) {
            int count=0;
            for (int j = 0; j < array[0].length; j++) {
                if(array[i][j]==1){
                    count++;
                }
            }
                arr[i]=count;

        } 
        int e=key/2;
        int ar[]=new int[e];
        System.out.println("the weekest row is = ");
        for(int j = 0; j <key; j++){
            if(arr[j]<=e)
            System.out.print(arr[j]);     
        }
    }
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the row");
        int n=sc.nextInt();
        System.out.println("enter the column");
        int k=sc.nextInt();
        int array[][] = new int[n][k];
        int o=array.length;
        int p=array[0].length;
        System.out.println("enter the array");
        for(int i=0;i<o;i++){
                for(int j=0;j<p;j++){
                    array[i][j]=sc.nextInt();
            }
        }
        find(array);
        // for (int i = 0; i < o; i++) {
        //     for (int j = 0; j < p; j++) {
        //         System.out.print(array[i][j] + " ");
        //     }
        //     System.out.println();
        // }       
     }

 }