

public class leetcode_28 {
    private static int findd(String haystack, String needle) {
        if (haystack.length() < needle.length()) {
            return -1;
        }
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            int j = 0;
            while (j < needle.length() && haystack.charAt(i + j) == needle.charAt(j))
                j++;
            if (j == needle.length() ) {
                return i;
            }

        }

        return -1;
    }

    public static void main(String[] args) {
        String haystack = "sadbutsad", needle = "tsa";
        System.out.println(findd(haystack, needle));
    }

}
//  int sum = 0, i = 0;
       
//         while (i < needle.length()) {
//             for (int j = 0; j < haystack.length()-1; j++) {
//                 if (haystack.charAt(j) == needle.charAt(i)) {
//                     i++;
                    
//                 }else {
//                     i = 0;   
//                 }
//                 if (i == needle.length() ) {
//                     sum = j - i;
//                     return sum+1;
//                 }
//             }
//         }
        


//         return -1;
//     }
// }
