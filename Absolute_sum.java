import java.util.*;
public class Absolute_sum {
    public static void main(String[] args) {
        int A[]={4,1,7,8};
        int B[]={2,3,6,5};
        Arrays.sort(A);
        Arrays.sort(B);
        int min_sum=0;
        for (int index = 0; index < A.length; index++) {
            min_sum+=Math.abs(A[index]-B[index]);
            // if(sum<0){
            //     min_sum+=sum*-1;
            // }else{
            //     min_sum+=sum;
            // }
        }
        System.out.println(min_sum);
    }
}
