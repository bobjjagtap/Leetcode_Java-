import java.util.ArrayList;
import java.util.Arrays;

public class leetCode_51 {
    public static ArrayList<ArrayList<String>> solveNQueens(int n) {
        ArrayList<ArrayList<String>> list=new ArrayList<>(n);
        safe(list,n);
        return list;
    }
    public static void safe(ArrayList<ArrayList<String>> list,int row) {
        if(row==list.size()){
            printbord(list);
            //return;
        }
        for (int i = 0; i < list.size(); i++) {
            if(issafe(list,row,i)){
            list.get(row)add(i,Arrays.asList("q"));
            safe(list, row+1);
            list.get(row)add(i,Arrays.asList("X"));
            }
        }
        return;
    }
    public static void main(String[] args) {
        int row=4;
        System.out.println(solveNQueens(row));
    }
}
