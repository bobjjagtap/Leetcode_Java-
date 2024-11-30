
import java.util.Arrays;

public class leetCode_16 {
    public int smallsum(int nums[], int target) {
       Arrays.sort(nums);
       int ans=Integer.MAX_VALUE;
       int closestsum=nums[0]+nums[1]+nums[2];
       for (int i = 0; i < nums.length-2; i++) {
        int j=i+1;
        int k=nums.length-1;
        while (j<k) {
            int sum=nums[i]+nums[j]+nums[k];
            int close1=Math.abs(target-sum);
            int close2=Math.abs(target-closestsum);
            int res1=Math.abs(target-close1);
            int res2=Math.abs(target-close2);
                if(res1<res2){
                    ans=res1;
                }else{
                    ans=res2;
                }

            if(sum<target){
                j++;
            }else{
                k--;
            }
        }
       }
       return closestsum;
    }

    public static void main(String[] args) {
        int[] nums = { -1,2,1,-4};
        int target = 1;
        leetCode_16 lc = new leetCode_16();
        System.out.println(lc.smallsum(nums, target));
    }
}
