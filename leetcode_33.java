public class leetcode_33 {
    public static int[] findd(int nums[],int trager) {
        int start=0;
        int end=nums.length-1;
        int mid=start+end/2;
        while(start<=end){
             mid=(start+end)/2;
            if(nums[mid]==trager){
                return mid;
            }
            if(nums[start]<=nums[mid]){
                if(nums[start]<=trager && nums[mid]>= trager){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }else{
                
                    if(nums[mid]<=trager && nums[end]>=trager){
                        start=mid+1;
                    }
                    else{
                        end=mid-1;
                    }
                
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int nums[]={4,5,6,7,0,1,2};
        int trager=0;
        System.out.println(findd(nums,trager));
    }
}
