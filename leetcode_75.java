public class leetcode_75 {
    public static void sortt(int[] nums) {
        int start=0;
        int end=nums.length-1;
        int mid=0;
        while(mid<=end){
            if(nums[mid]==0){
                int temp=nums[start];
                nums[start]=nums[mid];
                nums[mid]=temp;
                mid++;
                start++;
            }
            else if(nums[mid]==1)mid++;
            else{
                int temp=nums[mid];
                nums[mid]=nums[end];
                nums[end]=temp;
                end--;
                
            }
            
        }
        for (int j = 0; j < nums.length; j++) {
            System.out.println(nums[j]);
        }
        
    }
    public static void main(String[] args) {
        int nums[] = {2,1,2,1,0,0};
        sortt(nums);
    }
}
