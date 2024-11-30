import java.util.ArrayList;
import java.util.List;

public class leetCode_22 {
    public  void paran(List<String> list,int left,int right,String s,int n){
        if(s.length()==n*2){
            list.add(s);
            return;
        }
        if(left<n){
            paran(list, left+1, right, s+"(", n);
        }
        if(right<left){
            paran(list, left, right+1, s+")", n);
        }
    }
    public List<String> paranthesis(int n) {
        List<String> list=new ArrayList<>();
        paran(list,0,0,"",n);
        return list;
    }
    public static void main(String[] args) {
        int n=3;
        leetCode_22 lc=new leetCode_22();
        System.out.println(lc.paranthesis(n));
    }
}
