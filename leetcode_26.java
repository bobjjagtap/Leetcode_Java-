public class leetcode_26 {
    private static int findd(int nums[]) {
int i=0;
for (int j = 0; j < nums.length; j++) {
    if(nums[i]!=nums[j]){
        nums[i]=nums[j];
        i++;
        
    }
}
        return i+1;
    }
    public static void main(String[] args) {
        int nums[]={1,2};
        System.out.println(findd(nums));
        // for (int i = 0; i < nums.length; i++) {
        //     System.out.println(nums[i]);
        // }
    }
}
