import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leetCode_46 {
    public List<List<Integer>> subsets(int[] nums) {
    List<List<Integer>> list = new ArrayList<>();
    Arrays.sort(nums);
    backtrack(list, new ArrayList<>(), nums, 0);
    return list;
}

private void backtrack(List<List<Integer>> list , List<Integer> tempList, int [] nums, int start){
    list.add(new ArrayList<>(tempList));
    if(start==3){
        return;
    }
    
    for(int i = start; i < nums.length; i++){
        tempList.add(nums[i]);
        System.out.println( tempList);
        backtrack(list, tempList, nums, i + 1);
        tempList.remove(tempList.size() - 1);
    }
}
    public static void main(String[] args) {
        int[] nums={1,2,3};
        leetCode_46 ll=new leetCode_46();
        System.out.println(ll.subsets(nums));
    }
}
