import java.util.*;
public class leetCode_39 {
     int n;
     List<List<Integer>> list;
     public List<List<Integer>> comb(int candidates[],int target){
     list=new ArrayList<>();
     Arrays.sort(candidates);
     List<Integer> temp=new ArrayList<>();
     n=candidates.length;
     solvee(0,candidates,target,temp);
     return list;
 }
 public void solvee(int i,int candidates[],int target,List<Integer> temp){
     if(i==n){
         if(target==0){
             list.add(new ArrayList<>(temp));
         }
         return;
     }
     if(candidates[i]<=target){
         temp.add(candidates[i]);
         solvee(i+1, candidates, target-candidates[i], temp);
         temp.remove(temp.size()-1);
     }
     solvee(i+1,candidates, target, temp);
 }
    public static void main(String[] args) {
        int[] candidates={10,1,2,7,6,1,5};
        leetCode_39 lc=new leetCode_39();
        int target=8;
        System.out.println(lc.comb(candidates,target));
        
    }
}
