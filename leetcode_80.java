public class leetcode_80 {
    public static int removee(int nums[]) {
        int sum=0,k=1;
        
            for (int i=1; i < nums.length; i++) {
                if(nums[i]==nums[i-1]){
                    sum++;
                }else{
                    sum=0;
                }if(sum<=1){
                    nums[k]=nums[i];
                    k++;
                }
            }
        return k;
    }
    public static void main(String[] args) {
        int nums[]={1,1,1,2,2,3};
        System.out.println(removee(nums));
    }
    
}
