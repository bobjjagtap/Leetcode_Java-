import java.util.*;
import java.lang.*;
import java.io.*;

class leetcode14 {
    public String longestCommonPrefix(String[] s) {
        if (s.length == 0 || s == null) {
            return " ";
        }
        for (int i = 0; i < s[0].length(); i++) {
            char ch = s[0].charAt(i);
            for (int j = 1; j < s.length; j++) {
                if (i == s[j].length() || s[j].charAt(i) != ch) {
                    return s[0].substring(0, i);

                }

            }

        }
        return s[0];

    }

    public static void main(String args[]) {
        // Your code goes here
        leetcode14 ob = new leetcode14();
        String s[] = { "flower", "fow", "flight" };
        System.out.println(ob.longestCommonPrefix(s));
    }
}