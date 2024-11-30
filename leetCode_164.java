import java.util.*;
public class leetCode_164 {
    public static int Check(int[] nums) {
        Arrays.sort(nums);
       int  sum=0;
        for (int i = 1; i < nums.length; i++) {
            sum=Math.max(nums[i]-nums[i-1],sum);
        }
return sum;
        
    }
    public static void main(String[] args) {
        int[] nums={10};
        System.out.println(Check(nums));
    }
}
