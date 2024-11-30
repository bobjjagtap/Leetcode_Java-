import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class leetCode_229 {
    public static ArrayList<Integer> majorityElement(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        HashSet<Integer>set=new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        int count=0;
        for (int  integer : set) {
            count=0;
            for ( int n : nums) {
                if(n==integer){
                    count++;
                }
            }
            if(count>nums.length/3){
                list.add(integer);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int nums[] = { 3, 2, 3 };
        System.out.println(majorityElement(nums));
    }
}