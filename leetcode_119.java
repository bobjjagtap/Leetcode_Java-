//Pascal's Triangle II
/*
       1
      1 1
     1 2 1
    1 3 3 1
   1 4 6 4 1  
 */

import java.util.ArrayList;

public class leetcode_119 {
    public static ArrayList<Integer> Pascal(int Indexrow){
        ArrayList<Integer>list=new ArrayList<>();
        long prev=1;
        list.add(1);
        for (int i = 1; i <= Indexrow; i++) {
            long n=prev*(Indexrow-i+1)/i;
            list.add((int)n);
            prev=n;
        }
        return list;
    }
    public static void main(String[] args) {
        int Indexrow=5;
        System.out.println(Pascal(Indexrow));
    }
}
