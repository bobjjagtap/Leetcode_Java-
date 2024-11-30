public class leetCode_154 {
    public static int Check(int[] nums) {
        int start=0;
        int end=nums.length-1;
        while(start<end){
            int mid=start+(end+start)/2;
            if(nums[mid]>nums[end]){
                start=mid+1;
            }else{
                if(nums[mid]<nums[end]){
                    end=mid;
                }else{
                    end--;
                }
            }
        }
        return nums[end];
    }
    public static void main(String[] args) {
        int nums[]={3,4,5,6,1,2};
        System.out.println(Check(nums));
    }
}
