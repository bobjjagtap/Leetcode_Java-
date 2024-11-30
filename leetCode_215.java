public class leetCode_215 {
    public static void findKthLargest(int[] nums, int n) {
        int max = Integer.MIN_VALUE;
        for (int k = 0; k < n; k++) {
            int j = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[j] < nums[i]) {
                    j = i;
                }
            }
            max=nums[j];
            System.out.print(max +"->");
            nums[j] = Integer.MIN_VALUE;
        }

    }
    public static void main(String[] args) {
        int[] nums = { -3, -2, -1};
        int k = 2;
        findKthLargest(nums, k);
    }
}
