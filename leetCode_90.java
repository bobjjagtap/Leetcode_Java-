import java.util.*;

public class leetCode_90 {
    public static List<List<Integer>> solvee(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> copy = new ArrayList<>();
        //list.add(new ArrayList<>(copy));
        backtrack(list, nums, 0, copy);
        return list;


    }

    public static void backtrack(List<List<Integer>> list, int[] nums, int i, List<Integer> copy) {
        if(i==nums.length){
            return;
        }
        for (; i < nums.length; i++) {
            copy.add(nums[i]);
            if(list.contains(copy)){

            }else{
            list.add(new ArrayList<>(copy));
            }
            backtrack(list, nums, i+1, copy);
            copy.remove(copy.size()-1);
        }
        
    }

    public static void main(String[] args) {
        int[] nums = { 4, 4, 4, 1, 4};
        System.out.println(solvee(nums));
    }
}
