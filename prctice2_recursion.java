public class prctice2_recursion {
    static String array[] = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };

    public static void findd(int n) {
        if (n == 0) {
            return;
        }
        int a = n % 10;
        System.out.println(array[a] + " ");//for reverse print
        findd(n / 10);
        System.out.println(array[a] + " ");//for stright print  

    }

    public static void main(String[] args) {
        int n = 20180;
        findd(n);
    }

}
