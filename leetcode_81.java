public class leetcode_81 {
    public static boolean findd(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (nums[mid] == target) {
                return true;
            } else if (nums[start] < nums[mid]) {
                if (nums[start] <= target && nums[mid] > target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else if (nums[mid] < nums[start]) {
                if (nums[mid] < target && nums[end] >= target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                start += 1;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int nums[] = { 2, 5, 6, 0, 0, 1, 2 };
        System.out.println(findd(nums, 3));
    }
}
