import java.util.Arrays;
import java.util.Collections;

public class leetCode_179 {
    public static String largestNumber(int[] nums) {
        String str = Arrays.toString(nums).replaceAll("\\s+", "");
        String[] strArray = str.substring(1, str.length() - 1).split(",");
        Arrays.sort(strArray,(a,b)->(a+b).compareTo(b+a));//(a,b)-> declear in run time  and a="3" and b="30" (a+b)=3+30=330 is compare to (b+a)=30+3=303
        str="";
        for (int i=strArray.length-1;i>=0;i-- ) {
            str+=strArray[i];
        }
        return str;
    }

    public static void main(String[] args) {
        int nums[] = { 3, 30, 34, 5, 9 };
        System.out.println(largestNumber(nums));
    }
}
