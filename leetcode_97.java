import java.util.*;

public class leetcode_97 {

    public static boolean findd(String s1, String s2, String s3) {
        int str1 = s1.length();
        int str2 = s2.length();
        int str3 = s3.length();
        boolean cha = chack(s1, s2, s3, str1, str2, str3, 0, 0, 0, 0);
        return cha;
    }

    public static boolean chack(String s1, String s2, String s3, int str1, int str2, int str3, int i, int j, int k,
            int count) {
        boolean t = true;
        boolean chacker=false;
       
        if(count==2){
            return false;
        }
if(i<str1){
        for (int k2 = i; k2 < str1; k2++) {
            if (s1.charAt(i) == s3.charAt(k)) {
                System.out.println(s1.charAt(i) + "   " + s3.charAt(k));
                i++;
                k++;
                count = 0;
                chacker=true;
            } else {
                chacker=false;
                break;
            }
        }
        }
if(j<str2){
        for (int l = j; l < str2; l++) {
            
            if (s2.charAt(j) == s3.charAt(k)) {
                System.out.println(s2.charAt(j) + "   " + s3.charAt(k));
                j++;
                k++;
                count = 0;
                chacker=true;
            } else
            chacker=false;
                break;
        }
    }
        if(count==1){
            return false;
        }
        chack(s1, s2, s3, str1, str2, str3, i, j, k, count + 1);
        return chacker;
    }

    public static void main(String[] args) {
        String s1 = "aabcc", s2 = "dbbca", s3 = "aabdbbccc";
        // StringBuffer jay=new StringBuffer("");

        System.out.println(findd(s1, s2, s3));
    }
}
// if(s1.length()+s2.length()!= s3.length()){
// return false;
// }
// s1+=s2;
// char[] c1=s1.toCharArray();
// char[] c2=s3.toCharArray();
// Arrays.sort(c1);
// Arrays.sort(c2);
// for (int i = 0; i < c2.length; i++) {
// if(c1[i]==c2[i]){
// System.out.println(c1[i]+" "+c2[i]);
// }else{
// return false;
// }
// }
// return true;