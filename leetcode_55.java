public class leetcode_55 {
    public static boolean juumps(int[] nums) {
        int boundary=0;
        for (int i = 0; i < nums.length; i++) {
            boundary=Math.max(boundary, i+nums[i]);
            if(boundary>=nums.length-1){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
    int nums[]={0,0,0,0,0,0,1};
    System.out.println(juumps(nums));
    }
}
