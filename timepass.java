public class timepass {
    public static String solvee(int[] nums,int target) {
        for (int i = 0; i < nums.length; i++) {
            int j=i+1;
            int k=nums.length-1;
            while(j<k){
                int sum=nums[i]+nums[j]+nums[k];
                if(sum==target){
                    System.out.println(i+" "+j+" "+k);
                    return "found";
                }
                else if(sum<target){
                    j++;
                }else if(sum>target){
                    k--;
                }
            }
        }
        return "no combination in seq";

    }
   
    public static void main(String[] args) {
        int nums[]={2,6,10,14,18,22,26,30,34,38,42,46,50,58};
        int target=62;
        System.out.println(solvee(nums,target));
    }
}
