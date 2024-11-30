public class leetcode_29 {
    public static int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1)return Integer.MAX_VALUE; 
        return dividend/divisor;
    }
    public static void main(String[] args) {
        int  dividend=-2147483648;//-2147483648
        int divisor =-1;
        System.out.println(divide(dividend,divisor ));
    }
}
