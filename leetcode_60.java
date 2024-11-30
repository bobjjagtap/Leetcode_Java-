import java.util.ArrayList;

public class leetcode_60 {
    public static String getPermutation(int n, int k) {
        ArrayList<Integer>List=new ArrayList<>();
        StringBuilder s=new StringBuilder();
        int f=1;
        for (int i = 1; i < n; i++) {
            f*=i;
            List.add(i);
        }
        List.add(n);
        k--;
        while (true) {
            s.append(List.get(k/f));
            List.remove(k/f);
            if(List.size()==0){
                break;
            }
            k%=f;
            f/=List.size();
        }
        return s.toString();
    }

    public static void main(String[] args) {
        int n = 4;
        int k = 9;
        System.out.println(getPermutation(3, 3));
    }//
}