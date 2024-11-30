import java.util.*;
public class leetCode_169 {
    public static int majorityElement(int[] nums){
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
    public static void main(String[] args) {
        int[] nums={3,1,2,3,3,2};
        System.out.println(majorityElement(nums));
    }
}
