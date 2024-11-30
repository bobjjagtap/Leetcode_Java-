import java.util.*;

public class leetCode_209 {
    public static int minSubArrayLen(int target, int[] nums) {
        int min_length = Integer.MAX_VALUE;
        int count = 0;
        for (int j2 = 0; j2 < nums.length - 1; j2++) {
            for (int k = j2 + 1; k < nums.length; k++) {
                if (nums[k] == target) {
                    return 1;
                } else if (nums[j2] + nums[k] == target) {
                    count = (k - j2) + 1;
                    min_length = Math.min(count, min_length);
                }
            }
        }
        return min_length;
    }

    public static void main(String[] args) {
        int nums[] = { 2, 3, 1, 2, 4, 3 };
        int target=4;
        System.out.println(minSubArrayLen(target,nums));
    }
}
