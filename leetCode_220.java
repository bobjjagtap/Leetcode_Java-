public class leetCode_220{
    public static boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
        int j=0;
         for (int i = indexDiff; i < nums.length; i++) {
        if(nums[j]-nums[indexDiff]==valueDiff){
            return true;
        }
        j++;
    }
    return false;
    }
public static void main(String[] args) {
    int nums[]={1,0,1,1};
    int indexDiff = 1, valueDiff = 2;
    System.out.println(containsNearbyAlmostDuplicate(nums,indexDiff, valueDiff));
    
}
}