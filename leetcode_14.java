import java.lang.reflect.Array;
import java.util.Arrays;

public class leetcode_14 {
    private static String findd(String[] str) {
        Arrays.sort(str);
         int i=0;
         String s1=str[0];
         String s2=str[str.length-1];
         while(i<s1.length() && i<s2.length()){
            if(s1.charAt(i)==s2.charAt(i)){
                i++;
            }
            else{
                break;
            }
         }
    
        return s1.substring(0,i);
        }

    public static void main(String[] args) {
        String str[]={"flower","floe","flight"};
        System.out.println(findd(str));
        
        
    }
}
