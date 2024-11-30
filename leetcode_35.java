public class leetcode_35 {
    public static int findd(int nums[],int target) {
        int position=0;
        for (int i = 0; i < nums.length; i++) {
            // if(target>nums[i]){
            //     position=i;
            //     break;
            // }
            // else{
            //     position=i;
            // }
            if(target>nums[i]){
                position=i+1;
                
            }
            //position=i;
        
        }
    return position;
        
    }
    public static void main(String[] args) {
        int nums[]={1,3,5,6}, target = 7;
        System.out.println(findd(nums,target));
    }
}
