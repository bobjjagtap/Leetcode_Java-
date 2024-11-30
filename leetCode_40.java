import java.util.*;

public class leetCode_40 {
    List<List<Integer>> list;
    int n;

    public List<List<Integer>> solvee(int[] candidates, int target) {
        list = new ArrayList<>();
       Arrays.sort(candidates);
        List<Integer> temp = new ArrayList<>();
        n = candidates.length;
        solvee(0, candidates, target, temp);
        return list;
    }

    public void solvee(int i, int candidates[], int target, List<Integer> temp) {
        if (i == n) {
            if (list.contains(temp))
                ;
            else if (target == 0)
                list.add(new ArrayList<>(temp));
            return;
        }
        if (candidates[i] <= target) {
            temp.add(candidates[i]);

            solvee(i+1 , candidates, target - candidates[i], temp);
            temp.remove(temp.size() - 1);
        }
        solvee(i + 1, candidates, target, temp);
    }

    public static void main(String[] args) {
        leetCode_40 lc = new leetCode_40();
        int[] candidates = { 10, 1, 2, 7, 6, 1, 5,5,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,};
      
       // int[] candidates={1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
       
        int target = 30;
        System.out.println(lc.solvee(candidates, target));
    }
}
