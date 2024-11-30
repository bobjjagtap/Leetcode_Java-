import java.util.Arrays;

public class leetCode_268 {
    public static int missingNumber(int[] nums){
        // Arrays.sort(nums);
        // int j =nums[0];
        // for ( ; j < nums[nums.length-1]; j++) {
        //     if(j!=nums[j]){
        //         return j;
        //     }
        // }
        // return nums[nums.length-1]+1;
        int n = nums.length;
       int totalSum = n*(n+1)/2;
        int sum = 0;
        for(int i =0;i<n;i++){
            sum = sum+nums[i]; 
        }
        return totalSum - sum;
    }
    public static void main(String[] args) {
        int nums[]={0,1,2,3,4};
        System.out.println(missingNumber(nums));
    }
}
