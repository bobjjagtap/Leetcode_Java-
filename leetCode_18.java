import java.util.*;

public class leetCode_18 {
    public static List<List<Integer>> findd(int[] nums,int target){
        Arrays.sort(nums);
        List<List<Integer>> matrix=new ArrayList<>();
        //List<Integer> list=new ArrayList<>();
        List<Integer> row=new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
            int k=j+1;
            int l=nums.length-1;
                while(k<l){
                    long sum=(long)nums[i]+nums[j]+nums[k]+nums[l];
                    if(sum>Integer.MAX_VALUE ){
                        return matrix;
                    }
                    if(sum==target){
                        row.add(nums[i]);
                        row.add(nums[j]);
                        row.add(nums[k]);
                        row.add(nums[l]);
                        if(matrix.contains(row)){
                            
                        }
                        else{
                        matrix.add(new ArrayList<>(row));
                        }
                        row.removeAll(row);
                        k++;
                        l--;
                    }
                    else if(sum<target){
                        k++;
                    }else if(sum>target){
                        l--;
                    }
                }
            }
        }
        return matrix;
    }
    public static void main(String[] args) {
        int[] nums={1000000000,1000000000,1000000000,1000000000,100000000};
        int target=-294967296;
        System.out.println(findd(nums,target));
    }
}
