public class leetCode_162 {
    public static int findPeakElement(int[] nums) {
        int left_max=Integer.MIN_VALUE;
        //left search
        for (int i = 0; i < nums.length; i++) {
            left_max=Math.max(left_max, nums[i]);
        }
        for (int i = 0; i < nums.length; i++) {
            if(left_max==nums[i]){
                left_max=i;
                break;
            }
        }
        return left_max;
    }
    public static void main(String[] args) {
        int nums[]={1,3,1,3,2,};
        System.out.println(findPeakElement( nums));
    }
}
