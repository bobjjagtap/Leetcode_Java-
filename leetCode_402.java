import java.util.ArrayList;
import java.util.Stack;
import java.util.*;

public class leetCode_402 {
    public String removeKdigits(String num, int k) {
        Stack<Character>stack=new Stack<>();
        for (char digit : num.toCharArray()) {
            while(!stack.isEmpty() && k>0 && stack.peek()>digit) {
                stack.pop();
                k--;
            }
            stack.push(digit);
        }
        while (k>0 && !stack.isEmpty()) {
            stack.pop();
            k--;
        }
        StringBuilder sb=new StringBuilder();
        while (!stack.empty()) {
            sb.append(stack.pop());
        }
        sb.reverse();
        while (sb.length() > 0 && sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
        }
        return sb.length()>0?sb.toString():"0";
    }
    public static void main(String[] args) {
        leetCode_402 lc=new leetCode_402();
        String num="10200";
       int k=1;
       System.out.println(lc.removeKdigits( num,k));
    }
}
