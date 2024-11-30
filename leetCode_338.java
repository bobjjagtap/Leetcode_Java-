public class leetCode_338 {
    public static int[] countBits(int n) {
        
        int res[]=new int[n+1];
        for(int i=0;i<=n;i++){
            res[i]=Integer.bitCount(i);
        }
        return res;
        
    }
    public static void main(String[] args) {
        int n=49;
        int nums[]=countBits(n);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }

    }
}
