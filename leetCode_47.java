import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leetCode_47 {
    public static List<List<Integer>> groupAnagrams(int[] nums) {
        List<List<Integer>> matrix=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        List<Integer> row=new ArrayList<>();
        for (int num : nums) {
            list.add(num);
        }
        permutelist(list,row,matrix);
        return matrix;
    }
        public static void permutelist(List<Integer> list, List<Integer> row, List<List<Integer>> matrix) {
            if(list.size()==0){
                if(matrix.contains(row)){
                    return;
                }
                matrix.add(new ArrayList<>(row));
                return;
            }
            for (int i = 0; i < list.size(); i++) {
                List<Integer>copy=new ArrayList<>(list);
                System.out.print(copy.remove(i));
                System.out.println(" is remove "+copy);  
                row.add(list.get(i));
                System.out.println(" add in "+row);
                permutelist(copy, row, matrix);
                row.remove(row.size()-1);
            }
    }
    public static void main(String[] args) {
        int[] nums={1,2};
        System.out.println(groupAnagrams(nums));
       

    }
}
