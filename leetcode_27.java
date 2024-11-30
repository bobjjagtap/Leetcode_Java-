public class leetcode_27 {
    public static int findd(int[] nums, int val) {
     int i=0;
     for(int j=0;j<nums.length;j++){
         if(val != nums[j]){
             nums[i]=nums[j];
             i++;
         }
     }
     return i;
    }
    public static void main(String[] args) {
        int nums[]={3,2,2,3}, val = 3;
        System.out.print(findd(nums,val));
    }
    
}
