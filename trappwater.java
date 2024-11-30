import java.util.*;
public class trappwater{
    public static int water(int array[]){
        int n=array.length;
        int leftarray[]=new int[n];
        leftarray[0]=array[0];
        for(int i=1;i<n;i++){           
        leftarray[i]=Math.max(array[i],leftarray [i-1]);
        }
        int rightarray[] = new int[n];
        rightarray[n-1] = array[n-1];
        for(int i=n-2;i>=0;i--){
            rightarray[i]=Math.max(array[i],rightarray [i+1]);
        }
        int trapppewater=0;
       
        for(int i=0;i<n;i++){
            int waterlevel=Math.min(leftarray[i], rightarray[i]);
            trapppewater+=waterlevel-array[i];
        }
        return trapppewater;
    }
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the number the size of array want");
    int n = sc.nextInt();
    int array[] = new int[n];
    System.out.println("enter the array");
    for(int i=0;i<n;i++){
        array[i]=sc.nextInt();
    }
     //int array[]={4,2,0,6,3,2,5};
    System.out.println("total water fill "+water(array)+"litre");
 }
    
}