/*
343. Integer Break
Given an integer n, break it into the sum of k positive integers, where k >= 2, and maximize the product of those integers.

Return the maximum product you can get.

 

Example 1:

Input: n = 2
Output: 1
Explanation: 2 = 1 + 1, 1 × 1 = 1.
Example 2:

Input: n = 10
Output: 36
Explanation: 10 = 3 + 3 + 4, 3 × 3 × 4 = 36.
*/
public class leetCode_343 {
    public static int integerBreak(int n) {
        if(n<=3)return n-1;
        int quotient=n/3,remainder=n%3;
        return remainder==0 ? (int) Math.pow(3,quotient) : (remainder==1 ? (int)Math.pow(3,quotient-1)*4 : (int)Math.pow(3,quotient)*2);
    }
    public static void main(String[] args) {
        int n=20;
        System.out.println(integerBreak(n));
    }
}
