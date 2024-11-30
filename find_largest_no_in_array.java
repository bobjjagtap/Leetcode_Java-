//error array out pof bound 
import java.util.*;
public class find_largest_no_in_array {
    public static int jayesh(int arrayo[]){
        int largest=Integer.MIN_VALUE;
        int i;
        for(i=0;i<arrayo.length;i++){
            if(largest < arrayo[i]){
                largest = arrayo[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number as want as array");
        int n = sc.nextInt();
        int arrayo[] = new int[n];
        for (int i = 0; i < n; i++) {
            arrayo[i] = sc.nextInt();
        }
        System.out.println("largest value in array is = "jayesh(arrayo));
    }
}