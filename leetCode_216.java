import java.util.ArrayList;
import java.util.List;

public class leetCode_216 {
    public static ArrayList<ArrayList<Integer>> combinationSum3(int k, int n) {
        int start=1;
        ArrayList<ArrayList<Integer>>result=new ArrayList<>();
        ArrayList<Integer>curr=new ArrayList<>();
        check( start,k, n, result, curr);
        return result;
    }
    public static void check(int start,int k,int n, ArrayList<ArrayList<Integer>>result,ArrayList<Integer>curr) {
        if(k==0 && n==0){
            result.add(new ArrayList<>(curr));
            return;
        }
        if(k==0){
            return;
        }
        for (int j = start; j < 10; ++j) {//insted of start we use 1 to print all of combination in the number
            curr.add(j);
            check(j+1, k-1, n-j, result, curr);
            curr.remove(curr.size()-1);
        }
    }
    public static void main(String[] args) {
        int k=3;
        int n=9;
        System.out.println(combinationSum3(k,n));
    }
}
