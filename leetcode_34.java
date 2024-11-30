public class leetcode_34 {
    public static int[] findd(int nums[],int target) {
        int[] ans = {-1, -1};
        // First Occurrence
        int start = 0, end = nums.length - 1;
        int mid = (start + end) / 2;
        while (start <= end) {
            mid = (start + end) / 2;
            if (target == nums[mid]) {
                ans[0] = mid;
                end = mid - 1;
            } else if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            }
        }
        // Last Occurrence
        start = 0;
        end = nums.length - 1;
        while (start <= end) {
            mid = (start + end) / 2;
            if (target == nums[mid]) {
                ans[1] = mid;
                start = mid + 1;
            } else if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int array[]={5,7,7,8,8,10},target=8;
        System.out.println(findd(array,target));
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
