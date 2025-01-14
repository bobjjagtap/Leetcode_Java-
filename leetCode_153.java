public class leetCode_153 {
    public static int check(int[] nums) {
        int s=0;
        int e=nums.length-1;
        while(s<e){
            int mid=s+(e-s)/2;
            if(nums[mid]>nums[e]){
                s=mid+1;
            }else{
               if(nums[mid]<nums[e]){
                   e=mid;
               }else{
                   e--;
               }
            }
        }
        return nums[e];
        
    }
    public static void main(String[] args) {
        int nums[]={-2,0,-1};
        System.out.println( check(nums));
       
    }
}
