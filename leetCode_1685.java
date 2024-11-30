public class leetCode_1685 {
    public static int[] getSumAbsoluteDifferences(int[] nums) {
        int sum=0;
        for (int i : nums) {
            sum+=i;
        }

        int left=0,right=sum;
        int ans[]=new int[nums.length];
        for (int j = 0; j < nums.length; j++) {
            int n=nums[j];
            right-=n;
            ans[j]=n*j-left+right-n*(nums.length-j-1);
            left+=n;
        }
        return ans;
    }
    public static void main(String[] args) {
        int nums[]={2,3,5};
       nums= getSumAbsoluteDifferences(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }

    }
}
