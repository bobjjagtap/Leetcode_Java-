public class leetcode_53 {
    public static int addd(int[] nums) {
        int current = 0, maxsum = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            current += nums[i];
            if (current > maxsum) {
                maxsum = current;
            }
            if (current < 0) {
                current = 0;
            }
        }
        return maxsum;
    }

    public static void main(String[] args) {
        int nums[] = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        System.out.println(addd(nums));
    }
}
