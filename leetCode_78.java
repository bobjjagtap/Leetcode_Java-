import java.util.*;
public class leetCode_78 {
    public static List<List<Integer>> solvee(int nums[]){
        List<List<Integer>> list=new ArrayList<>();
        List<Integer> copy=new ArrayList<>();
        backtrack(nums,0,copy,list);
        return list;
    }
    public static void backtrack(int nums[],int index,List<Integer> copy,List<List<Integer>> list){
        if(list.contains(copy)){

        }else{   
        list.add(new ArrayList<>(copy));
        }
    for(; index < nums.length; index++){
        copy.add(nums[index]);
        backtrack( nums, index+1, copy, list);
        copy.remove(copy.size() - 1);
    }
        
    }
    public static void main(String[] args) {
        int nums[]={1,2,3,4};
        System.out.println(solvee(nums));
    }
}
