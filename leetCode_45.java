public class leetCode_45 {
    public static int jump(int[] nums) {
       int jump=0,current_int=0,large=0;
       for (int i = 0; i < nums.length-1; i++) {
        large=Math.max(large, i+nums[i]);
        if(i==current_int){
            current_int=large;
            jump++;
        }
       }
       return jump;
        
    }
    public static void main(String[] args) {
        int[] nums={2,3,1,1,1,4};
        System.out.println(jump(nums));        
    }
}
