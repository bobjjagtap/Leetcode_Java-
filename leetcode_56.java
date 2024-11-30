import java.util.Arrays;
import java.util.ArrayList;

public class leetcode_56 {
    public static void findd(int intervals[][]) {
      ArrayList<Integer>List=new ArrayList<>();
      Arrays.sort(intervals,(a,b)->a[0]-b[0]);
      List.add(intervals[0][0]);
     
        for (int i = 1; i < intervals.length; i++) {
            // System.out.println(intervals[i-1][1]);
            // System.out.println(intervals[i][0]);
            if(intervals[i-1][1]<intervals[i][0]){
                List.add(intervals[i-1][1]);
                List.add(intervals[i][0]);

            }
        }
        List.add(intervals[intervals.length-1][1]);
        int count=0;
        int list[][]=new int[List.size()/2][2];
        for (int i = 0; i < list.length; i++) {
            for (int k = 0; k < list[0].length; k++) {
            if(count==List.size())break;
            list[i][k]=List.get(count);
            count++;
            }
        }
        for (int i = 0; i < list.length; i++) {
            for (int l = 0; l < list[0].length; l++) {
                System.out.println(list[i][l]);
            }
        }
    }
    public static void main(String[] args) {
        int intervals[][] = {{1,3},{0,3}};
     findd(intervals);
    //  System.out.println(intervals[0][0]);
    //  System.out.println(intervals[0][1]);
    //  System.out.println(intervals[1][0]);
    //  System.out.println(intervals[1][1]);
    //  System.out.println(intervals[2][0]);
    //  System.out.println(intervals[2][1]);
    //  System.out.println(intervals[3][0]);
    //  System.out.println(intervals[3][1]);
     
    
    }
}
