import java.util.*;

public class leetCode_15 {
     public static ArrayList<List<Integer>> ThreeSum(int[] nums) {
        Arrays.sort(nums);
        ArrayList<List<Integer>> list=new ArrayList<>();
        Set<List<Integer>> list2=new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            int j=i+1;
            int k=nums.length-1;
            while(j<k){
                int sum=nums[i]+nums[j]+nums[k];
                    if(sum==0){
                        list2.add(Arrays.asList(nums[i],nums[j],nums[k]));   
                        j++;
                        k--;
                    }else if(sum<0){
                        j++;
                    }
                    else{
                        k--;
                    }
            }
        }
        list.addAll(list2);
        return list;
     }
    public static void main(String[] args) {
         int[] nums={-1,0,1,2,-1,-4};
         //-4,-1,-1,0,1,2
        //  ArrayList<ArrayList<Integer>> x= new ArrayList<ArrayList<Integer> >();
        //  x.add(new ArrayList<Integer>(Arrays.asList(3, 4, 6)));
       System.out.println(ThreeSum(nums));

    }
}
