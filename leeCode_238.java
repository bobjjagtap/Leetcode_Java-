public class leeCode_238 {
    public static int[] productExceptSelf(int[] nums) {
        int res[]=new int[nums.length];
        int countZero=0;
        int Multiplay=1;
        for(int n:nums){
            if(n==0){
                countZero++;
            }else{
                Multiplay*=n;
            }
        }
        if(countZero==0){
            for(int i=0;i<nums.length;i++){
                res[i]=Multiplay/nums[i];
            }
        }else if(countZero==1){
            for(int i=0;i<nums.length;i++){
                if(nums[i]==0)
                res[i]=Multiplay;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int nums[]={-1,1,0,-3,3};
        nums=productExceptSelf(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+"->");
        }
    }
}
