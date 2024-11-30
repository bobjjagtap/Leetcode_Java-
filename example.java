// import java.util.Arrays;
// import java.util.*;

 public class example {
//     public static boolean ex(int s, int array[], int sum) {

//         int k = 0;
//         if (0 == array.length % s) {
//             Arrays.sort(array);
//             for (int i = 0; i < sum; i++) {
//                 int c = 0;
//                 for (int j = k; j < array.length; j++) {
                    
//                     if (c == 3) {
//                         break;
//                     }
//                     System.out.print("[" + array[j] + "]");
//                     k = j + 1;
//                     c++;
                    
//                 }
//                 System.out.println();
//             }
//             return true;
//         }
//         // else{
//             return false;
//        // }
//     }
    

    public static void main(String[] args) {
        //int n = 9;
        int s = 3;
        // int array[]=new int[];
        int array[] = new int[] { 1, 2, 3, 6, 2, 3, 4, 7,5 };
        int sum = array.length / s;
        //ex(s, array, sum);
    }
}
