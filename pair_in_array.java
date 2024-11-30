import java.util.*;
public class pair_in_array{
    public static void pair(int n,int arrray[]){
            int tp=0;
        for(int i=0;i<arrray.length;i++){
            int crr = arrray[i];
            for(int j=i;j<arrray.length;j++){//add +1 to (i) the pair will be not repited
                System.out.print("("+crr+","+arrray[j]+")");
                tp++;
            }
            System.out.println();
        } 
        System.out.println("total pair = "+tp);
    }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the number that size of array you want");
    int n = sc.nextInt();
    int arrray[] = new int[n];
    System.out.println("enyer the array");
    for(int i=0;i<n;i++){
      arrray[i] = sc.nextInt();  
    }
    pair(n,arrray);
        
    }
}
