public class leetCode_189 {
    public void rotate(int[] nums, int k) {

        rotateee(nums, 0, nums.length - 1);
        rotateee(nums, 0, k - 1);
        rotateee(nums, k, nums.length - 1);

    }

    public void rotateee(int nums[], int start, int end) {
        while (start < end) {
            int temp = nums[end];
            nums[end] = nums[start];
            nums[start] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        leetCode_189 lc = new leetCode_189();
        int nums[] = { 1, 2, 3, 4, 5, 6, 7 };
        lc.rotate(nums, 3);
    }
}