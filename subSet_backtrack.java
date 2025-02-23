import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class subSet_backtrack {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(list, new ArrayList<>(), nums);
        return list;
    }

    private void backtrack(List<List<Integer>> list, List<Integer> tempList, int[] nums) {
        if (tempList.size() == nums.length) {
            list.add(new ArrayList<>(tempList));
        } else {
            for (int i = 0; i < nums.length; i++) {
                if (tempList.contains(nums[i]))continue; // element already exists, skip
                tempList.add(nums[i]);
                
                backtrack(list, tempList, nums);
                tempList.remove(tempList.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 9 };
        subSet_backtrack ll = new subSet_backtrack();
        System.out.println(ll.subsets(nums));
    }
}
