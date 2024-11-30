import java.util.*;
import java.util.Arrays;

public class rugf {
    // static int arr[]=new int[12];
    // public static int ugly(int n,int []primes) {
    // int k=1,l=1,o=0;
    // while(arr.length){
    // check(k,l,o,arr,primes);
    // k++;
    // l++;
    // }
    // return arr[n];
    // }
    // public static void check(int k,int l,int o,int []arr,int []primes) {
    // if(k==1 && k==0){
    // arr[o]=l;
    // o++;
    // }
    // for (int i = 0; i < primes.length; i++) {
    // if(k%primes[i]==0){

    // check(k/primes[i],l,o,arr, primes);
    // }
    // }
    // }

    // public static void main(String[] args) {
    // int n = 12; int primes[] = {1,2,7,13,19};
    // System.out.println(ugly(n,primes));

    // }

    public static String toggleChars(String str) {
        String ans = "";
        // for (int i = 0; i < str.length(); i++) {
        // if('a'<=str.charAt(i) && 'z'>=str.charAt(i)){
        // ans+=String.valueOf(str.charAt(i));
        // }else{
        // ans+="_";
        // ans+=String.valueOf(Character.toLowerCase(str.charAt(i)));
        // }
        // }
        // return ans;

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0, j = 1; i < str.length() - 1 && j < str.length();) {
            if (str.charAt(i) == str.charAt(j)) {
                list.add(i);
                list.add(j);
                i += 2;
                j += 2;
            } else {
                i++;
                j++;
            }
        }
        int j = 0;
        for (int i = 0; i < str.length(); i++) {
            if (i == list.get(j)) {
                ans += "_";
                if (j < list.size()-1) {
                    j++;
                }
            } else {
                ans += str.charAt(i);
            }
        }
        return ans;
    }

    // Driver code
    public static void main(String[] args) {
        System.out.println(toggleChars("limitless"));
    }
}