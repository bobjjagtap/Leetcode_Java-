public class leetCode_3095 {
    public static int minimumSubarrayLength(int[] nums, int k) {
        int len=nums.length+1;
        int length=nums.length+1;
        for (int i = 0; i < nums.length; i++) {
            int val=0;
            for (int j = i; j < nums.length; j++) {
                val|=nums[j];
                if(val>=k){
                    len=Math.min(len,j+1-i);
                }
            }
        }
        return len==length?-1:len;
    }
    public static void main(String[] args) {
        int nums[]={1,2,3};
        System.out.println(minimumSubarrayLength(nums,6));
    }
}
