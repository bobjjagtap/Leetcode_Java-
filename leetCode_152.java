public class leetCode_152 {
    public static int maxProduct(int[] nums) {
        int max=nums[0];
        int ans=nums[0];
        int min=nums[0];

        for (int i = 1; i < nums.length; i++) {
            int num=nums[i];
            int prevmax=max;
            int prevmin=min;

            if(num<0){
                min=Math.min(num * prevmax,num);
                max=Math.max(num * prevmin,num);
                
            }else{
            max=Math.max(num * prevmax,num);
            min=Math.min(num * prevmin,num);
            }
            ans=Math.max(ans, max);
        }

        return ans;
    }
    public static void main(String[] args) {
        int nums[]={-2,3,-4};
        System.out.println(maxProduct(nums));
    }
}
