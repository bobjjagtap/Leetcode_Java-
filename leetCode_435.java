import java.util.Arrays;
public class leetCode_435 {
    public static int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));
        // for (int i = 0; i < intervals.length; i++) {
        //     for (int j = 0; j < intervals[0].length; j++) {
        //         System.out.print(intervals[i][j]);
        //     }
        //     System.out.println();
        // }
        int prev = 0, count  = 1;
      
      for(int i = 0; i < intervals.length; i ++) {
        System.out.println(intervals[i][0] +"  "+ intervals[prev][1]);
          if(intervals[i][0] >= intervals[prev][1]) {
            
              prev = i;
              count ++;
          }
      }
      System.out.println(count);
      return intervals.length - count;
    }
    public static void main(String[] args) {
        int sort[][]={{1,2},{1,3},{2,3},{3,4}};
        
        System.out.println(eraseOverlapIntervals(sort));
    }
}
